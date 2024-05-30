// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: azure/openai/v1/entity.proto
// Protobuf Java Version: 4.27.0

package com.azure.openai.v1;

public interface UsageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:azure.openai.v1.Usage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 prompt_tokens = 1 [json_name = "promptTokens"];</code>
   * @return The promptTokens.
   */
  int getPromptTokens();

  /**
   * <code>uint32 completion_tokens = 2 [json_name = "completionTokens"];</code>
   * @return The completionTokens.
   */
  int getCompletionTokens();

  /**
   * <code>uint32 total_tokens = 3 [json_name = "totalTokens"];</code>
   * @return The totalTokens.
   */
  int getTotalTokens();
}
