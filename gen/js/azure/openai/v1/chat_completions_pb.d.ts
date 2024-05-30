// @generated by protoc-gen-es v1.9.0
// @generated from file azure/openai/v1/chat_completions.proto (package azure.openai.v1, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import type { BinaryReadOptions, FieldList, JsonReadOptions, JsonValue, PartialMessage, PlainMessage } from "@bufbuild/protobuf";
import { Message, proto3 } from "@bufbuild/protobuf";
import type { Usage } from "./entity_pb.js";

/**
 * @generated from message azure.openai.v1.ChatCompletionRequest
 */
export declare class ChatCompletionRequest extends Message<ChatCompletionRequest> {
  /**
   * @generated from field: repeated azure.openai.v1.ChatMessage messages = 1;
   */
  messages: ChatMessage[];

  /**
   * @generated from field: optional float temperature = 2;
   */
  temperature?: number;

  /**
   * @generated from field: string role = 3;
   */
  role: string;

  /**
   * FIXME: for vision
   *
   * @generated from field: optional string content_part = 4 [json_name = "ContentPart"];
   */
  contentPart?: string;

  /**
   * FIXME: for vision
   *
   * @generated from field: optional azure.openai.v1.ContentPartImage content_part_image = 5 [json_name = "ContentPartImage"];
   */
  contentPartImage?: ContentPartImage;

  /**
   * @generated from field: optional uint32 n = 6;
   */
  n?: number;

  /**
   * @generated from field: optional bool stream = 7;
   */
  stream?: boolean;

  /**
   * @generated from field: repeated string stop = 8;
   */
  stop: string[];

  /**
   * @generated from field: optional uint32 max_tokens = 9;
   */
  maxTokens?: number;

  /**
   * @generated from field: optional float presence_penalty = 10;
   */
  presencePenalty?: number;

  /**
   * @generated from field: optional float frequency_penalty = 11;
   */
  frequencyPenalty?: number;

  /**
   * @generated from field: map<string, float> logit_bias = 12;
   */
  logitBias: { [key: string]: number };

  /**
   * @generated from field: optional string user = 13;
   */
  user?: string;

  /**
   * @generated from field: optional float top_p = 14;
   */
  topP?: number;

  /**
   * @generated from field: optional bool log_probs = 15;
   */
  logProbs?: boolean;

  /**
   * @generated from field: optional uint32 top_logprobs = 16;
   */
  topLogprobs?: number;

  /**
   * @generated from field: optional uint32 seed = 17;
   */
  seed?: number;

  constructor(data?: PartialMessage<ChatCompletionRequest>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "azure.openai.v1.ChatCompletionRequest";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): ChatCompletionRequest;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): ChatCompletionRequest;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): ChatCompletionRequest;

  static equals(a: ChatCompletionRequest | PlainMessage<ChatCompletionRequest> | undefined, b: ChatCompletionRequest | PlainMessage<ChatCompletionRequest> | undefined): boolean;
}

/**
 * @generated from message azure.openai.v1.ChatCompletionResponse
 */
export declare class ChatCompletionResponse extends Message<ChatCompletionResponse> {
  /**
   * @generated from field: string id = 1;
   */
  id: string;

  /**
   * @generated from field: string object = 2;
   */
  object: string;

  /**
   * @generated from field: uint32 created = 3;
   */
  created: number;

  /**
   * @generated from field: string model = 4;
   */
  model: string;

  /**
   * @generated from field: azure.openai.v1.Usage usage = 5;
   */
  usage?: Usage;

  /**
   * @generated from field: repeated azure.openai.v1.ChatChoice choices = 6;
   */
  choices: ChatChoice[];

  constructor(data?: PartialMessage<ChatCompletionResponse>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "azure.openai.v1.ChatCompletionResponse";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): ChatCompletionResponse;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): ChatCompletionResponse;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): ChatCompletionResponse;

  static equals(a: ChatCompletionResponse | PlainMessage<ChatCompletionResponse> | undefined, b: ChatCompletionResponse | PlainMessage<ChatCompletionResponse> | undefined): boolean;
}

/**
 * @generated from message azure.openai.v1.ChatMessage
 */
export declare class ChatMessage extends Message<ChatMessage> {
  /**
   * @generated from field: string content = 1;
   */
  content: string;

  /**
   * @generated from field: string name = 2;
   */
  name: string;

  /**
   * @generated from field: string role = 3;
   */
  role: string;

  constructor(data?: PartialMessage<ChatMessage>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "azure.openai.v1.ChatMessage";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): ChatMessage;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): ChatMessage;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): ChatMessage;

  static equals(a: ChatMessage | PlainMessage<ChatMessage> | undefined, b: ChatMessage | PlainMessage<ChatMessage> | undefined): boolean;
}

/**
 * @generated from message azure.openai.v1.ContentPartImage
 */
export declare class ContentPartImage extends Message<ContentPartImage> {
  /**
   * @generated from field: string url = 1;
   */
  url: string;

  /**
   * @generated from field: string detail = 2;
   */
  detail: string;

  constructor(data?: PartialMessage<ContentPartImage>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "azure.openai.v1.ContentPartImage";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): ContentPartImage;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): ContentPartImage;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): ContentPartImage;

  static equals(a: ContentPartImage | PlainMessage<ContentPartImage> | undefined, b: ContentPartImage | PlainMessage<ContentPartImage> | undefined): boolean;
}

/**
 * @generated from message azure.openai.v1.ChatChoice
 */
export declare class ChatChoice extends Message<ChatChoice> {
  /**
   * @generated from field: azure.openai.v1.ChatMessage message = 1;
   */
  message?: ChatMessage;

  /**
   * @generated from field: string finish_reason = 2;
   */
  finishReason: string;

  /**
   * @generated from field: uint32 index = 3;
   */
  index: number;

  constructor(data?: PartialMessage<ChatChoice>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "azure.openai.v1.ChatChoice";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): ChatChoice;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): ChatChoice;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): ChatChoice;

  static equals(a: ChatChoice | PlainMessage<ChatChoice> | undefined, b: ChatChoice | PlainMessage<ChatChoice> | undefined): boolean;
}
