// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: azure/openai/v1/entity.proto
// Protobuf Java Version: 4.27.0

package com.azure.openai.v1;

/**
 * Protobuf type {@code azure.openai.v1.ContentFilterDetectedResult}
 */
public final class ContentFilterDetectedResult extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:azure.openai.v1.ContentFilterDetectedResult)
    ContentFilterDetectedResultOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 0,
      /* suffix= */ "",
      ContentFilterDetectedResult.class.getName());
  }
  // Use ContentFilterDetectedResult.newBuilder() to construct.
  private ContentFilterDetectedResult(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ContentFilterDetectedResult() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.azure.openai.v1.EntityProto.internal_static_azure_openai_v1_ContentFilterDetectedResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.azure.openai.v1.EntityProto.internal_static_azure_openai_v1_ContentFilterDetectedResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.azure.openai.v1.ContentFilterDetectedResult.class, com.azure.openai.v1.ContentFilterDetectedResult.Builder.class);
  }

  public static final int FILTERED_FIELD_NUMBER = 1;
  private boolean filtered_ = false;
  /**
   * <code>bool filtered = 1 [json_name = "filtered"];</code>
   * @return The filtered.
   */
  @java.lang.Override
  public boolean getFiltered() {
    return filtered_;
  }

  public static final int DETECTED_FIELD_NUMBER = 2;
  private boolean detected_ = false;
  /**
   * <code>bool detected = 2 [json_name = "detected"];</code>
   * @return The detected.
   */
  @java.lang.Override
  public boolean getDetected() {
    return detected_;
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
    if (filtered_ != false) {
      output.writeBool(1, filtered_);
    }
    if (detected_ != false) {
      output.writeBool(2, detected_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (filtered_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, filtered_);
    }
    if (detected_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, detected_);
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
    if (!(obj instanceof com.azure.openai.v1.ContentFilterDetectedResult)) {
      return super.equals(obj);
    }
    com.azure.openai.v1.ContentFilterDetectedResult other = (com.azure.openai.v1.ContentFilterDetectedResult) obj;

    if (getFiltered()
        != other.getFiltered()) return false;
    if (getDetected()
        != other.getDetected()) return false;
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
    hash = (37 * hash) + FILTERED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFiltered());
    hash = (37 * hash) + DETECTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDetected());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.azure.openai.v1.ContentFilterDetectedResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.openai.v1.ContentFilterDetectedResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.openai.v1.ContentFilterDetectedResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.openai.v1.ContentFilterDetectedResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.openai.v1.ContentFilterDetectedResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.openai.v1.ContentFilterDetectedResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.openai.v1.ContentFilterDetectedResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.azure.openai.v1.ContentFilterDetectedResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.azure.openai.v1.ContentFilterDetectedResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.azure.openai.v1.ContentFilterDetectedResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.azure.openai.v1.ContentFilterDetectedResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.azure.openai.v1.ContentFilterDetectedResult parseFrom(
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
  public static Builder newBuilder(com.azure.openai.v1.ContentFilterDetectedResult prototype) {
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
   * Protobuf type {@code azure.openai.v1.ContentFilterDetectedResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:azure.openai.v1.ContentFilterDetectedResult)
      com.azure.openai.v1.ContentFilterDetectedResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.azure.openai.v1.EntityProto.internal_static_azure_openai_v1_ContentFilterDetectedResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.azure.openai.v1.EntityProto.internal_static_azure_openai_v1_ContentFilterDetectedResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.azure.openai.v1.ContentFilterDetectedResult.class, com.azure.openai.v1.ContentFilterDetectedResult.Builder.class);
    }

    // Construct using com.azure.openai.v1.ContentFilterDetectedResult.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      filtered_ = false;
      detected_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.azure.openai.v1.EntityProto.internal_static_azure_openai_v1_ContentFilterDetectedResult_descriptor;
    }

    @java.lang.Override
    public com.azure.openai.v1.ContentFilterDetectedResult getDefaultInstanceForType() {
      return com.azure.openai.v1.ContentFilterDetectedResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.azure.openai.v1.ContentFilterDetectedResult build() {
      com.azure.openai.v1.ContentFilterDetectedResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.azure.openai.v1.ContentFilterDetectedResult buildPartial() {
      com.azure.openai.v1.ContentFilterDetectedResult result = new com.azure.openai.v1.ContentFilterDetectedResult(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.azure.openai.v1.ContentFilterDetectedResult result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.filtered_ = filtered_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.detected_ = detected_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.azure.openai.v1.ContentFilterDetectedResult) {
        return mergeFrom((com.azure.openai.v1.ContentFilterDetectedResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.azure.openai.v1.ContentFilterDetectedResult other) {
      if (other == com.azure.openai.v1.ContentFilterDetectedResult.getDefaultInstance()) return this;
      if (other.getFiltered() != false) {
        setFiltered(other.getFiltered());
      }
      if (other.getDetected() != false) {
        setDetected(other.getDetected());
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
            case 8: {
              filtered_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              detected_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private boolean filtered_ ;
    /**
     * <code>bool filtered = 1 [json_name = "filtered"];</code>
     * @return The filtered.
     */
    @java.lang.Override
    public boolean getFiltered() {
      return filtered_;
    }
    /**
     * <code>bool filtered = 1 [json_name = "filtered"];</code>
     * @param value The filtered to set.
     * @return This builder for chaining.
     */
    public Builder setFiltered(boolean value) {

      filtered_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bool filtered = 1 [json_name = "filtered"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFiltered() {
      bitField0_ = (bitField0_ & ~0x00000001);
      filtered_ = false;
      onChanged();
      return this;
    }

    private boolean detected_ ;
    /**
     * <code>bool detected = 2 [json_name = "detected"];</code>
     * @return The detected.
     */
    @java.lang.Override
    public boolean getDetected() {
      return detected_;
    }
    /**
     * <code>bool detected = 2 [json_name = "detected"];</code>
     * @param value The detected to set.
     * @return This builder for chaining.
     */
    public Builder setDetected(boolean value) {

      detected_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool detected = 2 [json_name = "detected"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDetected() {
      bitField0_ = (bitField0_ & ~0x00000002);
      detected_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:azure.openai.v1.ContentFilterDetectedResult)
  }

  // @@protoc_insertion_point(class_scope:azure.openai.v1.ContentFilterDetectedResult)
  private static final com.azure.openai.v1.ContentFilterDetectedResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.azure.openai.v1.ContentFilterDetectedResult();
  }

  public static com.azure.openai.v1.ContentFilterDetectedResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContentFilterDetectedResult>
      PARSER = new com.google.protobuf.AbstractParser<ContentFilterDetectedResult>() {
    @java.lang.Override
    public ContentFilterDetectedResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<ContentFilterDetectedResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContentFilterDetectedResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.azure.openai.v1.ContentFilterDetectedResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
