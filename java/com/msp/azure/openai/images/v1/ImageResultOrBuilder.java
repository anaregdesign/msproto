// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: msp/azure/openai/images/v1/generations.proto
// Protobuf Java Version: 4.27.0

package com.msp.azure.openai.images.v1;

public interface ImageResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:msp.azure.openai.images.v1.ImageResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string url = 1 [json_name = "url"];</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <code>string url = 1 [json_name = "url"];</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <code>string b64_json = 2 [json_name = "b64Json"];</code>
   * @return The b64Json.
   */
  java.lang.String getB64Json();
  /**
   * <code>string b64_json = 2 [json_name = "b64Json"];</code>
   * @return The bytes for b64Json.
   */
  com.google.protobuf.ByteString
      getB64JsonBytes();

  /**
   * <code>.msp.azure.openai.images.v1.DalleContentFilterResult content_filter_result = 3 [json_name = "content_filter_results"];</code>
   * @return Whether the contentFilterResult field is set.
   */
  boolean hasContentFilterResult();
  /**
   * <code>.msp.azure.openai.images.v1.DalleContentFilterResult content_filter_result = 3 [json_name = "content_filter_results"];</code>
   * @return The contentFilterResult.
   */
  com.msp.azure.openai.images.v1.DalleContentFilterResult getContentFilterResult();
  /**
   * <code>.msp.azure.openai.images.v1.DalleContentFilterResult content_filter_result = 3 [json_name = "content_filter_results"];</code>
   */
  com.msp.azure.openai.images.v1.DalleContentFilterResultOrBuilder getContentFilterResultOrBuilder();

  /**
   * <code>string revised_prompt = 4 [json_name = "revisedPrompt"];</code>
   * @return The revisedPrompt.
   */
  java.lang.String getRevisedPrompt();
  /**
   * <code>string revised_prompt = 4 [json_name = "revisedPrompt"];</code>
   * @return The bytes for revisedPrompt.
   */
  com.google.protobuf.ByteString
      getRevisedPromptBytes();

  /**
   * <code>.msp.azure.openai.images.v1.DalleFilterResult prompt_filter_result = 5 [json_name = "prompt_filter_results"];</code>
   * @return Whether the promptFilterResult field is set.
   */
  boolean hasPromptFilterResult();
  /**
   * <code>.msp.azure.openai.images.v1.DalleFilterResult prompt_filter_result = 5 [json_name = "prompt_filter_results"];</code>
   * @return The promptFilterResult.
   */
  com.msp.azure.openai.images.v1.DalleFilterResult getPromptFilterResult();
  /**
   * <code>.msp.azure.openai.images.v1.DalleFilterResult prompt_filter_result = 5 [json_name = "prompt_filter_results"];</code>
   */
  com.msp.azure.openai.images.v1.DalleFilterResultOrBuilder getPromptFilterResultOrBuilder();
}