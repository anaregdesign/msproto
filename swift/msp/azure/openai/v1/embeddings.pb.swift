// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: msp/azure/openai/v1/embeddings.proto
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

public struct Msp_Azure_Openai_V1_EmbeddingRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var input: String = String()

  public var user: String = String()

  public var inputType: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Msp_Azure_Openai_V1_EmbeddingResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var object: String = String()

  public var model: String = String()

  public var data: [Msp_Azure_Openai_V1_EmbeddingResponse.DataMessage] = []

  public var usage: Msp_Azure_Openai_V1_EmbeddingResponse.Usage {
    get {return _usage ?? Msp_Azure_Openai_V1_EmbeddingResponse.Usage()}
    set {_usage = newValue}
  }
  /// Returns true if `usage` has been explicitly set.
  public var hasUsage: Bool {return self._usage != nil}
  /// Clears the value of `usage`. Subsequent reads from it will return its default value.
  public mutating func clearUsage() {self._usage = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public struct DataMessage {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    public var index: UInt32 = 0

    public var object: String = String()

    public var embedding: [Float] = []

    public var unknownFields = SwiftProtobuf.UnknownStorage()

    public init() {}
  }

  public struct Usage {
    // SwiftProtobuf.Message conformance is added in an extension below. See the
    // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
    // methods supported on all messages.

    public var promptTokens: UInt32 = 0

    public var totalTokens: UInt32 = 0

    public var unknownFields = SwiftProtobuf.UnknownStorage()

    public init() {}
  }

  public init() {}

  fileprivate var _usage: Msp_Azure_Openai_V1_EmbeddingResponse.Usage? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Msp_Azure_Openai_V1_EmbeddingRequest: @unchecked Sendable {}
extension Msp_Azure_Openai_V1_EmbeddingResponse: @unchecked Sendable {}
extension Msp_Azure_Openai_V1_EmbeddingResponse.DataMessage: @unchecked Sendable {}
extension Msp_Azure_Openai_V1_EmbeddingResponse.Usage: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "msp.azure.openai.v1"

extension Msp_Azure_Openai_V1_EmbeddingRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".EmbeddingRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "input"),
    2: .same(proto: "user"),
    3: .standard(proto: "input_type"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.input) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.user) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.inputType) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.input.isEmpty {
      try visitor.visitSingularStringField(value: self.input, fieldNumber: 1)
    }
    if !self.user.isEmpty {
      try visitor.visitSingularStringField(value: self.user, fieldNumber: 2)
    }
    if !self.inputType.isEmpty {
      try visitor.visitSingularStringField(value: self.inputType, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Msp_Azure_Openai_V1_EmbeddingRequest, rhs: Msp_Azure_Openai_V1_EmbeddingRequest) -> Bool {
    if lhs.input != rhs.input {return false}
    if lhs.user != rhs.user {return false}
    if lhs.inputType != rhs.inputType {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Msp_Azure_Openai_V1_EmbeddingResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".EmbeddingResponse"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "object"),
    2: .same(proto: "model"),
    3: .same(proto: "data"),
    4: .same(proto: "usage"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.object) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.model) }()
      case 3: try { try decoder.decodeRepeatedMessageField(value: &self.data) }()
      case 4: try { try decoder.decodeSingularMessageField(value: &self._usage) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.object.isEmpty {
      try visitor.visitSingularStringField(value: self.object, fieldNumber: 1)
    }
    if !self.model.isEmpty {
      try visitor.visitSingularStringField(value: self.model, fieldNumber: 2)
    }
    if !self.data.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.data, fieldNumber: 3)
    }
    try { if let v = self._usage {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
    } }()
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Msp_Azure_Openai_V1_EmbeddingResponse, rhs: Msp_Azure_Openai_V1_EmbeddingResponse) -> Bool {
    if lhs.object != rhs.object {return false}
    if lhs.model != rhs.model {return false}
    if lhs.data != rhs.data {return false}
    if lhs._usage != rhs._usage {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Msp_Azure_Openai_V1_EmbeddingResponse.DataMessage: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = Msp_Azure_Openai_V1_EmbeddingResponse.protoMessageName + ".Data"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "index"),
    2: .same(proto: "object"),
    3: .same(proto: "embedding"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt32Field(value: &self.index) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.object) }()
      case 3: try { try decoder.decodeRepeatedFloatField(value: &self.embedding) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.index != 0 {
      try visitor.visitSingularUInt32Field(value: self.index, fieldNumber: 1)
    }
    if !self.object.isEmpty {
      try visitor.visitSingularStringField(value: self.object, fieldNumber: 2)
    }
    if !self.embedding.isEmpty {
      try visitor.visitPackedFloatField(value: self.embedding, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Msp_Azure_Openai_V1_EmbeddingResponse.DataMessage, rhs: Msp_Azure_Openai_V1_EmbeddingResponse.DataMessage) -> Bool {
    if lhs.index != rhs.index {return false}
    if lhs.object != rhs.object {return false}
    if lhs.embedding != rhs.embedding {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Msp_Azure_Openai_V1_EmbeddingResponse.Usage: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = Msp_Azure_Openai_V1_EmbeddingResponse.protoMessageName + ".Usage"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "prompt_tokens"),
    2: .standard(proto: "total_tokens"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt32Field(value: &self.promptTokens) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.totalTokens) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.promptTokens != 0 {
      try visitor.visitSingularUInt32Field(value: self.promptTokens, fieldNumber: 1)
    }
    if self.totalTokens != 0 {
      try visitor.visitSingularUInt32Field(value: self.totalTokens, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Msp_Azure_Openai_V1_EmbeddingResponse.Usage, rhs: Msp_Azure_Openai_V1_EmbeddingResponse.Usage) -> Bool {
    if lhs.promptTokens != rhs.promptTokens {return false}
    if lhs.totalTokens != rhs.totalTokens {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
