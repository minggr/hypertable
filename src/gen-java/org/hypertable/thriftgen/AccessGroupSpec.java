/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.hypertable.thriftgen;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * Describes an AccessGroup
 * <dl>
 *   <dt>name</dt>
 *   <dd>Name of the access group</dd>
 * 
 *   <dt>in_memory</dt>
 *   <dd>Is this access group in memory</dd>
 * 
 *   <dt>replication</dt>
 *   <dd>Replication factor for this AG</dd>
 * 
 *   <dt>blocksize</dt>
 *   <dd>Specifies blocksize for this AG</dd>
 * 
 *   <dt>compressor</dt>
 *   <dd>Specifies compressor for this AG</dd>
 * 
 *   <dt>bloom_filter</dt>
 *   <dd>Specifies bloom filter type</dd>
 * 
 *   <dt>columns</dt>
 *   <dd>Specifies list of column families in this AG</dd>
 * </dl>
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-6-15")
public class AccessGroupSpec implements org.apache.thrift.TBase<AccessGroupSpec, AccessGroupSpec._Fields>, java.io.Serializable, Cloneable, Comparable<AccessGroupSpec> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AccessGroupSpec");

  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField GENERATION_FIELD_DESC = new org.apache.thrift.protocol.TField("generation", org.apache.thrift.protocol.TType.I64, (short)2);
  private static final org.apache.thrift.protocol.TField OPTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("options", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField DEFAULTS_FIELD_DESC = new org.apache.thrift.protocol.TField("defaults", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AccessGroupSpecStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AccessGroupSpecTupleSchemeFactory());
  }

  public String name; // required
  public long generation; // optional
  public AccessGroupOptions options; // optional
  public ColumnFamilyOptions defaults; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NAME((short)1, "name"),
    GENERATION((short)2, "generation"),
    OPTIONS((short)3, "options"),
    DEFAULTS((short)4, "defaults");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // GENERATION
          return GENERATION;
        case 3: // OPTIONS
          return OPTIONS;
        case 4: // DEFAULTS
          return DEFAULTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __GENERATION_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.GENERATION,_Fields.OPTIONS,_Fields.DEFAULTS};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.GENERATION, new org.apache.thrift.meta_data.FieldMetaData("generation", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.OPTIONS, new org.apache.thrift.meta_data.FieldMetaData("options", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AccessGroupOptions.class)));
    tmpMap.put(_Fields.DEFAULTS, new org.apache.thrift.meta_data.FieldMetaData("defaults", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ColumnFamilyOptions.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AccessGroupSpec.class, metaDataMap);
  }

  public AccessGroupSpec() {
  }

  public AccessGroupSpec(
    String name)
  {
    this();
    this.name = name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AccessGroupSpec(AccessGroupSpec other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetName()) {
      this.name = other.name;
    }
    this.generation = other.generation;
    if (other.isSetOptions()) {
      this.options = new AccessGroupOptions(other.options);
    }
    if (other.isSetDefaults()) {
      this.defaults = new ColumnFamilyOptions(other.defaults);
    }
  }

  public AccessGroupSpec deepCopy() {
    return new AccessGroupSpec(this);
  }

  @Override
  public void clear() {
    this.name = null;
    setGenerationIsSet(false);
    this.generation = 0;
    this.options = null;
    this.defaults = null;
  }

  public String getName() {
    return this.name;
  }

  public AccessGroupSpec setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public long getGeneration() {
    return this.generation;
  }

  public AccessGroupSpec setGeneration(long generation) {
    this.generation = generation;
    setGenerationIsSet(true);
    return this;
  }

  public void unsetGeneration() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GENERATION_ISSET_ID);
  }

  /** Returns true if field generation is set (has been assigned a value) and false otherwise */
  public boolean isSetGeneration() {
    return EncodingUtils.testBit(__isset_bitfield, __GENERATION_ISSET_ID);
  }

  public void setGenerationIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GENERATION_ISSET_ID, value);
  }

  public AccessGroupOptions getOptions() {
    return this.options;
  }

  public AccessGroupSpec setOptions(AccessGroupOptions options) {
    this.options = options;
    return this;
  }

  public void unsetOptions() {
    this.options = null;
  }

  /** Returns true if field options is set (has been assigned a value) and false otherwise */
  public boolean isSetOptions() {
    return this.options != null;
  }

  public void setOptionsIsSet(boolean value) {
    if (!value) {
      this.options = null;
    }
  }

  public ColumnFamilyOptions getDefaults() {
    return this.defaults;
  }

  public AccessGroupSpec setDefaults(ColumnFamilyOptions defaults) {
    this.defaults = defaults;
    return this;
  }

  public void unsetDefaults() {
    this.defaults = null;
  }

  /** Returns true if field defaults is set (has been assigned a value) and false otherwise */
  public boolean isSetDefaults() {
    return this.defaults != null;
  }

  public void setDefaultsIsSet(boolean value) {
    if (!value) {
      this.defaults = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case GENERATION:
      if (value == null) {
        unsetGeneration();
      } else {
        setGeneration((Long)value);
      }
      break;

    case OPTIONS:
      if (value == null) {
        unsetOptions();
      } else {
        setOptions((AccessGroupOptions)value);
      }
      break;

    case DEFAULTS:
      if (value == null) {
        unsetDefaults();
      } else {
        setDefaults((ColumnFamilyOptions)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case GENERATION:
      return Long.valueOf(getGeneration());

    case OPTIONS:
      return getOptions();

    case DEFAULTS:
      return getDefaults();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case GENERATION:
      return isSetGeneration();
    case OPTIONS:
      return isSetOptions();
    case DEFAULTS:
      return isSetDefaults();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AccessGroupSpec)
      return this.equals((AccessGroupSpec)that);
    return false;
  }

  public boolean equals(AccessGroupSpec that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_generation = true && this.isSetGeneration();
    boolean that_present_generation = true && that.isSetGeneration();
    if (this_present_generation || that_present_generation) {
      if (!(this_present_generation && that_present_generation))
        return false;
      if (this.generation != that.generation)
        return false;
    }

    boolean this_present_options = true && this.isSetOptions();
    boolean that_present_options = true && that.isSetOptions();
    if (this_present_options || that_present_options) {
      if (!(this_present_options && that_present_options))
        return false;
      if (!this.options.equals(that.options))
        return false;
    }

    boolean this_present_defaults = true && this.isSetDefaults();
    boolean that_present_defaults = true && that.isSetDefaults();
    if (this_present_defaults || that_present_defaults) {
      if (!(this_present_defaults && that_present_defaults))
        return false;
      if (!this.defaults.equals(that.defaults))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_name = true && (isSetName());
    list.add(present_name);
    if (present_name)
      list.add(name);

    boolean present_generation = true && (isSetGeneration());
    list.add(present_generation);
    if (present_generation)
      list.add(generation);

    boolean present_options = true && (isSetOptions());
    list.add(present_options);
    if (present_options)
      list.add(options);

    boolean present_defaults = true && (isSetDefaults());
    list.add(present_defaults);
    if (present_defaults)
      list.add(defaults);

    return list.hashCode();
  }

  @Override
  public int compareTo(AccessGroupSpec other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGeneration()).compareTo(other.isSetGeneration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGeneration()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.generation, other.generation);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOptions()).compareTo(other.isSetOptions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOptions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.options, other.options);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDefaults()).compareTo(other.isSetDefaults());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDefaults()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.defaults, other.defaults);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("AccessGroupSpec(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (isSetGeneration()) {
      if (!first) sb.append(", ");
      sb.append("generation:");
      sb.append(this.generation);
      first = false;
    }
    if (isSetOptions()) {
      if (!first) sb.append(", ");
      sb.append("options:");
      if (this.options == null) {
        sb.append("null");
      } else {
        sb.append(this.options);
      }
      first = false;
    }
    if (isSetDefaults()) {
      if (!first) sb.append(", ");
      sb.append("defaults:");
      if (this.defaults == null) {
        sb.append("null");
      } else {
        sb.append(this.defaults);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (options != null) {
      options.validate();
    }
    if (defaults != null) {
      defaults.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AccessGroupSpecStandardSchemeFactory implements SchemeFactory {
    public AccessGroupSpecStandardScheme getScheme() {
      return new AccessGroupSpecStandardScheme();
    }
  }

  private static class AccessGroupSpecStandardScheme extends StandardScheme<AccessGroupSpec> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AccessGroupSpec struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // GENERATION
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.generation = iprot.readI64();
              struct.setGenerationIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // OPTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.options = new AccessGroupOptions();
              struct.options.read(iprot);
              struct.setOptionsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DEFAULTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.defaults = new ColumnFamilyOptions();
              struct.defaults.read(iprot);
              struct.setDefaultsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, AccessGroupSpec struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.isSetGeneration()) {
        oprot.writeFieldBegin(GENERATION_FIELD_DESC);
        oprot.writeI64(struct.generation);
        oprot.writeFieldEnd();
      }
      if (struct.options != null) {
        if (struct.isSetOptions()) {
          oprot.writeFieldBegin(OPTIONS_FIELD_DESC);
          struct.options.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.defaults != null) {
        if (struct.isSetDefaults()) {
          oprot.writeFieldBegin(DEFAULTS_FIELD_DESC);
          struct.defaults.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AccessGroupSpecTupleSchemeFactory implements SchemeFactory {
    public AccessGroupSpecTupleScheme getScheme() {
      return new AccessGroupSpecTupleScheme();
    }
  }

  private static class AccessGroupSpecTupleScheme extends TupleScheme<AccessGroupSpec> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AccessGroupSpec struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetName()) {
        optionals.set(0);
      }
      if (struct.isSetGeneration()) {
        optionals.set(1);
      }
      if (struct.isSetOptions()) {
        optionals.set(2);
      }
      if (struct.isSetDefaults()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetGeneration()) {
        oprot.writeI64(struct.generation);
      }
      if (struct.isSetOptions()) {
        struct.options.write(oprot);
      }
      if (struct.isSetDefaults()) {
        struct.defaults.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AccessGroupSpec struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.generation = iprot.readI64();
        struct.setGenerationIsSet(true);
      }
      if (incoming.get(2)) {
        struct.options = new AccessGroupOptions();
        struct.options.read(iprot);
        struct.setOptionsIsSet(true);
      }
      if (incoming.get(3)) {
        struct.defaults = new ColumnFamilyOptions();
        struct.defaults.read(iprot);
        struct.setDefaultsIsSet(true);
      }
    }
  }

}
