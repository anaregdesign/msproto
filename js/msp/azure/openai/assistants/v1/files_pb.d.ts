// @generated by protoc-gen-es v1.10.0
// @generated from file msp/azure/openai/assistants/v1/files.proto (package msp.azure.openai.assistants.v1, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import type { BinaryReadOptions, FieldList, JsonReadOptions, JsonValue, PartialMessage, PlainMessage } from "@bufbuild/protobuf";
import { Message, proto3 } from "@bufbuild/protobuf";

/**
 * @generated from message msp.azure.openai.assistants.v1.CreateAssistantFileRequest
 */
export declare class CreateAssistantFileRequest extends Message<CreateAssistantFileRequest> {
  /**
   * @generated from field: string file_id = 1;
   */
  fileId: string;

  constructor(data?: PartialMessage<CreateAssistantFileRequest>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "msp.azure.openai.assistants.v1.CreateAssistantFileRequest";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): CreateAssistantFileRequest;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): CreateAssistantFileRequest;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): CreateAssistantFileRequest;

  static equals(a: CreateAssistantFileRequest | PlainMessage<CreateAssistantFileRequest> | undefined, b: CreateAssistantFileRequest | PlainMessage<CreateAssistantFileRequest> | undefined): boolean;
}

/**
 * @generated from message msp.azure.openai.assistants.v1.AssistantFile
 */
export declare class AssistantFile extends Message<AssistantFile> {
  /**
   * @generated from field: string id = 1;
   */
  id: string;

  /**
   * @generated from field: string object = 2;
   */
  object: string;

  /**
   * @generated from field: uint64 created_at = 3;
   */
  createdAt: bigint;

  /**
   * @generated from field: string assistant_id = 4;
   */
  assistantId: string;

  constructor(data?: PartialMessage<AssistantFile>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "msp.azure.openai.assistants.v1.AssistantFile";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): AssistantFile;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): AssistantFile;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): AssistantFile;

  static equals(a: AssistantFile | PlainMessage<AssistantFile> | undefined, b: AssistantFile | PlainMessage<AssistantFile> | undefined): boolean;
}

