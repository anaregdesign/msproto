// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: msp/azure/openai/images/v1/generations.proto
// Protobuf Java Version: 4.27.1

package com.msp.azure.openai.images.v1;

public interface ImageGenerationsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:msp.azure.openai.images.v1.ImageGenerationsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string prompt = 1 [json_name = "prompt"];</code>
   * @return The prompt.
   */
  java.lang.String getPrompt();
  /**
   * <code>string prompt = 1 [json_name = "prompt"];</code>
   * @return The bytes for prompt.
   */
  com.google.protobuf.ByteString
      getPromptBytes();

  /**
   * <code>uint32 n = 2 [json_name = "n"];</code>
   * @return The n.
   */
  int getN();

  /**
   * <code>string size = 3 [json_name = "size"];</code>
   * @return The size.
   */
  java.lang.String getSize();
  /**
   * <code>string size = 3 [json_name = "size"];</code>
   * @return The bytes for size.
   */
  com.google.protobuf.ByteString
      getSizeBytes();

  /**
   * <code>string response_format = 4 [json_name = "responseFormat"];</code>
   * @return The responseFormat.
   */
  java.lang.String getResponseFormat();
  /**
   * <code>string response_format = 4 [json_name = "responseFormat"];</code>
   * @return The bytes for responseFormat.
   */
  com.google.protobuf.ByteString
      getResponseFormatBytes();

  /**
   * <code>string user_context = 5 [json_name = "userContext"];</code>
   * @return The userContext.
   */
  java.lang.String getUserContext();
  /**
   * <code>string user_context = 5 [json_name = "userContext"];</code>
   * @return The bytes for userContext.
   */
  com.google.protobuf.ByteString
      getUserContextBytes();

  /**
   * <code>string quality = 6 [json_name = "quality"];</code>
   * @return The quality.
   */
  java.lang.String getQuality();
  /**
   * <code>string quality = 6 [json_name = "quality"];</code>
   * @return The bytes for quality.
   */
  com.google.protobuf.ByteString
      getQualityBytes();

  /**
   * <code>string style = 7 [json_name = "style"];</code>
   * @return The style.
   */
  java.lang.String getStyle();
  /**
   * <code>string style = 7 [json_name = "style"];</code>
   * @return The bytes for style.
   */
  com.google.protobuf.ByteString
      getStyleBytes();
}
