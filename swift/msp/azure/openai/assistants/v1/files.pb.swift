// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: msp/azure/openai/assistants/v1/files.proto
//
// For information on using the generated types, please see the documentation:
//   https://github.com/apple/swift-protobuf/

import Foundation
import SwiftProtobuf

// If the compiler emits an error on this type, it is because this file
// was generated by a version of the `protoc` Swift plug-in that is
// incompatible with the version of SwiftProtobuf to which you are linking.
// Please ensure that you are building against the same version of the API
// that was used to generate this file.
fileprivate struct _GeneratedWithProtocGenSwiftVersion: SwiftProtobuf.ProtobufAPIVersionCheck {
  struct _2: SwiftProtobuf.ProtobufAPIVersion_2 {}
  typealias Version = _2
}

public struct Msp_Azure_Openai_Assistants_V1_CreateAssistantFileRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var fileID: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Msp_Azure_Openai_Assistants_V1_AssistantFile {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var id: String = String()

  public var object: String = String()

  public var createdAt: UInt64 = 0

  public var assistantID: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Msp_Azure_Openai_Assistants_V1_CreateAssistantFileRequest: @unchecked Sendable {}
extension Msp_Azure_Openai_Assistants_V1_AssistantFile: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "msp.azure.openai.assistants.v1"

extension Msp_Azure_Openai_Assistants_V1_CreateAssistantFileRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".CreateAssistantFileRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "file_id"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.fileID) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.fileID.isEmpty {
      try visitor.visitSingularStringField(value: self.fileID, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Msp_Azure_Openai_Assistants_V1_CreateAssistantFileRequest, rhs: Msp_Azure_Openai_Assistants_V1_CreateAssistantFileRequest) -> Bool {
    if lhs.fileID != rhs.fileID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Msp_Azure_Openai_Assistants_V1_AssistantFile: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".AssistantFile"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "object"),
    3: .standard(proto: "created_at"),
    4: .standard(proto: "assistant_id"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.object) }()
      case 3: try { try decoder.decodeSingularUInt64Field(value: &self.createdAt) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.assistantID) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.object.isEmpty {
      try visitor.visitSingularStringField(value: self.object, fieldNumber: 2)
    }
    if self.createdAt != 0 {
      try visitor.visitSingularUInt64Field(value: self.createdAt, fieldNumber: 3)
    }
    if !self.assistantID.isEmpty {
      try visitor.visitSingularStringField(value: self.assistantID, fieldNumber: 4)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Msp_Azure_Openai_Assistants_V1_AssistantFile, rhs: Msp_Azure_Openai_Assistants_V1_AssistantFile) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.object != rhs.object {return false}
    if lhs.createdAt != rhs.createdAt {return false}
    if lhs.assistantID != rhs.assistantID {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}