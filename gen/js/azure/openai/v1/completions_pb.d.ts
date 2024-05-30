// @generated by protoc-gen-es v1.9.0
// @generated from file azure/openai/v1/completions.proto (package azure.openai.v1, syntax proto3)
/* eslint-disable */
// @ts-nocheck

import type { BinaryReadOptions, FieldList, JsonReadOptions, JsonValue, PartialMessage, PlainMessage } from "@bufbuild/protobuf";
import { Message, proto3 } from "@bufbuild/protobuf";

/**
 * @generated from message azure.openai.v1.Choice
 */
export declare class Choice extends Message<Choice> {
  /**
   * @generated from field: uint32 index = 1;
   */
  index: number;

  /**
   * @generated from field: string text = 2;
   */
  text: string;

  /**
   * @generated from field: float logprobs = 3;
   */
  logprobs: number;

  /**
   * @generated from field: string finish_reason = 4;
   */
  finishReason: string;

  constructor(data?: PartialMessage<Choice>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "azure.openai.v1.Choice";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): Choice;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): Choice;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): Choice;

  static equals(a: Choice | PlainMessage<Choice> | undefined, b: Choice | PlainMessage<Choice> | undefined): boolean;
}

/**
 * @generated from message azure.openai.v1.CompletionRequest
 */
export declare class CompletionRequest extends Message<CompletionRequest> {
  /**
   * @generated from field: string model = 1;
   */
  model: string;

  /**
   * @generated from field: string object = 2;
   */
  object: string;

  /**
   * @generated from field: string id = 3;
   */
  id: string;

  /**
   * @generated from field: uint32 created = 4;
   */
  created: number;

  /**
   * @generated from field: repeated azure.openai.v1.Choice choices = 5;
   */
  choices: Choice[];

  constructor(data?: PartialMessage<CompletionRequest>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "azure.openai.v1.CompletionRequest";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): CompletionRequest;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): CompletionRequest;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): CompletionRequest;

  static equals(a: CompletionRequest | PlainMessage<CompletionRequest> | undefined, b: CompletionRequest | PlainMessage<CompletionRequest> | undefined): boolean;
}

/**
 * @generated from message azure.openai.v1.CompletionResponse
 */
export declare class CompletionResponse extends Message<CompletionResponse> {
  /**
   * @generated from field: azure.openai.v1.Error error = 1;
   */
  error?: Error;

  constructor(data?: PartialMessage<CompletionResponse>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "azure.openai.v1.CompletionResponse";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): CompletionResponse;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): CompletionResponse;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): CompletionResponse;

  static equals(a: CompletionResponse | PlainMessage<CompletionResponse> | undefined, b: CompletionResponse | PlainMessage<CompletionResponse> | undefined): boolean;
}

/**
 * @generated from message azure.openai.v1.Error
 */
export declare class Error extends Message<Error> {
  /**
   * @generated from field: string code = 1;
   */
  code: string;

  /**
   * @generated from field: string message = 2;
   */
  message: string;

  /**
   * @generated from field: string param = 3;
   */
  param: string;

  /**
   * @generated from field: string type = 4;
   */
  type: string;

  /**
   * @generated from field: azure.openai.v1.InnerError inner_error = 5;
   */
  innerError?: InnerError;

  constructor(data?: PartialMessage<Error>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "azure.openai.v1.Error";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): Error;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): Error;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): Error;

  static equals(a: Error | PlainMessage<Error> | undefined, b: Error | PlainMessage<Error> | undefined): boolean;
}

/**
 * @generated from message azure.openai.v1.InnerError
 */
export declare class InnerError extends Message<InnerError> {
  /**
   * @generated from field: string code = 1;
   */
  code: string;

  /**
   * @generated from field: azure.openai.v1.ContentFilterResults content_filter_results = 2;
   */
  contentFilterResults?: ContentFilterResults;

  constructor(data?: PartialMessage<InnerError>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "azure.openai.v1.InnerError";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): InnerError;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): InnerError;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): InnerError;

  static equals(a: InnerError | PlainMessage<InnerError> | undefined, b: InnerError | PlainMessage<InnerError> | undefined): boolean;
}

/**
 * @generated from message azure.openai.v1.ContentFilterResults
 */
export declare class ContentFilterResults extends Message<ContentFilterResults> {
  /**
   * @generated from field: azure.openai.v1.ContentFilterResult sexual = 1;
   */
  sexual?: ContentFilterResult;

  /**
   * @generated from field: azure.openai.v1.ContentFilterResult violence = 2;
   */
  violence?: ContentFilterResult;

  /**
   * @generated from field: azure.openai.v1.ContentFilterResult hate = 3;
   */
  hate?: ContentFilterResult;

  /**
   * @generated from field: azure.openai.v1.ContentFilterResult self_harm = 4;
   */
  selfHarm?: ContentFilterResult;

  /**
   * @generated from field: azure.openai.v1.ContentFilterResult profanity = 5;
   */
  profanity?: ContentFilterResult;

  /**
   * @generated from field: azure.openai.v1.ContentFilterResult jailbreak = 6;
   */
  jailbreak?: ContentFilterResult;

  /**
   * @generated from field: azure.openai.v1.Error error = 7;
   */
  error?: Error;

  constructor(data?: PartialMessage<ContentFilterResults>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "azure.openai.v1.ContentFilterResults";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): ContentFilterResults;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): ContentFilterResults;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): ContentFilterResults;

  static equals(a: ContentFilterResults | PlainMessage<ContentFilterResults> | undefined, b: ContentFilterResults | PlainMessage<ContentFilterResults> | undefined): boolean;
}

/**
 * @generated from message azure.openai.v1.ContentFilterResult
 */
export declare class ContentFilterResult extends Message<ContentFilterResult> {
  /**
   * @generated from field: bool filtered = 1;
   */
  filtered: boolean;

  /**
   * @generated from field: bool detected = 2;
   */
  detected: boolean;

  /**
   * @generated from field: string severity = 3;
   */
  severity: string;

  constructor(data?: PartialMessage<ContentFilterResult>);

  static readonly runtime: typeof proto3;
  static readonly typeName = "azure.openai.v1.ContentFilterResult";
  static readonly fields: FieldList;

  static fromBinary(bytes: Uint8Array, options?: Partial<BinaryReadOptions>): ContentFilterResult;

  static fromJson(jsonValue: JsonValue, options?: Partial<JsonReadOptions>): ContentFilterResult;

  static fromJsonString(jsonString: string, options?: Partial<JsonReadOptions>): ContentFilterResult;

  static equals(a: ContentFilterResult | PlainMessage<ContentFilterResult> | undefined, b: ContentFilterResult | PlainMessage<ContentFilterResult> | undefined): boolean;
}
