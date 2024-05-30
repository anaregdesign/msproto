// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: azure/openai/v1/chat_completions.proto
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

public struct Azure_Openai_V1_ChatCompletionRequest {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var messages: [Azure_Openai_V1_ChatMessage] {
    get {return _storage._messages}
    set {_uniqueStorage()._messages = newValue}
  }

  public var temperature: Float {
    get {return _storage._temperature ?? 0}
    set {_uniqueStorage()._temperature = newValue}
  }
  /// Returns true if `temperature` has been explicitly set.
  public var hasTemperature: Bool {return _storage._temperature != nil}
  /// Clears the value of `temperature`. Subsequent reads from it will return its default value.
  public mutating func clearTemperature() {_uniqueStorage()._temperature = nil}

  public var role: String {
    get {return _storage._role}
    set {_uniqueStorage()._role = newValue}
  }

  ///FIXME: for vision
  public var contentPart: String {
    get {return _storage._contentPart ?? String()}
    set {_uniqueStorage()._contentPart = newValue}
  }
  /// Returns true if `contentPart` has been explicitly set.
  public var hasContentPart: Bool {return _storage._contentPart != nil}
  /// Clears the value of `contentPart`. Subsequent reads from it will return its default value.
  public mutating func clearContentPart() {_uniqueStorage()._contentPart = nil}

  ///FIXME: for vision
  public var contentPartImage: Azure_Openai_V1_ContentPartImage {
    get {return _storage._contentPartImage ?? Azure_Openai_V1_ContentPartImage()}
    set {_uniqueStorage()._contentPartImage = newValue}
  }
  /// Returns true if `contentPartImage` has been explicitly set.
  public var hasContentPartImage: Bool {return _storage._contentPartImage != nil}
  /// Clears the value of `contentPartImage`. Subsequent reads from it will return its default value.
  public mutating func clearContentPartImage() {_uniqueStorage()._contentPartImage = nil}

  public var n: UInt32 {
    get {return _storage._n ?? 0}
    set {_uniqueStorage()._n = newValue}
  }
  /// Returns true if `n` has been explicitly set.
  public var hasN: Bool {return _storage._n != nil}
  /// Clears the value of `n`. Subsequent reads from it will return its default value.
  public mutating func clearN() {_uniqueStorage()._n = nil}

  public var stream: Bool {
    get {return _storage._stream ?? false}
    set {_uniqueStorage()._stream = newValue}
  }
  /// Returns true if `stream` has been explicitly set.
  public var hasStream: Bool {return _storage._stream != nil}
  /// Clears the value of `stream`. Subsequent reads from it will return its default value.
  public mutating func clearStream() {_uniqueStorage()._stream = nil}

  public var stop: [String] {
    get {return _storage._stop}
    set {_uniqueStorage()._stop = newValue}
  }

  public var maxTokens: UInt32 {
    get {return _storage._maxTokens ?? 0}
    set {_uniqueStorage()._maxTokens = newValue}
  }
  /// Returns true if `maxTokens` has been explicitly set.
  public var hasMaxTokens: Bool {return _storage._maxTokens != nil}
  /// Clears the value of `maxTokens`. Subsequent reads from it will return its default value.
  public mutating func clearMaxTokens() {_uniqueStorage()._maxTokens = nil}

  public var presencePenalty: Float {
    get {return _storage._presencePenalty ?? 0}
    set {_uniqueStorage()._presencePenalty = newValue}
  }
  /// Returns true if `presencePenalty` has been explicitly set.
  public var hasPresencePenalty: Bool {return _storage._presencePenalty != nil}
  /// Clears the value of `presencePenalty`. Subsequent reads from it will return its default value.
  public mutating func clearPresencePenalty() {_uniqueStorage()._presencePenalty = nil}

  public var frequencyPenalty: Float {
    get {return _storage._frequencyPenalty ?? 0}
    set {_uniqueStorage()._frequencyPenalty = newValue}
  }
  /// Returns true if `frequencyPenalty` has been explicitly set.
  public var hasFrequencyPenalty: Bool {return _storage._frequencyPenalty != nil}
  /// Clears the value of `frequencyPenalty`. Subsequent reads from it will return its default value.
  public mutating func clearFrequencyPenalty() {_uniqueStorage()._frequencyPenalty = nil}

  public var logitBias: Dictionary<String,Float> {
    get {return _storage._logitBias}
    set {_uniqueStorage()._logitBias = newValue}
  }

  public var user: String {
    get {return _storage._user ?? String()}
    set {_uniqueStorage()._user = newValue}
  }
  /// Returns true if `user` has been explicitly set.
  public var hasUser: Bool {return _storage._user != nil}
  /// Clears the value of `user`. Subsequent reads from it will return its default value.
  public mutating func clearUser() {_uniqueStorage()._user = nil}

  public var topP: Float {
    get {return _storage._topP ?? 0}
    set {_uniqueStorage()._topP = newValue}
  }
  /// Returns true if `topP` has been explicitly set.
  public var hasTopP: Bool {return _storage._topP != nil}
  /// Clears the value of `topP`. Subsequent reads from it will return its default value.
  public mutating func clearTopP() {_uniqueStorage()._topP = nil}

  public var logProbs: Bool {
    get {return _storage._logProbs ?? false}
    set {_uniqueStorage()._logProbs = newValue}
  }
  /// Returns true if `logProbs` has been explicitly set.
  public var hasLogProbs: Bool {return _storage._logProbs != nil}
  /// Clears the value of `logProbs`. Subsequent reads from it will return its default value.
  public mutating func clearLogProbs() {_uniqueStorage()._logProbs = nil}

  public var topLogprobs: UInt32 {
    get {return _storage._topLogprobs ?? 0}
    set {_uniqueStorage()._topLogprobs = newValue}
  }
  /// Returns true if `topLogprobs` has been explicitly set.
  public var hasTopLogprobs: Bool {return _storage._topLogprobs != nil}
  /// Clears the value of `topLogprobs`. Subsequent reads from it will return its default value.
  public mutating func clearTopLogprobs() {_uniqueStorage()._topLogprobs = nil}

  public var seed: UInt32 {
    get {return _storage._seed ?? 0}
    set {_uniqueStorage()._seed = newValue}
  }
  /// Returns true if `seed` has been explicitly set.
  public var hasSeed: Bool {return _storage._seed != nil}
  /// Clears the value of `seed`. Subsequent reads from it will return its default value.
  public mutating func clearSeed() {_uniqueStorage()._seed = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

public struct Azure_Openai_V1_ChatCompletionResponse {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var id: String = String()

  public var object: String = String()

  public var created: UInt32 = 0

  public var model: String = String()

  public var usage: Azure_Openai_V1_Usage {
    get {return _usage ?? Azure_Openai_V1_Usage()}
    set {_usage = newValue}
  }
  /// Returns true if `usage` has been explicitly set.
  public var hasUsage: Bool {return self._usage != nil}
  /// Clears the value of `usage`. Subsequent reads from it will return its default value.
  public mutating func clearUsage() {self._usage = nil}

  public var choices: [Azure_Openai_V1_ChatChoice] = []

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _usage: Azure_Openai_V1_Usage? = nil
}

public struct Azure_Openai_V1_ChatMessage {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var content: String = String()

  public var name: String = String()

  public var role: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Azure_Openai_V1_ContentPartImage {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var url: String = String()

  public var detail: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Azure_Openai_V1_ChatChoice {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var message: Azure_Openai_V1_ChatMessage {
    get {return _message ?? Azure_Openai_V1_ChatMessage()}
    set {_message = newValue}
  }
  /// Returns true if `message` has been explicitly set.
  public var hasMessage: Bool {return self._message != nil}
  /// Clears the value of `message`. Subsequent reads from it will return its default value.
  public mutating func clearMessage() {self._message = nil}

  public var finishReason: String = String()

  public var index: UInt32 = 0

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _message: Azure_Openai_V1_ChatMessage? = nil
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Azure_Openai_V1_ChatCompletionRequest: @unchecked Sendable {}
extension Azure_Openai_V1_ChatCompletionResponse: @unchecked Sendable {}
extension Azure_Openai_V1_ChatMessage: @unchecked Sendable {}
extension Azure_Openai_V1_ContentPartImage: @unchecked Sendable {}
extension Azure_Openai_V1_ChatChoice: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "azure.openai.v1"

extension Azure_Openai_V1_ChatCompletionRequest: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".ChatCompletionRequest"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "messages"),
    2: .same(proto: "temperature"),
    3: .same(proto: "role"),
    4: .unique(proto: "content_part", json: "ContentPart"),
    5: .unique(proto: "content_part_image", json: "ContentPartImage"),
    6: .same(proto: "n"),
    7: .same(proto: "stream"),
    8: .same(proto: "stop"),
    9: .standard(proto: "max_tokens"),
    10: .standard(proto: "presence_penalty"),
    11: .standard(proto: "frequency_penalty"),
    12: .standard(proto: "logit_bias"),
    13: .same(proto: "user"),
    14: .standard(proto: "top_p"),
    15: .standard(proto: "log_probs"),
    16: .standard(proto: "top_logprobs"),
    17: .same(proto: "seed"),
  ]

  fileprivate class _StorageClass {
    var _messages: [Azure_Openai_V1_ChatMessage] = []
    var _temperature: Float? = nil
    var _role: String = String()
    var _contentPart: String? = nil
    var _contentPartImage: Azure_Openai_V1_ContentPartImage? = nil
    var _n: UInt32? = nil
    var _stream: Bool? = nil
    var _stop: [String] = []
    var _maxTokens: UInt32? = nil
    var _presencePenalty: Float? = nil
    var _frequencyPenalty: Float? = nil
    var _logitBias: Dictionary<String,Float> = [:]
    var _user: String? = nil
    var _topP: Float? = nil
    var _logProbs: Bool? = nil
    var _topLogprobs: UInt32? = nil
    var _seed: UInt32? = nil

    #if swift(>=5.10)
      // This property is used as the initial default value for new instances of the type.
      // The type itself is protecting the reference to its storage via CoW semantics.
      // This will force a copy to be made of this reference when the first mutation occurs;
      // hence, it is safe to mark this as `nonisolated(unsafe)`.
      static nonisolated(unsafe) let defaultInstance = _StorageClass()
    #else
      static let defaultInstance = _StorageClass()
    #endif

    private init() {}

    init(copying source: _StorageClass) {
      _messages = source._messages
      _temperature = source._temperature
      _role = source._role
      _contentPart = source._contentPart
      _contentPartImage = source._contentPartImage
      _n = source._n
      _stream = source._stream
      _stop = source._stop
      _maxTokens = source._maxTokens
      _presencePenalty = source._presencePenalty
      _frequencyPenalty = source._frequencyPenalty
      _logitBias = source._logitBias
      _user = source._user
      _topP = source._topP
      _logProbs = source._logProbs
      _topLogprobs = source._topLogprobs
      _seed = source._seed
    }
  }

  fileprivate mutating func _uniqueStorage() -> _StorageClass {
    if !isKnownUniquelyReferenced(&_storage) {
      _storage = _StorageClass(copying: _storage)
    }
    return _storage
  }

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    _ = _uniqueStorage()
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      while let fieldNumber = try decoder.nextFieldNumber() {
        // The use of inline closures is to circumvent an issue where the compiler
        // allocates stack space for every case branch when no optimizations are
        // enabled. https://github.com/apple/swift-protobuf/issues/1034
        switch fieldNumber {
        case 1: try { try decoder.decodeRepeatedMessageField(value: &_storage._messages) }()
        case 2: try { try decoder.decodeSingularFloatField(value: &_storage._temperature) }()
        case 3: try { try decoder.decodeSingularStringField(value: &_storage._role) }()
        case 4: try { try decoder.decodeSingularStringField(value: &_storage._contentPart) }()
        case 5: try { try decoder.decodeSingularMessageField(value: &_storage._contentPartImage) }()
        case 6: try { try decoder.decodeSingularUInt32Field(value: &_storage._n) }()
        case 7: try { try decoder.decodeSingularBoolField(value: &_storage._stream) }()
        case 8: try { try decoder.decodeRepeatedStringField(value: &_storage._stop) }()
        case 9: try { try decoder.decodeSingularUInt32Field(value: &_storage._maxTokens) }()
        case 10: try { try decoder.decodeSingularFloatField(value: &_storage._presencePenalty) }()
        case 11: try { try decoder.decodeSingularFloatField(value: &_storage._frequencyPenalty) }()
        case 12: try { try decoder.decodeMapField(fieldType: SwiftProtobuf._ProtobufMap<SwiftProtobuf.ProtobufString,SwiftProtobuf.ProtobufFloat>.self, value: &_storage._logitBias) }()
        case 13: try { try decoder.decodeSingularStringField(value: &_storage._user) }()
        case 14: try { try decoder.decodeSingularFloatField(value: &_storage._topP) }()
        case 15: try { try decoder.decodeSingularBoolField(value: &_storage._logProbs) }()
        case 16: try { try decoder.decodeSingularUInt32Field(value: &_storage._topLogprobs) }()
        case 17: try { try decoder.decodeSingularUInt32Field(value: &_storage._seed) }()
        default: break
        }
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    try withExtendedLifetime(_storage) { (_storage: _StorageClass) in
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every if/case branch local when no optimizations
      // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
      // https://github.com/apple/swift-protobuf/issues/1182
      if !_storage._messages.isEmpty {
        try visitor.visitRepeatedMessageField(value: _storage._messages, fieldNumber: 1)
      }
      try { if let v = _storage._temperature {
        try visitor.visitSingularFloatField(value: v, fieldNumber: 2)
      } }()
      if !_storage._role.isEmpty {
        try visitor.visitSingularStringField(value: _storage._role, fieldNumber: 3)
      }
      try { if let v = _storage._contentPart {
        try visitor.visitSingularStringField(value: v, fieldNumber: 4)
      } }()
      try { if let v = _storage._contentPartImage {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
      } }()
      try { if let v = _storage._n {
        try visitor.visitSingularUInt32Field(value: v, fieldNumber: 6)
      } }()
      try { if let v = _storage._stream {
        try visitor.visitSingularBoolField(value: v, fieldNumber: 7)
      } }()
      if !_storage._stop.isEmpty {
        try visitor.visitRepeatedStringField(value: _storage._stop, fieldNumber: 8)
      }
      try { if let v = _storage._maxTokens {
        try visitor.visitSingularUInt32Field(value: v, fieldNumber: 9)
      } }()
      try { if let v = _storage._presencePenalty {
        try visitor.visitSingularFloatField(value: v, fieldNumber: 10)
      } }()
      try { if let v = _storage._frequencyPenalty {
        try visitor.visitSingularFloatField(value: v, fieldNumber: 11)
      } }()
      if !_storage._logitBias.isEmpty {
        try visitor.visitMapField(fieldType: SwiftProtobuf._ProtobufMap<SwiftProtobuf.ProtobufString,SwiftProtobuf.ProtobufFloat>.self, value: _storage._logitBias, fieldNumber: 12)
      }
      try { if let v = _storage._user {
        try visitor.visitSingularStringField(value: v, fieldNumber: 13)
      } }()
      try { if let v = _storage._topP {
        try visitor.visitSingularFloatField(value: v, fieldNumber: 14)
      } }()
      try { if let v = _storage._logProbs {
        try visitor.visitSingularBoolField(value: v, fieldNumber: 15)
      } }()
      try { if let v = _storage._topLogprobs {
        try visitor.visitSingularUInt32Field(value: v, fieldNumber: 16)
      } }()
      try { if let v = _storage._seed {
        try visitor.visitSingularUInt32Field(value: v, fieldNumber: 17)
      } }()
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Azure_Openai_V1_ChatCompletionRequest, rhs: Azure_Openai_V1_ChatCompletionRequest) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._messages != rhs_storage._messages {return false}
        if _storage._temperature != rhs_storage._temperature {return false}
        if _storage._role != rhs_storage._role {return false}
        if _storage._contentPart != rhs_storage._contentPart {return false}
        if _storage._contentPartImage != rhs_storage._contentPartImage {return false}
        if _storage._n != rhs_storage._n {return false}
        if _storage._stream != rhs_storage._stream {return false}
        if _storage._stop != rhs_storage._stop {return false}
        if _storage._maxTokens != rhs_storage._maxTokens {return false}
        if _storage._presencePenalty != rhs_storage._presencePenalty {return false}
        if _storage._frequencyPenalty != rhs_storage._frequencyPenalty {return false}
        if _storage._logitBias != rhs_storage._logitBias {return false}
        if _storage._user != rhs_storage._user {return false}
        if _storage._topP != rhs_storage._topP {return false}
        if _storage._logProbs != rhs_storage._logProbs {return false}
        if _storage._topLogprobs != rhs_storage._topLogprobs {return false}
        if _storage._seed != rhs_storage._seed {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Azure_Openai_V1_ChatCompletionResponse: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".ChatCompletionResponse"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "id"),
    2: .same(proto: "object"),
    3: .same(proto: "created"),
    4: .same(proto: "model"),
    5: .same(proto: "usage"),
    6: .same(proto: "choices"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.id) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.object) }()
      case 3: try { try decoder.decodeSingularUInt32Field(value: &self.created) }()
      case 4: try { try decoder.decodeSingularStringField(value: &self.model) }()
      case 5: try { try decoder.decodeSingularMessageField(value: &self._usage) }()
      case 6: try { try decoder.decodeRepeatedMessageField(value: &self.choices) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    if !self.id.isEmpty {
      try visitor.visitSingularStringField(value: self.id, fieldNumber: 1)
    }
    if !self.object.isEmpty {
      try visitor.visitSingularStringField(value: self.object, fieldNumber: 2)
    }
    if self.created != 0 {
      try visitor.visitSingularUInt32Field(value: self.created, fieldNumber: 3)
    }
    if !self.model.isEmpty {
      try visitor.visitSingularStringField(value: self.model, fieldNumber: 4)
    }
    try { if let v = self._usage {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
    } }()
    if !self.choices.isEmpty {
      try visitor.visitRepeatedMessageField(value: self.choices, fieldNumber: 6)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Azure_Openai_V1_ChatCompletionResponse, rhs: Azure_Openai_V1_ChatCompletionResponse) -> Bool {
    if lhs.id != rhs.id {return false}
    if lhs.object != rhs.object {return false}
    if lhs.created != rhs.created {return false}
    if lhs.model != rhs.model {return false}
    if lhs._usage != rhs._usage {return false}
    if lhs.choices != rhs.choices {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Azure_Openai_V1_ChatMessage: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".ChatMessage"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "content"),
    2: .same(proto: "name"),
    3: .same(proto: "role"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.content) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.name) }()
      case 3: try { try decoder.decodeSingularStringField(value: &self.role) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.content.isEmpty {
      try visitor.visitSingularStringField(value: self.content, fieldNumber: 1)
    }
    if !self.name.isEmpty {
      try visitor.visitSingularStringField(value: self.name, fieldNumber: 2)
    }
    if !self.role.isEmpty {
      try visitor.visitSingularStringField(value: self.role, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Azure_Openai_V1_ChatMessage, rhs: Azure_Openai_V1_ChatMessage) -> Bool {
    if lhs.content != rhs.content {return false}
    if lhs.name != rhs.name {return false}
    if lhs.role != rhs.role {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Azure_Openai_V1_ContentPartImage: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".ContentPartImage"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "url"),
    2: .same(proto: "detail"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularStringField(value: &self.url) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.detail) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if !self.url.isEmpty {
      try visitor.visitSingularStringField(value: self.url, fieldNumber: 1)
    }
    if !self.detail.isEmpty {
      try visitor.visitSingularStringField(value: self.detail, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Azure_Openai_V1_ContentPartImage, rhs: Azure_Openai_V1_ContentPartImage) -> Bool {
    if lhs.url != rhs.url {return false}
    if lhs.detail != rhs.detail {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Azure_Openai_V1_ChatChoice: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".ChatChoice"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "message"),
    2: .standard(proto: "finish_reason"),
    3: .same(proto: "index"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularMessageField(value: &self._message) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.finishReason) }()
      case 3: try { try decoder.decodeSingularUInt32Field(value: &self.index) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    // The use of inline closures is to circumvent an issue where the compiler
    // allocates stack space for every if/case branch local when no optimizations
    // are enabled. https://github.com/apple/swift-protobuf/issues/1034 and
    // https://github.com/apple/swift-protobuf/issues/1182
    try { if let v = self._message {
      try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
    } }()
    if !self.finishReason.isEmpty {
      try visitor.visitSingularStringField(value: self.finishReason, fieldNumber: 2)
    }
    if self.index != 0 {
      try visitor.visitSingularUInt32Field(value: self.index, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Azure_Openai_V1_ChatChoice, rhs: Azure_Openai_V1_ChatChoice) -> Bool {
    if lhs._message != rhs._message {return false}
    if lhs.finishReason != rhs.finishReason {return false}
    if lhs.index != rhs.index {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}