/* -*- c++ -*-
 * Copyright (C) 2007-2016 Hypertable, Inc.
 *
 * This file is part of Hypertable.
 *
 * Hypertable is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or any later version.
 *
 * Hypertable is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

/// @file
/// Declarations for DropNamespace request parameters.
/// This file contains declarations for DropNamespace, a class for encoding and
/// decoding paramters to the <i>drop namespace</i> %Master operation.

#ifndef Hypertable_Lib_Master_Request_Parameters_DropNamespace_h
#define Hypertable_Lib_Master_Request_Parameters_DropNamespace_h

#include <Common/Serializable.h>

#include <string>

using namespace std;

namespace Hypertable {
namespace Lib {
namespace Master {
namespace Request {
namespace Parameters {

  /// @addtogroup libHypertableMasterRequestParameters
  /// @{

  /// %Request parameters for <i>drop namespace</i> operation.
  class DropNamespace : public Serializable {
  public:

    /// Constructor.
    /// Empty initialization for decoding.
    DropNamespace() {}

    /// Constructor.
    /// Initializes with parameters for encoding.  Sets #m_name to
    /// <code>name</code> and #m_flags to <code>flags</code>.
    /// @param name Name of namespace to drop
    /// @param flags Drop flags (see NamespaceFlag)
    DropNamespace(const std::string &name, int32_t flags);

    /// Gets name of namespace to drop.
    /// @return Name of namespace to drop
    const string& name() const { return m_name; }

    /// Gets drop flags
    /// @return Drop flags
    int32_t flags() { return m_flags; }

  private:

    /// Returns encoding version.
    /// @return Encoding version
    uint8_t encoding_version() const override;

    /// Returns internal serialized length.
    /// @return Internal serialized length
    /// @see encode_internal() for encoding format
    size_t encoded_length_internal() const override;

    /// Writes serialized representation of object to a buffer.
    /// @param bufp Address of destination buffer pointer (advanced by call)
    void encode_internal(uint8_t **bufp) const override;

    /// Reads serialized representation of object from a buffer.
    /// @param version Encoding version
    /// @param bufp Address of destination buffer pointer (advanced by call)
    /// @param remainp Address of integer holding amount of serialized object
    /// remaining
    /// @see encode_internal() for encoding format
    void decode_internal(uint8_t version, const uint8_t **bufp,
			 size_t *remainp) override;

    /// Name of namespace to drop
    std::string m_name;

    /// Drop flags (see NamespaceFlag)
    int32_t m_flags {};
  };

  /// @}

}}}}}

#endif // Hypertable_Lib_Master_Request_Parameters_DropNamespace_h
