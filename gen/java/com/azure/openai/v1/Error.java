// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: azure/openai/v1/completions.proto
// Protobuf Java Version: 4.27.0

package com.azure.openai.v1;

/**
 * Protobuf type {@code azure.openai.v1.Error}
 */
public final class Error extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:azure.openai.v1.Error)
    ErrorOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 0,
      /* suffix= */ "",
      Error.class.getName());
  }
  // Use Error.newBuilder() to construct.
  private Error(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Error() {
    code_ = "";
    message_ = "";
    param_ = "";
    type_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.azure.openai.v1.CompletionsProto.internal_static_azure_openai_v1_Error_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.azure.openai.v1.CompletionsProto.internal_static_azure_openai_v1_Error_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.azure.openai.v1.Error.class, com.azure.openai.v1.Error.Builder.class);
  }

  private int bitField0_;
  public static final int CODE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object code_ = "";
  /**
   * <code>string code = 1 [json_name = "code"];</code>
   * @return The code.
   */
  @java.lang.Override
  public java.lang.String getCode() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      code_ = s;
      return s;
    }
  }
  /**
   * <code>string code = 1 [json_name = "code"];</code>
   * @return The bytes for code.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCodeBytes() {
    java.lang.Object ref = code_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      code_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARAM_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object param_ = "";
  /**
   * <code>string param = 3 [json_name = "param"];</code>
   * @return The param.
   */
  @java.lang.Override
  public java.lang.String getParam() {
    java.lang.Object ref = param_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      param_ = s;
      return s;
    }
  }
  /**
   * <code>string param = 3 [json_name = "param"];</code>
   * @return The bytes for param.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getParamBytes() {
    java.lang.Object ref = param_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      param_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TYPE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   * <code>string type = 4 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <code>string type = 4 [json_name = "type"];</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INNER_ERROR_FIELD_NUMBER = 5;
  private com.azure.openai.v1.InnerError innerError_;
  /**
   * <code>.azure.openai.v1.InnerError inner_error = 5 [json_name = "innerError"];</code>
   * @return Whether the innerError field is set.
   */
  @java.lang.Override
  public boolean hasInnerError() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.azure.openai.v1.InnerError inner_error = 5 [json_name = "innerError"];</code>
   * @return The innerError.
   */
  @java.lang.Override
  public com.azure.openai.v1.InnerError getInnerError() {
    return innerError_ == null ? com.azure.openai.v1.InnerError.getDefaultInstance() : innerError_;
  }
  /**
   * <code>.azure.openai.v1.InnerError inner_error = 5 [json_name = "innerError"];</code>
   */
  @java.lang.Override
  public com.azure.openai.v1.InnerErrorOrBuilder getInnerErrorOrBuilder() {
    return innerError_ == null ? com.azure.openai.v1.InnerError.getDefaultInstance() : innerError_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(code_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, code_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, message_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(param_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, param_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, type_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(5, getInnerError());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(code_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, code_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, message_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(param_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, param_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, type_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getInnerError());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.azure.openai.v1.Error)) {
      return super.equals(obj);
    }
    com.azure.openai.v1.Error other = (com.azure.openai.v1.Error) obj;

    if (!getCode()
        .equals(other.getCode())) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!getParam()
        .equals(other.getParam())) return false;
    if (!getType()
        .equals(other.getType())) return false;
    if (hasInnerError() != other.hasInnerError()) return false;
    if (hasInnerError()) {
      if (!getInnerError()
          .equals(other.getInnerError())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (37 * hash) + PARAM_FIELD_NUMBER;
    hash = (53 * hash) + getParam().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    if (hasInnerError()) {
      hash = (37 * hash) + INNER_ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getInnerError().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.azure.openai.v1.Error parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.openai.v1.Error parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.openai.v1.Error parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.openai.v1.Error parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.openai.v1.Error parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.openai.v1.Error parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.openai.v1.Error parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.azure.openai.v1.Error parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.azure.openai.v1.Error parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.azure.openai.v1.Error parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.azure.openai.v1.Error parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.azure.openai.v1.Error parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.azure.openai.v1.Error prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code azure.openai.v1.Error}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:azure.openai.v1.Error)
      com.azure.openai.v1.ErrorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.azure.openai.v1.CompletionsProto.internal_static_azure_openai_v1_Error_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.azure.openai.v1.CompletionsProto.internal_static_azure_openai_v1_Error_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.azure.openai.v1.Error.class, com.azure.openai.v1.Error.Builder.class);
    }

    // Construct using com.azure.openai.v1.Error.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getInnerErrorFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      code_ = "";
      message_ = "";
      param_ = "";
      type_ = "";
      innerError_ = null;
      if (innerErrorBuilder_ != null) {
        innerErrorBuilder_.dispose();
        innerErrorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.azure.openai.v1.CompletionsProto.internal_static_azure_openai_v1_Error_descriptor;
    }

    @java.lang.Override
    public com.azure.openai.v1.Error getDefaultInstanceForType() {
      return com.azure.openai.v1.Error.getDefaultInstance();
    }

    @java.lang.Override
    public com.azure.openai.v1.Error build() {
      com.azure.openai.v1.Error result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.azure.openai.v1.Error buildPartial() {
      com.azure.openai.v1.Error result = new com.azure.openai.v1.Error(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.azure.openai.v1.Error result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.code_ = code_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.message_ = message_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.param_ = param_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.type_ = type_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.innerError_ = innerErrorBuilder_ == null
            ? innerError_
            : innerErrorBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.azure.openai.v1.Error) {
        return mergeFrom((com.azure.openai.v1.Error)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.azure.openai.v1.Error other) {
      if (other == com.azure.openai.v1.Error.getDefaultInstance()) return this;
      if (!other.getCode().isEmpty()) {
        code_ = other.code_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getParam().isEmpty()) {
        param_ = other.param_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (other.hasInnerError()) {
        mergeInnerError(other.getInnerError());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              code_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              message_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              param_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              type_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              input.readMessage(
                  getInnerErrorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object code_ = "";
    /**
     * <code>string code = 1 [json_name = "code"];</code>
     * @return The code.
     */
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string code = 1 [json_name = "code"];</code>
     * @return The bytes for code.
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string code = 1 [json_name = "code"];</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      code_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string code = 1 [json_name = "code"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      code_ = getDefaultInstance().getCode();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string code = 1 [json_name = "code"];</code>
     * @param value The bytes for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      code_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2 [json_name = "message"];</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2 [json_name = "message"];</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2 [json_name = "message"];</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2 [json_name = "message"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2 [json_name = "message"];</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object param_ = "";
    /**
     * <code>string param = 3 [json_name = "param"];</code>
     * @return The param.
     */
    public java.lang.String getParam() {
      java.lang.Object ref = param_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        param_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string param = 3 [json_name = "param"];</code>
     * @return The bytes for param.
     */
    public com.google.protobuf.ByteString
        getParamBytes() {
      java.lang.Object ref = param_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        param_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string param = 3 [json_name = "param"];</code>
     * @param value The param to set.
     * @return This builder for chaining.
     */
    public Builder setParam(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      param_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string param = 3 [json_name = "param"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParam() {
      param_ = getDefaultInstance().getParam();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string param = 3 [json_name = "param"];</code>
     * @param value The bytes for param to set.
     * @return This builder for chaining.
     */
    public Builder setParamBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      param_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 4 [json_name = "type"];</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string type = 4 [json_name = "type"];</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string type = 4 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      type_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 4 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string type = 4 [json_name = "type"];</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private com.azure.openai.v1.InnerError innerError_;
    private com.google.protobuf.SingleFieldBuilder<
        com.azure.openai.v1.InnerError, com.azure.openai.v1.InnerError.Builder, com.azure.openai.v1.InnerErrorOrBuilder> innerErrorBuilder_;
    /**
     * <code>.azure.openai.v1.InnerError inner_error = 5 [json_name = "innerError"];</code>
     * @return Whether the innerError field is set.
     */
    public boolean hasInnerError() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <code>.azure.openai.v1.InnerError inner_error = 5 [json_name = "innerError"];</code>
     * @return The innerError.
     */
    public com.azure.openai.v1.InnerError getInnerError() {
      if (innerErrorBuilder_ == null) {
        return innerError_ == null ? com.azure.openai.v1.InnerError.getDefaultInstance() : innerError_;
      } else {
        return innerErrorBuilder_.getMessage();
      }
    }
    /**
     * <code>.azure.openai.v1.InnerError inner_error = 5 [json_name = "innerError"];</code>
     */
    public Builder setInnerError(com.azure.openai.v1.InnerError value) {
      if (innerErrorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        innerError_ = value;
      } else {
        innerErrorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.azure.openai.v1.InnerError inner_error = 5 [json_name = "innerError"];</code>
     */
    public Builder setInnerError(
        com.azure.openai.v1.InnerError.Builder builderForValue) {
      if (innerErrorBuilder_ == null) {
        innerError_ = builderForValue.build();
      } else {
        innerErrorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.azure.openai.v1.InnerError inner_error = 5 [json_name = "innerError"];</code>
     */
    public Builder mergeInnerError(com.azure.openai.v1.InnerError value) {
      if (innerErrorBuilder_ == null) {
        if (((bitField0_ & 0x00000010) != 0) &&
          innerError_ != null &&
          innerError_ != com.azure.openai.v1.InnerError.getDefaultInstance()) {
          getInnerErrorBuilder().mergeFrom(value);
        } else {
          innerError_ = value;
        }
      } else {
        innerErrorBuilder_.mergeFrom(value);
      }
      if (innerError_ != null) {
        bitField0_ |= 0x00000010;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.azure.openai.v1.InnerError inner_error = 5 [json_name = "innerError"];</code>
     */
    public Builder clearInnerError() {
      bitField0_ = (bitField0_ & ~0x00000010);
      innerError_ = null;
      if (innerErrorBuilder_ != null) {
        innerErrorBuilder_.dispose();
        innerErrorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.azure.openai.v1.InnerError inner_error = 5 [json_name = "innerError"];</code>
     */
    public com.azure.openai.v1.InnerError.Builder getInnerErrorBuilder() {
      bitField0_ |= 0x00000010;
      onChanged();
      return getInnerErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>.azure.openai.v1.InnerError inner_error = 5 [json_name = "innerError"];</code>
     */
    public com.azure.openai.v1.InnerErrorOrBuilder getInnerErrorOrBuilder() {
      if (innerErrorBuilder_ != null) {
        return innerErrorBuilder_.getMessageOrBuilder();
      } else {
        return innerError_ == null ?
            com.azure.openai.v1.InnerError.getDefaultInstance() : innerError_;
      }
    }
    /**
     * <code>.azure.openai.v1.InnerError inner_error = 5 [json_name = "innerError"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.azure.openai.v1.InnerError, com.azure.openai.v1.InnerError.Builder, com.azure.openai.v1.InnerErrorOrBuilder> 
        getInnerErrorFieldBuilder() {
      if (innerErrorBuilder_ == null) {
        innerErrorBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.azure.openai.v1.InnerError, com.azure.openai.v1.InnerError.Builder, com.azure.openai.v1.InnerErrorOrBuilder>(
                getInnerError(),
                getParentForChildren(),
                isClean());
        innerError_ = null;
      }
      return innerErrorBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:azure.openai.v1.Error)
  }

  // @@protoc_insertion_point(class_scope:azure.openai.v1.Error)
  private static final com.azure.openai.v1.Error DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.azure.openai.v1.Error();
  }

  public static com.azure.openai.v1.Error getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Error>
      PARSER = new com.google.protobuf.AbstractParser<Error>() {
    @java.lang.Override
    public Error parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Error> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Error> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.azure.openai.v1.Error getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
