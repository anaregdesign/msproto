// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: azure/openai/v1/embeddings.proto
// Protobuf Java Version: 4.27.0

package com.azure.openai.v1;

public final class EmbeddingsProto {
  private EmbeddingsProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 0,
      /* suffix= */ "",
      EmbeddingsProto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_azure_openai_v1_EmbeddingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_azure_openai_v1_EmbeddingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_azure_openai_v1_EmbeddingRequest_AdditionalProp1Entry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_azure_openai_v1_EmbeddingRequest_AdditionalProp1Entry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_azure_openai_v1_EmbeddingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_azure_openai_v1_EmbeddingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_azure_openai_v1_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_azure_openai_v1_Data_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n azure/openai/v1/embeddings.proto\022\017azur" +
      "e.openai.v1\032\034azure/openai/v1/entity.prot" +
      "o\"\201\002\n\020EmbeddingRequest\022\024\n\005input\030\001 \001(\tR\005i" +
      "nput\022\022\n\004user\030\002 \001(\tR\004user\022\035\n\ninput_type\030\003" +
      " \001(\tR\tinputType\022`\n\017additionalProp1\030\004 \003(\013" +
      "26.azure.openai.v1.EmbeddingRequest.Addi" +
      "tionalProp1EntryR\017additionalProp1\032B\n\024Add" +
      "itionalProp1Entry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005v" +
      "alue\030\002 \001(\tR\005value:\0028\001\"\232\001\n\021EmbeddingRespo" +
      "nse\022\026\n\006object\030\001 \001(\tR\006object\022\024\n\005model\030\002 \001" +
      "(\tR\005model\022)\n\004data\030\003 \003(\0132\025.azure.openai.v" +
      "1.DataR\004data\022,\n\005usage\030\004 \001(\0132\026.azure.open" +
      "ai.v1.UsageR\005usage\"R\n\004Data\022\024\n\005index\030\001 \001(" +
      "\rR\005index\022\026\n\006object\030\002 \001(\tR\006object\022\034\n\tembe" +
      "dding\030\003 \003(\002R\tembeddingB\305\001\n\023com.azure.ope" +
      "nai.v1B\017EmbeddingsProtoP\001Z?github.com/an" +
      "aregdesign/azure-proto/go/azure/openai/v" +
      "1;openaiv1\242\002\003AOX\252\002\017Azure.Openai.V1\312\002\017Azu" +
      "re\\Openai\\V1\342\002\033Azure\\Openai\\V1\\GPBMetada" +
      "ta\352\002\021Azure::Openai::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.azure.openai.v1.EntityProto.getDescriptor(),
        });
    internal_static_azure_openai_v1_EmbeddingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_azure_openai_v1_EmbeddingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_azure_openai_v1_EmbeddingRequest_descriptor,
        new java.lang.String[] { "Input", "User", "InputType", "AdditionalProp1", });
    internal_static_azure_openai_v1_EmbeddingRequest_AdditionalProp1Entry_descriptor =
      internal_static_azure_openai_v1_EmbeddingRequest_descriptor.getNestedTypes().get(0);
    internal_static_azure_openai_v1_EmbeddingRequest_AdditionalProp1Entry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_azure_openai_v1_EmbeddingRequest_AdditionalProp1Entry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_azure_openai_v1_EmbeddingResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_azure_openai_v1_EmbeddingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_azure_openai_v1_EmbeddingResponse_descriptor,
        new java.lang.String[] { "Object", "Model", "Data", "Usage", });
    internal_static_azure_openai_v1_Data_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_azure_openai_v1_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_azure_openai_v1_Data_descriptor,
        new java.lang.String[] { "Index", "Object", "Embedding", });
    descriptor.resolveAllFeaturesImmutable();
    com.azure.openai.v1.EntityProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
