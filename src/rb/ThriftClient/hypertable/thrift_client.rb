# include path hack
$:.push(File.dirname(__FILE__) + '/gen-rb')

require 'thrift'
require 'thrift/protocol/binary_protocol_accelerated'
require 'hql_service'

module Hypertable
  class ThriftClient < ThriftGen::HqlService::Client
    def initialize(host, port, timeout_ms = 300000, do_open = true)
      socket = Thrift::Socket.new(host, port, timeout_ms)
      @transport = Thrift::FramedTransport.new(socket)
      protocol = Thrift::BinaryProtocolAccelerated.new(@transport)
      super(protocol)
      open() if do_open
    end

    def open()
      @transport.open()
      @do_close = true
    end

    def close()
      @transport.close() if @do_close
    end

    # more convenience methods
    def with_future(queue_size = 0)
      future = open_future(queue_size)
      begin
        yield future 
      ensure
        close_future(future)
      end
    end

    def with_scanner(namespace, table, scan_spec)
      scanner = open_scanner(namespace, table, scan_spec)
      begin
        yield scanner
      ensure
        close_scanner(scanner)
      end
    end

    def with_mutator(namespace, table)
      mutator = open_mutator(namespace, table, 0, 0);
      begin
        yield mutator
      ensure
        close_mutator(mutator)
      end
    end

    # scanner iterator
    def each_cell(scanner)
      cells = next_cells(scanner);

      while (cells.size > 0)
        cells.each {|cell| yield cell}
        cells = next_cells(scanner);
      end
    end
  end

  def self.with_thrift_client(host, port, timeout_ms = 20000)
    client = ThriftClient.new(host, port, timeout_ms)
    begin
      yield client
    ensure
      client.close()
    end
  end

  module ThriftGen
    class Key
      def to_s
        "{Key row=%s column_family=%s column_qualifier=%s flag=%s}" %
          [row, column_family, column_qualifier, flag]
      end
    end
    class Cell
      def to_s
        "{Cell key=%s value=%s}" % [key, value]
      end
    end
  end

end
