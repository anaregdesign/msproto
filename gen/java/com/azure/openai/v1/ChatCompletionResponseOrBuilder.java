// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: azure/openai/v1/chat_completions.proto
// Protobuf Java Version: 4.27.0

package com.azure.openai.v1;

public interface ChatCompletionResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:azure.openai.v1.ChatCompletionResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string object = 2 [json_name = "object"];</code>
   * @return The object.
   */
  java.lang.String getObject();
  /**
   * <code>string object = 2 [json_name = "object"];</code>
   * @return The bytes for object.
   */
  com.google.protobuf.ByteString
      getObjectBytes();

  /**
   * <code>uint32 created = 3 [json_name = "created"];</code>
   * @return The created.
   */
  int getCreated();

  /**
   * <code>string model = 4 [json_name = "model"];</code>
   * @return The model.
   */
  java.lang.String getModel();
  /**
   * <code>string model = 4 [json_name = "model"];</code>
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <code>.azure.openai.v1.Usage usage = 5 [json_name = "usage"];</code>
   * @return Whether the usage field is set.
   */
  boolean hasUsage();
  /**
   * <code>.azure.openai.v1.Usage usage = 5 [json_name = "usage"];</code>
   * @return The usage.
   */
  com.azure.openai.v1.Usage getUsage();
  /**
   * <code>.azure.openai.v1.Usage usage = 5 [json_name = "usage"];</code>
   */
  com.azure.openai.v1.UsageOrBuilder getUsageOrBuilder();

  /**
   * <code>repeated .azure.openai.v1.ChatChoice choices = 6 [json_name = "choices"];</code>
   */
  java.util.List<com.azure.openai.v1.ChatChoice> 
      getChoicesList();
  /**
   * <code>repeated .azure.openai.v1.ChatChoice choices = 6 [json_name = "choices"];</code>
   */
  com.azure.openai.v1.ChatChoice getChoices(int index);
  /**
   * <code>repeated .azure.openai.v1.ChatChoice choices = 6 [json_name = "choices"];</code>
   */
  int getChoicesCount();
  /**
   * <code>repeated .azure.openai.v1.ChatChoice choices = 6 [json_name = "choices"];</code>
   */
  java.util.List<? extends com.azure.openai.v1.ChatChoiceOrBuilder> 
      getChoicesOrBuilderList();
  /**
   * <code>repeated .azure.openai.v1.ChatChoice choices = 6 [json_name = "choices"];</code>
   */
  com.azure.openai.v1.ChatChoiceOrBuilder getChoicesOrBuilder(
      int index);
}