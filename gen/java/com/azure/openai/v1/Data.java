// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: azure/openai/v1/embeddings.proto
// Protobuf Java Version: 4.27.0

package com.azure.openai.v1;

/**
 * Protobuf type {@code azure.openai.v1.Data}
 */
public final class Data extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:azure.openai.v1.Data)
    DataOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 0,
      /* suffix= */ "",
      Data.class.getName());
  }
  // Use Data.newBuilder() to construct.
  private Data(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Data() {
    object_ = "";
    embedding_ = emptyFloatList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.azure.openai.v1.EmbeddingsProto.internal_static_azure_openai_v1_Data_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.azure.openai.v1.EmbeddingsProto.internal_static_azure_openai_v1_Data_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.azure.openai.v1.Data.class, com.azure.openai.v1.Data.Builder.class);
  }

  public static final int INDEX_FIELD_NUMBER = 1;
  private int index_ = 0;
  /**
   * <code>uint32 index = 1 [json_name = "index"];</code>
   * @return The index.
   */
  @java.lang.Override
  public int getIndex() {
    return index_;
  }

  public static final int OBJECT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object object_ = "";
  /**
   * <code>string object = 2 [json_name = "object"];</code>
   * @return The object.
   */
  @java.lang.Override
  public java.lang.String getObject() {
    java.lang.Object ref = object_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      object_ = s;
      return s;
    }
  }
  /**
   * <code>string object = 2 [json_name = "object"];</code>
   * @return The bytes for object.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getObjectBytes() {
    java.lang.Object ref = object_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      object_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EMBEDDING_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.FloatList embedding_ =
      emptyFloatList();
  /**
   * <code>repeated float embedding = 3 [json_name = "embedding"];</code>
   * @return A list containing the embedding.
   */
  @java.lang.Override
  public java.util.List<java.lang.Float>
      getEmbeddingList() {
    return embedding_;
  }
  /**
   * <code>repeated float embedding = 3 [json_name = "embedding"];</code>
   * @return The count of embedding.
   */
  public int getEmbeddingCount() {
    return embedding_.size();
  }
  /**
   * <code>repeated float embedding = 3 [json_name = "embedding"];</code>
   * @param index The index of the element to return.
   * @return The embedding at the given index.
   */
  public float getEmbedding(int index) {
    return embedding_.getFloat(index);
  }
  private int embeddingMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (index_ != 0) {
      output.writeUInt32(1, index_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(object_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, object_);
    }
    if (getEmbeddingList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(embeddingMemoizedSerializedSize);
    }
    for (int i = 0; i < embedding_.size(); i++) {
      output.writeFloatNoTag(embedding_.getFloat(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (index_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, index_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(object_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, object_);
    }
    {
      int dataSize = 0;
      dataSize = 4 * getEmbeddingList().size();
      size += dataSize;
      if (!getEmbeddingList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      embeddingMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.azure.openai.v1.Data)) {
      return super.equals(obj);
    }
    com.azure.openai.v1.Data other = (com.azure.openai.v1.Data) obj;

    if (getIndex()
        != other.getIndex()) return false;
    if (!getObject()
        .equals(other.getObject())) return false;
    if (!getEmbeddingList()
        .equals(other.getEmbeddingList())) return false;
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
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex();
    hash = (37 * hash) + OBJECT_FIELD_NUMBER;
    hash = (53 * hash) + getObject().hashCode();
    if (getEmbeddingCount() > 0) {
      hash = (37 * hash) + EMBEDDING_FIELD_NUMBER;
      hash = (53 * hash) + getEmbeddingList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.azure.openai.v1.Data parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.openai.v1.Data parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.openai.v1.Data parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.openai.v1.Data parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.openai.v1.Data parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.openai.v1.Data parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.openai.v1.Data parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.azure.openai.v1.Data parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.azure.openai.v1.Data parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.azure.openai.v1.Data parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.azure.openai.v1.Data parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.azure.openai.v1.Data parseFrom(
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
  public static Builder newBuilder(com.azure.openai.v1.Data prototype) {
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
   * Protobuf type {@code azure.openai.v1.Data}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:azure.openai.v1.Data)
      com.azure.openai.v1.DataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.azure.openai.v1.EmbeddingsProto.internal_static_azure_openai_v1_Data_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.azure.openai.v1.EmbeddingsProto.internal_static_azure_openai_v1_Data_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.azure.openai.v1.Data.class, com.azure.openai.v1.Data.Builder.class);
    }

    // Construct using com.azure.openai.v1.Data.newBuilder()
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
      index_ = 0;
      object_ = "";
      embedding_ = emptyFloatList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.azure.openai.v1.EmbeddingsProto.internal_static_azure_openai_v1_Data_descriptor;
    }

    @java.lang.Override
    public com.azure.openai.v1.Data getDefaultInstanceForType() {
      return com.azure.openai.v1.Data.getDefaultInstance();
    }

    @java.lang.Override
    public com.azure.openai.v1.Data build() {
      com.azure.openai.v1.Data result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.azure.openai.v1.Data buildPartial() {
      com.azure.openai.v1.Data result = new com.azure.openai.v1.Data(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.azure.openai.v1.Data result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.index_ = index_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.object_ = object_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        embedding_.makeImmutable();
        result.embedding_ = embedding_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.azure.openai.v1.Data) {
        return mergeFrom((com.azure.openai.v1.Data)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.azure.openai.v1.Data other) {
      if (other == com.azure.openai.v1.Data.getDefaultInstance()) return this;
      if (other.getIndex() != 0) {
        setIndex(other.getIndex());
      }
      if (!other.getObject().isEmpty()) {
        object_ = other.object_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.embedding_.isEmpty()) {
        if (embedding_.isEmpty()) {
          embedding_ = other.embedding_;
          embedding_.makeImmutable();
          bitField0_ |= 0x00000004;
        } else {
          ensureEmbeddingIsMutable();
          embedding_.addAll(other.embedding_);
        }
        onChanged();
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
              index_ = input.readUInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              object_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 29: {
              float v = input.readFloat();
              ensureEmbeddingIsMutable();
              embedding_.addFloat(v);
              break;
            } // case 29
            case 26: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              int alloc = length > 4096 ? 4096 : length;
              ensureEmbeddingIsMutable(alloc / 4);
              while (input.getBytesUntilLimit() > 0) {
                embedding_.addFloat(input.readFloat());
              }
              input.popLimit(limit);
              break;
            } // case 26
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

    private int index_ ;
    /**
     * <code>uint32 index = 1 [json_name = "index"];</code>
     * @return The index.
     */
    @java.lang.Override
    public int getIndex() {
      return index_;
    }
    /**
     * <code>uint32 index = 1 [json_name = "index"];</code>
     * @param value The index to set.
     * @return This builder for chaining.
     */
    public Builder setIndex(int value) {

      index_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 index = 1 [json_name = "index"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIndex() {
      bitField0_ = (bitField0_ & ~0x00000001);
      index_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object object_ = "";
    /**
     * <code>string object = 2 [json_name = "object"];</code>
     * @return The object.
     */
    public java.lang.String getObject() {
      java.lang.Object ref = object_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        object_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string object = 2 [json_name = "object"];</code>
     * @return The bytes for object.
     */
    public com.google.protobuf.ByteString
        getObjectBytes() {
      java.lang.Object ref = object_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        object_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string object = 2 [json_name = "object"];</code>
     * @param value The object to set.
     * @return This builder for chaining.
     */
    public Builder setObject(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      object_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string object = 2 [json_name = "object"];</code>
     * @return This builder for chaining.
     */
    public Builder clearObject() {
      object_ = getDefaultInstance().getObject();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string object = 2 [json_name = "object"];</code>
     * @param value The bytes for object to set.
     * @return This builder for chaining.
     */
    public Builder setObjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      object_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.FloatList embedding_ = emptyFloatList();
    private void ensureEmbeddingIsMutable() {
      if (!embedding_.isModifiable()) {
        embedding_ = makeMutableCopy(embedding_);
      }
      bitField0_ |= 0x00000004;
    }
    private void ensureEmbeddingIsMutable(int capacity) {
      if (!embedding_.isModifiable()) {
        embedding_ = makeMutableCopy(embedding_, capacity);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <code>repeated float embedding = 3 [json_name = "embedding"];</code>
     * @return A list containing the embedding.
     */
    public java.util.List<java.lang.Float>
        getEmbeddingList() {
      embedding_.makeImmutable();
      return embedding_;
    }
    /**
     * <code>repeated float embedding = 3 [json_name = "embedding"];</code>
     * @return The count of embedding.
     */
    public int getEmbeddingCount() {
      return embedding_.size();
    }
    /**
     * <code>repeated float embedding = 3 [json_name = "embedding"];</code>
     * @param index The index of the element to return.
     * @return The embedding at the given index.
     */
    public float getEmbedding(int index) {
      return embedding_.getFloat(index);
    }
    /**
     * <code>repeated float embedding = 3 [json_name = "embedding"];</code>
     * @param index The index to set the value at.
     * @param value The embedding to set.
     * @return This builder for chaining.
     */
    public Builder setEmbedding(
        int index, float value) {

      ensureEmbeddingIsMutable();
      embedding_.setFloat(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated float embedding = 3 [json_name = "embedding"];</code>
     * @param value The embedding to add.
     * @return This builder for chaining.
     */
    public Builder addEmbedding(float value) {

      ensureEmbeddingIsMutable();
      embedding_.addFloat(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated float embedding = 3 [json_name = "embedding"];</code>
     * @param values The embedding to add.
     * @return This builder for chaining.
     */
    public Builder addAllEmbedding(
        java.lang.Iterable<? extends java.lang.Float> values) {
      ensureEmbeddingIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, embedding_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>repeated float embedding = 3 [json_name = "embedding"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEmbedding() {
      embedding_ = emptyFloatList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:azure.openai.v1.Data)
  }

  // @@protoc_insertion_point(class_scope:azure.openai.v1.Data)
  private static final com.azure.openai.v1.Data DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.azure.openai.v1.Data();
  }

  public static com.azure.openai.v1.Data getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Data>
      PARSER = new com.google.protobuf.AbstractParser<Data>() {
    @java.lang.Override
    public Data parsePartialFrom(
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

  public static com.google.protobuf.Parser<Data> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Data> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.azure.openai.v1.Data getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

