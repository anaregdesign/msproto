// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: azure/openai/v1/chat_completions.proto
// Protobuf Java Version: 4.27.0

package com.azure.openai.v1;

public interface ChatCompletionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:azure.openai.v1.ChatCompletionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .azure.openai.v1.ChatMessage messages = 1 [json_name = "messages"];</code>
   */
  java.util.List<com.azure.openai.v1.ChatMessage> 
      getMessagesList();
  /**
   * <code>repeated .azure.openai.v1.ChatMessage messages = 1 [json_name = "messages"];</code>
   */
  com.azure.openai.v1.ChatMessage getMessages(int index);
  /**
   * <code>repeated .azure.openai.v1.ChatMessage messages = 1 [json_name = "messages"];</code>
   */
  int getMessagesCount();
  /**
   * <code>repeated .azure.openai.v1.ChatMessage messages = 1 [json_name = "messages"];</code>
   */
  java.util.List<? extends com.azure.openai.v1.ChatMessageOrBuilder> 
      getMessagesOrBuilderList();
  /**
   * <code>repeated .azure.openai.v1.ChatMessage messages = 1 [json_name = "messages"];</code>
   */
  com.azure.openai.v1.ChatMessageOrBuilder getMessagesOrBuilder(
      int index);

  /**
   * <code>optional float temperature = 2 [json_name = "temperature"];</code>
   * @return Whether the temperature field is set.
   */
  boolean hasTemperature();
  /**
   * <code>optional float temperature = 2 [json_name = "temperature"];</code>
   * @return The temperature.
   */
  float getTemperature();

  /**
   * <code>string role = 3 [json_name = "role"];</code>
   * @return The role.
   */
  java.lang.String getRole();
  /**
   * <code>string role = 3 [json_name = "role"];</code>
   * @return The bytes for role.
   */
  com.google.protobuf.ByteString
      getRoleBytes();

  /**
   * <pre>
   * FIXME: for vision
   * </pre>
   *
   * <code>optional string content_part = 4 [json_name = "ContentPart"];</code>
   * @return Whether the contentPart field is set.
   */
  boolean hasContentPart();
  /**
   * <pre>
   * FIXME: for vision
   * </pre>
   *
   * <code>optional string content_part = 4 [json_name = "ContentPart"];</code>
   * @return The contentPart.
   */
  java.lang.String getContentPart();
  /**
   * <pre>
   * FIXME: for vision
   * </pre>
   *
   * <code>optional string content_part = 4 [json_name = "ContentPart"];</code>
   * @return The bytes for contentPart.
   */
  com.google.protobuf.ByteString
      getContentPartBytes();

  /**
   * <pre>
   * FIXME: for vision
   * </pre>
   *
   * <code>optional .azure.openai.v1.ContentPartImage content_part_image = 5 [json_name = "ContentPartImage"];</code>
   * @return Whether the contentPartImage field is set.
   */
  boolean hasContentPartImage();
  /**
   * <pre>
   * FIXME: for vision
   * </pre>
   *
   * <code>optional .azure.openai.v1.ContentPartImage content_part_image = 5 [json_name = "ContentPartImage"];</code>
   * @return The contentPartImage.
   */
  com.azure.openai.v1.ContentPartImage getContentPartImage();
  /**
   * <pre>
   * FIXME: for vision
   * </pre>
   *
   * <code>optional .azure.openai.v1.ContentPartImage content_part_image = 5 [json_name = "ContentPartImage"];</code>
   */
  com.azure.openai.v1.ContentPartImageOrBuilder getContentPartImageOrBuilder();

  /**
   * <code>optional uint32 n = 6 [json_name = "n"];</code>
   * @return Whether the n field is set.
   */
  boolean hasN();
  /**
   * <code>optional uint32 n = 6 [json_name = "n"];</code>
   * @return The n.
   */
  int getN();

  /**
   * <code>optional bool stream = 7 [json_name = "stream"];</code>
   * @return Whether the stream field is set.
   */
  boolean hasStream();
  /**
   * <code>optional bool stream = 7 [json_name = "stream"];</code>
   * @return The stream.
   */
  boolean getStream();

  /**
   * <code>repeated string stop = 8 [json_name = "stop"];</code>
   * @return A list containing the stop.
   */
  java.util.List<java.lang.String>
      getStopList();
  /**
   * <code>repeated string stop = 8 [json_name = "stop"];</code>
   * @return The count of stop.
   */
  int getStopCount();
  /**
   * <code>repeated string stop = 8 [json_name = "stop"];</code>
   * @param index The index of the element to return.
   * @return The stop at the given index.
   */
  java.lang.String getStop(int index);
  /**
   * <code>repeated string stop = 8 [json_name = "stop"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the stop at the given index.
   */
  com.google.protobuf.ByteString
      getStopBytes(int index);

  /**
   * <code>optional uint32 max_tokens = 9 [json_name = "maxTokens"];</code>
   * @return Whether the maxTokens field is set.
   */
  boolean hasMaxTokens();
  /**
   * <code>optional uint32 max_tokens = 9 [json_name = "maxTokens"];</code>
   * @return The maxTokens.
   */
  int getMaxTokens();

  /**
   * <code>optional float presence_penalty = 10 [json_name = "presencePenalty"];</code>
   * @return Whether the presencePenalty field is set.
   */
  boolean hasPresencePenalty();
  /**
   * <code>optional float presence_penalty = 10 [json_name = "presencePenalty"];</code>
   * @return The presencePenalty.
   */
  float getPresencePenalty();

  /**
   * <code>optional float frequency_penalty = 11 [json_name = "frequencyPenalty"];</code>
   * @return Whether the frequencyPenalty field is set.
   */
  boolean hasFrequencyPenalty();
  /**
   * <code>optional float frequency_penalty = 11 [json_name = "frequencyPenalty"];</code>
   * @return The frequencyPenalty.
   */
  float getFrequencyPenalty();

  /**
   * <code>map&lt;string, float&gt; logit_bias = 12 [json_name = "logitBias"];</code>
   */
  int getLogitBiasCount();
  /**
   * <code>map&lt;string, float&gt; logit_bias = 12 [json_name = "logitBias"];</code>
   */
  boolean containsLogitBias(
      java.lang.String key);
  /**
   * Use {@link #getLogitBiasMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Float>
  getLogitBias();
  /**
   * <code>map&lt;string, float&gt; logit_bias = 12 [json_name = "logitBias"];</code>
   */
  java.util.Map<java.lang.String, java.lang.Float>
  getLogitBiasMap();
  /**
   * <code>map&lt;string, float&gt; logit_bias = 12 [json_name = "logitBias"];</code>
   */
  float getLogitBiasOrDefault(
      java.lang.String key,
      float defaultValue);
  /**
   * <code>map&lt;string, float&gt; logit_bias = 12 [json_name = "logitBias"];</code>
   */
  float getLogitBiasOrThrow(
      java.lang.String key);

  /**
   * <code>optional string user = 13 [json_name = "user"];</code>
   * @return Whether the user field is set.
   */
  boolean hasUser();
  /**
   * <code>optional string user = 13 [json_name = "user"];</code>
   * @return The user.
   */
  java.lang.String getUser();
  /**
   * <code>optional string user = 13 [json_name = "user"];</code>
   * @return The bytes for user.
   */
  com.google.protobuf.ByteString
      getUserBytes();

  /**
   * <code>optional float top_p = 14 [json_name = "topP"];</code>
   * @return Whether the topP field is set.
   */
  boolean hasTopP();
  /**
   * <code>optional float top_p = 14 [json_name = "topP"];</code>
   * @return The topP.
   */
  float getTopP();

  /**
   * <code>optional bool log_probs = 15 [json_name = "logProbs"];</code>
   * @return Whether the logProbs field is set.
   */
  boolean hasLogProbs();
  /**
   * <code>optional bool log_probs = 15 [json_name = "logProbs"];</code>
   * @return The logProbs.
   */
  boolean getLogProbs();

  /**
   * <code>optional uint32 top_logprobs = 16 [json_name = "topLogprobs"];</code>
   * @return Whether the topLogprobs field is set.
   */
  boolean hasTopLogprobs();
  /**
   * <code>optional uint32 top_logprobs = 16 [json_name = "topLogprobs"];</code>
   * @return The topLogprobs.
   */
  int getTopLogprobs();

  /**
   * <code>optional uint32 seed = 17 [json_name = "seed"];</code>
   * @return Whether the seed field is set.
   */
  boolean hasSeed();
  /**
   * <code>optional uint32 seed = 17 [json_name = "seed"];</code>
   * @return The seed.
   */
  int getSeed();
}
