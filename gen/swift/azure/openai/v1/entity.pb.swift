// DO NOT EDIT.
// swift-format-ignore-file
//
// Generated by the Swift generator plugin for the protocol buffer compiler.
// Source: azure/openai/v1/entity.proto
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

public struct Azure_Openai_V1_Error {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var code: String {
    get {return _storage._code}
    set {_uniqueStorage()._code = newValue}
  }

  public var message: String {
    get {return _storage._message}
    set {_uniqueStorage()._message = newValue}
  }

  public var param: String {
    get {return _storage._param}
    set {_uniqueStorage()._param = newValue}
  }

  public var type: String {
    get {return _storage._type}
    set {_uniqueStorage()._type = newValue}
  }

  public var innerError: Azure_Openai_V1_InnerError {
    get {return _storage._innerError ?? Azure_Openai_V1_InnerError()}
    set {_uniqueStorage()._innerError = newValue}
  }
  /// Returns true if `innerError` has been explicitly set.
  public var hasInnerError: Bool {return _storage._innerError != nil}
  /// Clears the value of `innerError`. Subsequent reads from it will return its default value.
  public mutating func clearInnerError() {_uniqueStorage()._innerError = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

public struct Azure_Openai_V1_InnerError {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var description_p: String {
    get {return _storage._description_p}
    set {_uniqueStorage()._description_p = newValue}
  }

  public var code: String {
    get {return _storage._code}
    set {_uniqueStorage()._code = newValue}
  }

  public var contentFilterResults: Azure_Openai_V1_ContentFilterResults {
    get {return _storage._contentFilterResults ?? Azure_Openai_V1_ContentFilterResults()}
    set {_uniqueStorage()._contentFilterResults = newValue}
  }
  /// Returns true if `contentFilterResults` has been explicitly set.
  public var hasContentFilterResults: Bool {return _storage._contentFilterResults != nil}
  /// Clears the value of `contentFilterResults`. Subsequent reads from it will return its default value.
  public mutating func clearContentFilterResults() {_uniqueStorage()._contentFilterResults = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

public struct Azure_Openai_V1_ContentFilterResults {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var sexual: Azure_Openai_V1_ContentFilterSeverityResult {
    get {return _storage._sexual ?? Azure_Openai_V1_ContentFilterSeverityResult()}
    set {_uniqueStorage()._sexual = newValue}
  }
  /// Returns true if `sexual` has been explicitly set.
  public var hasSexual: Bool {return _storage._sexual != nil}
  /// Clears the value of `sexual`. Subsequent reads from it will return its default value.
  public mutating func clearSexual() {_uniqueStorage()._sexual = nil}

  public var violence: Azure_Openai_V1_ContentFilterSeverityResult {
    get {return _storage._violence ?? Azure_Openai_V1_ContentFilterSeverityResult()}
    set {_uniqueStorage()._violence = newValue}
  }
  /// Returns true if `violence` has been explicitly set.
  public var hasViolence: Bool {return _storage._violence != nil}
  /// Clears the value of `violence`. Subsequent reads from it will return its default value.
  public mutating func clearViolence() {_uniqueStorage()._violence = nil}

  public var hate: Azure_Openai_V1_ContentFilterSeverityResult {
    get {return _storage._hate ?? Azure_Openai_V1_ContentFilterSeverityResult()}
    set {_uniqueStorage()._hate = newValue}
  }
  /// Returns true if `hate` has been explicitly set.
  public var hasHate: Bool {return _storage._hate != nil}
  /// Clears the value of `hate`. Subsequent reads from it will return its default value.
  public mutating func clearHate() {_uniqueStorage()._hate = nil}

  public var selfHarm: Azure_Openai_V1_ContentFilterSeverityResult {
    get {return _storage._selfHarm ?? Azure_Openai_V1_ContentFilterSeverityResult()}
    set {_uniqueStorage()._selfHarm = newValue}
  }
  /// Returns true if `selfHarm` has been explicitly set.
  public var hasSelfHarm: Bool {return _storage._selfHarm != nil}
  /// Clears the value of `selfHarm`. Subsequent reads from it will return its default value.
  public mutating func clearSelfHarm() {_uniqueStorage()._selfHarm = nil}

  public var profanity: Azure_Openai_V1_ContentFilterSeverityResult {
    get {return _storage._profanity ?? Azure_Openai_V1_ContentFilterSeverityResult()}
    set {_uniqueStorage()._profanity = newValue}
  }
  /// Returns true if `profanity` has been explicitly set.
  public var hasProfanity: Bool {return _storage._profanity != nil}
  /// Clears the value of `profanity`. Subsequent reads from it will return its default value.
  public mutating func clearProfanity() {_uniqueStorage()._profanity = nil}

  public var jailbreak: Azure_Openai_V1_ContentFilterDetectedResult {
    get {return _storage._jailbreak ?? Azure_Openai_V1_ContentFilterDetectedResult()}
    set {_uniqueStorage()._jailbreak = newValue}
  }
  /// Returns true if `jailbreak` has been explicitly set.
  public var hasJailbreak: Bool {return _storage._jailbreak != nil}
  /// Clears the value of `jailbreak`. Subsequent reads from it will return its default value.
  public mutating func clearJailbreak() {_uniqueStorage()._jailbreak = nil}

  public var error: Azure_Openai_V1_Error {
    get {return _storage._error ?? Azure_Openai_V1_Error()}
    set {_uniqueStorage()._error = newValue}
  }
  /// Returns true if `error` has been explicitly set.
  public var hasError: Bool {return _storage._error != nil}
  /// Clears the value of `error`. Subsequent reads from it will return its default value.
  public mutating func clearError() {_uniqueStorage()._error = nil}

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}

  fileprivate var _storage = _StorageClass.defaultInstance
}

public struct Azure_Openai_V1_ContentFilterDetectedResult {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var filtered: Bool = false

  public var detected: Bool = false

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Azure_Openai_V1_ContentFilterSeverityResult {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var filtered: Bool = false

  public var severity: String = String()

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

public struct Azure_Openai_V1_Usage {
  // SwiftProtobuf.Message conformance is added in an extension below. See the
  // `Message` and `Message+*Additions` files in the SwiftProtobuf library for
  // methods supported on all messages.

  public var promptTokens: UInt32 = 0

  public var completionTokens: UInt32 = 0

  public var totalTokens: UInt32 = 0

  public var unknownFields = SwiftProtobuf.UnknownStorage()

  public init() {}
}

#if swift(>=5.5) && canImport(_Concurrency)
extension Azure_Openai_V1_Error: @unchecked Sendable {}
extension Azure_Openai_V1_InnerError: @unchecked Sendable {}
extension Azure_Openai_V1_ContentFilterResults: @unchecked Sendable {}
extension Azure_Openai_V1_ContentFilterDetectedResult: @unchecked Sendable {}
extension Azure_Openai_V1_ContentFilterSeverityResult: @unchecked Sendable {}
extension Azure_Openai_V1_Usage: @unchecked Sendable {}
#endif  // swift(>=5.5) && canImport(_Concurrency)

// MARK: - Code below here is support for the SwiftProtobuf runtime.

fileprivate let _protobuf_package = "azure.openai.v1"

extension Azure_Openai_V1_Error: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".Error"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "code"),
    2: .same(proto: "message"),
    3: .same(proto: "param"),
    4: .same(proto: "type"),
    5: .standard(proto: "inner_error"),
  ]

  fileprivate class _StorageClass {
    var _code: String = String()
    var _message: String = String()
    var _param: String = String()
    var _type: String = String()
    var _innerError: Azure_Openai_V1_InnerError? = nil

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
      _code = source._code
      _message = source._message
      _param = source._param
      _type = source._type
      _innerError = source._innerError
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
        case 1: try { try decoder.decodeSingularStringField(value: &_storage._code) }()
        case 2: try { try decoder.decodeSingularStringField(value: &_storage._message) }()
        case 3: try { try decoder.decodeSingularStringField(value: &_storage._param) }()
        case 4: try { try decoder.decodeSingularStringField(value: &_storage._type) }()
        case 5: try { try decoder.decodeSingularMessageField(value: &_storage._innerError) }()
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
      if !_storage._code.isEmpty {
        try visitor.visitSingularStringField(value: _storage._code, fieldNumber: 1)
      }
      if !_storage._message.isEmpty {
        try visitor.visitSingularStringField(value: _storage._message, fieldNumber: 2)
      }
      if !_storage._param.isEmpty {
        try visitor.visitSingularStringField(value: _storage._param, fieldNumber: 3)
      }
      if !_storage._type.isEmpty {
        try visitor.visitSingularStringField(value: _storage._type, fieldNumber: 4)
      }
      try { if let v = _storage._innerError {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
      } }()
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Azure_Openai_V1_Error, rhs: Azure_Openai_V1_Error) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._code != rhs_storage._code {return false}
        if _storage._message != rhs_storage._message {return false}
        if _storage._param != rhs_storage._param {return false}
        if _storage._type != rhs_storage._type {return false}
        if _storage._innerError != rhs_storage._innerError {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Azure_Openai_V1_InnerError: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".InnerError"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "description"),
    2: .same(proto: "code"),
    3: .standard(proto: "content_filter_results"),
  ]

  fileprivate class _StorageClass {
    var _description_p: String = String()
    var _code: String = String()
    var _contentFilterResults: Azure_Openai_V1_ContentFilterResults? = nil

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
      _description_p = source._description_p
      _code = source._code
      _contentFilterResults = source._contentFilterResults
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
        case 1: try { try decoder.decodeSingularStringField(value: &_storage._description_p) }()
        case 2: try { try decoder.decodeSingularStringField(value: &_storage._code) }()
        case 3: try { try decoder.decodeSingularMessageField(value: &_storage._contentFilterResults) }()
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
      if !_storage._description_p.isEmpty {
        try visitor.visitSingularStringField(value: _storage._description_p, fieldNumber: 1)
      }
      if !_storage._code.isEmpty {
        try visitor.visitSingularStringField(value: _storage._code, fieldNumber: 2)
      }
      try { if let v = _storage._contentFilterResults {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
      } }()
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Azure_Openai_V1_InnerError, rhs: Azure_Openai_V1_InnerError) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._description_p != rhs_storage._description_p {return false}
        if _storage._code != rhs_storage._code {return false}
        if _storage._contentFilterResults != rhs_storage._contentFilterResults {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Azure_Openai_V1_ContentFilterResults: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".ContentFilterResults"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "sexual"),
    2: .same(proto: "violence"),
    3: .same(proto: "hate"),
    4: .standard(proto: "self_harm"),
    5: .same(proto: "profanity"),
    6: .same(proto: "jailbreak"),
    7: .same(proto: "error"),
  ]

  fileprivate class _StorageClass {
    var _sexual: Azure_Openai_V1_ContentFilterSeverityResult? = nil
    var _violence: Azure_Openai_V1_ContentFilterSeverityResult? = nil
    var _hate: Azure_Openai_V1_ContentFilterSeverityResult? = nil
    var _selfHarm: Azure_Openai_V1_ContentFilterSeverityResult? = nil
    var _profanity: Azure_Openai_V1_ContentFilterSeverityResult? = nil
    var _jailbreak: Azure_Openai_V1_ContentFilterDetectedResult? = nil
    var _error: Azure_Openai_V1_Error? = nil

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
      _sexual = source._sexual
      _violence = source._violence
      _hate = source._hate
      _selfHarm = source._selfHarm
      _profanity = source._profanity
      _jailbreak = source._jailbreak
      _error = source._error
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
        case 1: try { try decoder.decodeSingularMessageField(value: &_storage._sexual) }()
        case 2: try { try decoder.decodeSingularMessageField(value: &_storage._violence) }()
        case 3: try { try decoder.decodeSingularMessageField(value: &_storage._hate) }()
        case 4: try { try decoder.decodeSingularMessageField(value: &_storage._selfHarm) }()
        case 5: try { try decoder.decodeSingularMessageField(value: &_storage._profanity) }()
        case 6: try { try decoder.decodeSingularMessageField(value: &_storage._jailbreak) }()
        case 7: try { try decoder.decodeSingularMessageField(value: &_storage._error) }()
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
      try { if let v = _storage._sexual {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 1)
      } }()
      try { if let v = _storage._violence {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 2)
      } }()
      try { if let v = _storage._hate {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 3)
      } }()
      try { if let v = _storage._selfHarm {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 4)
      } }()
      try { if let v = _storage._profanity {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 5)
      } }()
      try { if let v = _storage._jailbreak {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 6)
      } }()
      try { if let v = _storage._error {
        try visitor.visitSingularMessageField(value: v, fieldNumber: 7)
      } }()
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Azure_Openai_V1_ContentFilterResults, rhs: Azure_Openai_V1_ContentFilterResults) -> Bool {
    if lhs._storage !== rhs._storage {
      let storagesAreEqual: Bool = withExtendedLifetime((lhs._storage, rhs._storage)) { (_args: (_StorageClass, _StorageClass)) in
        let _storage = _args.0
        let rhs_storage = _args.1
        if _storage._sexual != rhs_storage._sexual {return false}
        if _storage._violence != rhs_storage._violence {return false}
        if _storage._hate != rhs_storage._hate {return false}
        if _storage._selfHarm != rhs_storage._selfHarm {return false}
        if _storage._profanity != rhs_storage._profanity {return false}
        if _storage._jailbreak != rhs_storage._jailbreak {return false}
        if _storage._error != rhs_storage._error {return false}
        return true
      }
      if !storagesAreEqual {return false}
    }
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Azure_Openai_V1_ContentFilterDetectedResult: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".ContentFilterDetectedResult"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "filtered"),
    2: .same(proto: "detected"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBoolField(value: &self.filtered) }()
      case 2: try { try decoder.decodeSingularBoolField(value: &self.detected) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.filtered != false {
      try visitor.visitSingularBoolField(value: self.filtered, fieldNumber: 1)
    }
    if self.detected != false {
      try visitor.visitSingularBoolField(value: self.detected, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Azure_Openai_V1_ContentFilterDetectedResult, rhs: Azure_Openai_V1_ContentFilterDetectedResult) -> Bool {
    if lhs.filtered != rhs.filtered {return false}
    if lhs.detected != rhs.detected {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Azure_Openai_V1_ContentFilterSeverityResult: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".ContentFilterSeverityResult"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .same(proto: "filtered"),
    2: .same(proto: "severity"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularBoolField(value: &self.filtered) }()
      case 2: try { try decoder.decodeSingularStringField(value: &self.severity) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.filtered != false {
      try visitor.visitSingularBoolField(value: self.filtered, fieldNumber: 1)
    }
    if !self.severity.isEmpty {
      try visitor.visitSingularStringField(value: self.severity, fieldNumber: 2)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Azure_Openai_V1_ContentFilterSeverityResult, rhs: Azure_Openai_V1_ContentFilterSeverityResult) -> Bool {
    if lhs.filtered != rhs.filtered {return false}
    if lhs.severity != rhs.severity {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}

extension Azure_Openai_V1_Usage: SwiftProtobuf.Message, SwiftProtobuf._MessageImplementationBase, SwiftProtobuf._ProtoNameProviding {
  public static let protoMessageName: String = _protobuf_package + ".Usage"
  public static let _protobuf_nameMap: SwiftProtobuf._NameMap = [
    1: .standard(proto: "prompt_tokens"),
    2: .standard(proto: "completion_tokens"),
    3: .standard(proto: "total_tokens"),
  ]

  public mutating func decodeMessage<D: SwiftProtobuf.Decoder>(decoder: inout D) throws {
    while let fieldNumber = try decoder.nextFieldNumber() {
      // The use of inline closures is to circumvent an issue where the compiler
      // allocates stack space for every case branch when no optimizations are
      // enabled. https://github.com/apple/swift-protobuf/issues/1034
      switch fieldNumber {
      case 1: try { try decoder.decodeSingularUInt32Field(value: &self.promptTokens) }()
      case 2: try { try decoder.decodeSingularUInt32Field(value: &self.completionTokens) }()
      case 3: try { try decoder.decodeSingularUInt32Field(value: &self.totalTokens) }()
      default: break
      }
    }
  }

  public func traverse<V: SwiftProtobuf.Visitor>(visitor: inout V) throws {
    if self.promptTokens != 0 {
      try visitor.visitSingularUInt32Field(value: self.promptTokens, fieldNumber: 1)
    }
    if self.completionTokens != 0 {
      try visitor.visitSingularUInt32Field(value: self.completionTokens, fieldNumber: 2)
    }
    if self.totalTokens != 0 {
      try visitor.visitSingularUInt32Field(value: self.totalTokens, fieldNumber: 3)
    }
    try unknownFields.traverse(visitor: &visitor)
  }

  public static func ==(lhs: Azure_Openai_V1_Usage, rhs: Azure_Openai_V1_Usage) -> Bool {
    if lhs.promptTokens != rhs.promptTokens {return false}
    if lhs.completionTokens != rhs.completionTokens {return false}
    if lhs.totalTokens != rhs.totalTokens {return false}
    if lhs.unknownFields != rhs.unknownFields {return false}
    return true
  }
}
