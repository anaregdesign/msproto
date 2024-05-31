// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: msp/azure/openai/assistants/v1/assistants.proto
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

public struct Msp_Azure_Openai_Assistants_V1_Tool {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var type: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Msp_Azure_Openai_Assistants_V1_Assistant {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var id: String = String()

  public var object: String = String()

  public var createdAt: UInt64 = 0

  public var name: String = String()

  public var description_p: String = String()

  public var model: String = String()

  public var instruction: String = String()

  public var tools: [Msp_Azure_Openai_Assistants_V1_Tool] = []

  public var fileIds: [String] = []

  public var metadata: Dictionary<String,String> = [:]

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Msp_Azure_Openai_Assistants_V1_CreateAssistantRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var model: String = String()

  public var name: String = String()

  public var description_p: String = String()

  public var instruction: String = String()

  public var tools: [Msp_Azure_Openai_Assistants_V1_Tool] = []

  public var fileIds: [String] = []

  public var metadata: Dictionary<String,String> = [:]

  public var temperature: Float = 0

  public var topP: Float = 0

  public var responseFormat: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Msp_Azure_Openai_Assistants_V1_ModifyAssistantRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var name: String = String()

  public var description_p: String = String()

  public var instruction: String = String()

  public var tools: [Msp_Azure_Openai_Assistants_V1_Tool] = []

  public var fileIds: [String] = []

  public var metadata: Dictionary<String,String> = [:]

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Msp_Azure_Openai_Assistants_V1_Tool: @unchecked Sendable {}
extension Msp_Azure_Openai_Assistants_V1_Assistant: @unchecked Sendable {}
extension Msp_Azure_Openai_Assistants_V1_CreateAssistantRequest: @unchecked Sendable {}
extension Msp_Azure_Openai_Assistants_V1_ModifyAssistantRequest: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "msp.azure.openai.assistants.v1"

extension Msp_Azure_Openai_Assistants_V1_Tool: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".Tool"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "type"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.type) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.type.isEmpty {
      try visitor.visitSingularStringField(value: self.type, fieldNumber: 1)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Msp_Azure_Openai_Assistants_V1_Tool, rhs: Msp_Azure_Openai_Assistants_V1_Tool) -> Bool {
    if lhs.type != rhs.type {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Msp_Azure_Openai_Assistants_V1_Assistant: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".Assistant"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "object"),
    3: .standard(proto: "created_at"),
    4: .same(proto: "name"),
    5: .same(proto: "description"),
    6: .same(proto: "model"),
    7: .unique(proto: "instruction", json: "instructions"),
    8: .same(proto: "tools"),
    9: .standard(proto: "file_ids"),
    10: .same(proto: "metadata"),
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
      case 4: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 5: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 6: try { try decoder.decodeSingularStringField(value: &self.model) }()
      case 7: try { try decoder.decodeSingularStringField(value: &self.instruction) }()
      case 8: try { try decoder.decodeRepeatedMessageField(value: &self.tools) }()
      case 9: try { try decoder.decodeRepeatedStringField(value: &self.fileIds) }()
      case 10: try { try decoder.decodeMapField(fieldType: SwiftProtobuf._ProtobufMap<SwiftProtobuf.ProtobufString,SwiftProtobuf.ProtobufString>.self, value: &self.metadata) }()
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
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 4)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 5)
    }
    if !self.model.isEmpty {
      try visitor.visitSingularStringField(value: self.model, fieldNumber: 6)
    }
    if !self.instruction.isEmpty {
      try visitor.visitSingularStringField(value: self.instruction, fieldNumber: 7)
    }
    if !self.tools.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.tools, fieldNumber: 8)
    }
    if !self.fileIds.isEmpty {
      try visitor.visitRepeatedStringField(value: self.fileIds, fieldNumber: 9)
    }
    if !self.metadata.isEmpty {
      try visitor.visitMapField(fieldType: SwiftProtobuf._ProtobufMap<SwiftProtobuf.ProtobufString,SwiftProtobuf.ProtobufString>.self, value: self.metadata, fieldNumber: 10)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Msp_Azure_Openai_Assistants_V1_Assistant, rhs: Msp_Azure_Openai_Assistants_V1_Assistant) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.object != rhs.object {return false}
    if lhs.createdAt != rhs.createdAt {return false}
    if lhs.name != rhs.name {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.model != rhs.model {return false}
    if lhs.instruction != rhs.instruction {return false}
    if lhs.tools != rhs.tools {return false}
    if lhs.fileIds != rhs.fileIds {return false}
    if lhs.metadata != rhs.metadata {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Msp_Azure_Openai_Assistants_V1_CreateAssistantRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".CreateAssistantRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "model"),
    2: .same(proto: "name"),
    3: .same(proto: "description"),
    4: .unique(proto: "instruction", json: "instructions"),
    5: .same(proto: "tools"),
    6: .standard(proto: "file_ids"),
    7: .same(proto: "metadata"),
    8: .same(proto: "temperature"),
    9: .standard(proto: "top_p"),
    10: .standard(proto: "response_format"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.model) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.instruction) }()
      case 5: try { try decoder.decodeRepeatedMessageField(value: &self.tools) }()
      case 6: try { try decoder.decodeRepeatedStringField(value: &self.fileIds) }()
      case 7: try { try decoder.decodeMapField(fieldType: SwiftProtobuf._ProtobufMap<SwiftProtobuf.ProtobufString,SwiftProtobuf.ProtobufString>.self, value: &self.metadata) }()
      case 8: try { try decoder.decodeSingularFloatField(value: &self.temperature) }()
      case 9: try { try decoder.decodeSingularFloatField(value: &self.topP) }()
      case 10: try { try decoder.decodeSingularStringField(value: &self.responseFormat) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.model.isEmpty {
      try visitor.visitSingularStringField(value: self.model, fieldNumber: 1)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 2)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 3)
    }
    if !self.instruction.isEmpty {
      try visitor.visitSingularStringField(value: self.instruction, fieldNumber: 4)
    }
    if !self.tools.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.tools, fieldNumber: 5)
    }
    if !self.fileIds.isEmpty {
      try visitor.visitRepeatedStringField(value: self.fileIds, fieldNumber: 6)
    }
    if !self.metadata.isEmpty {
      try visitor.visitMapField(fieldType: SwiftProtobuf._ProtobufMap<SwiftProtobuf.ProtobufString,SwiftProtobuf.ProtobufString>.self, value: self.metadata, fieldNumber: 7)
    }
    if self.temperature != 0 {
      try visitor.visitSingularFloatField(value: self.temperature, fieldNumber: 8)
    }
    if self.topP != 0 {
      try visitor.visitSingularFloatField(value: self.topP, fieldNumber: 9)
    }
    if !self.responseFormat.isEmpty {
      try visitor.visitSingularStringField(value: self.responseFormat, fieldNumber: 10)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Msp_Azure_Openai_Assistants_V1_CreateAssistantRequest, rhs: Msp_Azure_Openai_Assistants_V1_CreateAssistantRequest) -> Bool {
    if lhs.model != rhs.model {return false}
    if lhs.name != rhs.name {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.instruction != rhs.instruction {return false}
    if lhs.tools != rhs.tools {return false}
    if lhs.fileIds != rhs.fileIds {return false}
    if lhs.metadata != rhs.metadata {return false}
    if lhs.temperature != rhs.temperature {return false}
    if lhs.topP != rhs.topP {return false}
    if lhs.responseFormat != rhs.responseFormat {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Msp_Azure_Openai_Assistants_V1_ModifyAssistantRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".ModifyAssistantRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "name"),
    2: .same(proto: "description"),
    3: .unique(proto: "instruction", json: "instructions"),
    4: .same(proto: "tools"),
    5: .standard(proto: "file_ids"),
    6: .same(proto: "metadata"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.description_p) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.instruction) }()
      case 4: try { try decoder.decodeRepeatedMessageField(value: &self.tools) }()
      case 5: try { try decoder.decodeRepeatedStringField(value: &self.fileIds) }()
      case 6: try { try decoder.decodeMapField(fieldType: SwiftProtobuf._ProtobufMap<SwiftProtobuf.ProtobufString,SwiftProtobuf.ProtobufString>.self, value: &self.metadata) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 1)
    }
    if !self.description_p.isEmpty {
      try visitor.visitSingularStringField(value: self.description_p, fieldNumber: 2)
    }
    if !self.instruction.isEmpty {
      try visitor.visitSingularStringField(value: self.instruction, fieldNumber: 3)
    }
    if !self.tools.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.tools, fieldNumber: 4)
    }
    if !self.fileIds.isEmpty {
      try visitor.visitRepeatedStringField(value: self.fileIds, fieldNumber: 5)
    }
    if !self.metadata.isEmpty {
      try visitor.visitMapField(fieldType: SwiftProtobuf._ProtobufMap<SwiftProtobuf.ProtobufString,SwiftProtobuf.ProtobufString>.self, value: self.metadata, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Msp_Azure_Openai_Assistants_V1_ModifyAssistantRequest, rhs: Msp_Azure_Openai_Assistants_V1_ModifyAssistantRequest) -> Bool {
    if lhs.name != rhs.name {return false}
    if lhs.description_p != rhs.description_p {return false}
    if lhs.instruction != rhs.instruction {return false}
    if lhs.tools != rhs.tools {return false}
    if lhs.fileIds != rhs.fileIds {return false}
    if lhs.metadata != rhs.metadata {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
