// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: azure/openai/v1/entity.proto
// Protobuf Java Version: 4.27.0

package com.azure.openai.v1;

public interface ContentFilterDetectedResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:azure.openai.v1.ContentFilterDetectedResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool filtered = 1 [json_name = "filtered"];</code>
   * @return The filtered.
   */
  boolean getFiltered();

  /**
   * <code>bool detected = 2 [json_name = "detected"];</code>
   * @return The detected.
   */
  boolean getDetected();
}