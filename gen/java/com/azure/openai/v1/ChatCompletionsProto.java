// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: azure/openai/v1/chat_completions.proto
// Protobuf Java Version: 4.27.0

package com.azure.openai.v1;

public final class ChatCompletionsProto {
  private ChatCompletionsProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 0,
      /* suffix= */ "",
      ChatCompletionsProto.class.getName());
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
    internal_static_azure_openai_v1_ChatCompletionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_azure_openai_v1_ChatCompletionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_azure_openai_v1_ChatCompletionRequest_LogitBiasEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_azure_openai_v1_ChatCompletionRequest_LogitBiasEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_azure_openai_v1_ChatCompletionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_azure_openai_v1_ChatCompletionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_azure_openai_v1_ChatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_azure_openai_v1_ChatMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_azure_openai_v1_ContentPartImage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_azure_openai_v1_ContentPartImage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_azure_openai_v1_ChatChoice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_azure_openai_v1_ChatChoice_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&azure/openai/v1/chat_completions.proto" +
      "\022\017azure.openai.v1\032\034azure/openai/v1/entit" +
      "y.proto\"\274\007\n\025ChatCompletionRequest\0228\n\010mes" +
      "sages\030\001 \003(\0132\034.azure.openai.v1.ChatMessag" +
      "eR\010messages\022%\n\013temperature\030\002 \001(\002H\000R\013temp" +
      "erature\210\001\001\022\022\n\004role\030\003 \001(\tR\004role\022&\n\014conten" +
      "t_part\030\004 \001(\tH\001R\013ContentPart\210\001\001\022T\n\022conten" +
      "t_part_image\030\005 \001(\0132!.azure.openai.v1.Con" +
      "tentPartImageH\002R\020ContentPartImage\210\001\001\022\021\n\001" +
      "n\030\006 \001(\rH\003R\001n\210\001\001\022\033\n\006stream\030\007 \001(\010H\004R\006strea" +
      "m\210\001\001\022\022\n\004stop\030\010 \003(\tR\004stop\022\"\n\nmax_tokens\030\t" +
      " \001(\rH\005R\tmaxTokens\210\001\001\022.\n\020presence_penalty" +
      "\030\n \001(\002H\006R\017presencePenalty\210\001\001\0220\n\021frequenc" +
      "y_penalty\030\013 \001(\002H\007R\020frequencyPenalty\210\001\001\022T" +
      "\n\nlogit_bias\030\014 \003(\01325.azure.openai.v1.Cha" +
      "tCompletionRequest.LogitBiasEntryR\tlogit" +
      "Bias\022\027\n\004user\030\r \001(\tH\010R\004user\210\001\001\022\030\n\005top_p\030\016" +
      " \001(\002H\tR\004topP\210\001\001\022 \n\tlog_probs\030\017 \001(\010H\nR\010lo" +
      "gProbs\210\001\001\022&\n\014top_logprobs\030\020 \001(\rH\013R\013topLo" +
      "gprobs\210\001\001\022\027\n\004seed\030\021 \001(\rH\014R\004seed\210\001\001\032<\n\016Lo" +
      "gitBiasEntry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030" +
      "\002 \001(\002R\005value:\0028\001B\016\n\014_temperatureB\017\n\r_con" +
      "tent_partB\025\n\023_content_part_imageB\004\n\002_nB\t" +
      "\n\007_streamB\r\n\013_max_tokensB\023\n\021_presence_pe" +
      "naltyB\024\n\022_frequency_penaltyB\007\n\005_userB\010\n\006" +
      "_top_pB\014\n\n_log_probsB\017\n\r_top_logprobsB\007\n" +
      "\005_seed\"\325\001\n\026ChatCompletionResponse\022\016\n\002id\030" +
      "\001 \001(\tR\002id\022\026\n\006object\030\002 \001(\tR\006object\022\030\n\007cre" +
      "ated\030\003 \001(\rR\007created\022\024\n\005model\030\004 \001(\tR\005mode" +
      "l\022,\n\005usage\030\005 \001(\0132\026.azure.openai.v1.Usage" +
      "R\005usage\0225\n\007choices\030\006 \003(\0132\033.azure.openai." +
      "v1.ChatChoiceR\007choices\"O\n\013ChatMessage\022\030\n" +
      "\007content\030\001 \001(\tR\007content\022\022\n\004name\030\002 \001(\tR\004n" +
      "ame\022\022\n\004role\030\003 \001(\tR\004role\"<\n\020ContentPartIm" +
      "age\022\020\n\003url\030\001 \001(\tR\003url\022\026\n\006detail\030\002 \001(\tR\006d" +
      "etail\"\177\n\nChatChoice\0226\n\007message\030\001 \001(\0132\034.a" +
      "zure.openai.v1.ChatMessageR\007message\022#\n\rf" +
      "inish_reason\030\002 \001(\tR\014finishReason\022\024\n\005inde" +
      "x\030\003 \001(\rR\005indexB\312\001\n\023com.azure.openai.v1B\024" +
      "ChatCompletionsProtoP\001Z?github.com/anare" +
      "gdesign/azure-proto/go/azure/openai/v1;o" +
      "penaiv1\242\002\003AOX\252\002\017Azure.Openai.V1\312\002\017Azure\\" +
      "Openai\\V1\342\002\033Azure\\Openai\\V1\\GPBMetadata\352" +
      "\002\021Azure::Openai::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.azure.openai.v1.EntityProto.getDescriptor(),
        });
    internal_static_azure_openai_v1_ChatCompletionRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_azure_openai_v1_ChatCompletionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_azure_openai_v1_ChatCompletionRequest_descriptor,
        new java.lang.String[] { "Messages", "Temperature", "Role", "ContentPart", "ContentPartImage", "N", "Stream", "Stop", "MaxTokens", "PresencePenalty", "FrequencyPenalty", "LogitBias", "User", "TopP", "LogProbs", "TopLogprobs", "Seed", });
    internal_static_azure_openai_v1_ChatCompletionRequest_LogitBiasEntry_descriptor =
      internal_static_azure_openai_v1_ChatCompletionRequest_descriptor.getNestedTypes().get(0);
    internal_static_azure_openai_v1_ChatCompletionRequest_LogitBiasEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_azure_openai_v1_ChatCompletionRequest_LogitBiasEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_azure_openai_v1_ChatCompletionResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_azure_openai_v1_ChatCompletionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_azure_openai_v1_ChatCompletionResponse_descriptor,
        new java.lang.String[] { "Id", "Object", "Created", "Model", "Usage", "Choices", });
    internal_static_azure_openai_v1_ChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_azure_openai_v1_ChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_azure_openai_v1_ChatMessage_descriptor,
        new java.lang.String[] { "Content", "Name", "Role", });
    internal_static_azure_openai_v1_ContentPartImage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_azure_openai_v1_ContentPartImage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_azure_openai_v1_ContentPartImage_descriptor,
        new java.lang.String[] { "Url", "Detail", });
    internal_static_azure_openai_v1_ChatChoice_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_azure_openai_v1_ChatChoice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_azure_openai_v1_ChatChoice_descriptor,
        new java.lang.String[] { "Message", "FinishReason", "Index", });
    descriptor.resolveAllFeaturesImmutable();
    com.azure.openai.v1.EntityProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
