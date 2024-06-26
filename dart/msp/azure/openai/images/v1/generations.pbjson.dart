//
//  Generated code. Do not modify.
//  source: msp/azure/openai/images/v1/generations.proto
//
// @dart = 2.12

// ignore_for_file: annotate_overrides, camel_case_types, comment_references
// ignore_for_file: constant_identifier_names, library_prefixes
// ignore_for_file: non_constant_identifier_names, prefer_final_fields
// ignore_for_file: unnecessary_import, unnecessary_this, unused_import

import 'dart:convert' as $convert;
import 'dart:core' as $core;
import 'dart:typed_data' as $typed_data;

@$core.Deprecated('Use imageGenerationsRequestDescriptor instead')
const ImageGenerationsRequest$json = {
  '1': 'ImageGenerationsRequest',
  '2': [
    {'1': 'prompt', '3': 1, '4': 1, '5': 9, '10': 'prompt'},
    {'1': 'n', '3': 2, '4': 1, '5': 13, '10': 'n'},
    {'1': 'size', '3': 3, '4': 1, '5': 9, '10': 'size'},
    {'1': 'response_format', '3': 4, '4': 1, '5': 9, '10': 'responseFormat'},
    {'1': 'user_context', '3': 5, '4': 1, '5': 9, '10': 'userContext'},
    {'1': 'quality', '3': 6, '4': 1, '5': 9, '10': 'quality'},
    {'1': 'style', '3': 7, '4': 1, '5': 9, '10': 'style'},
  ],
};

/// Descriptor for `ImageGenerationsRequest`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List imageGenerationsRequestDescriptor = $convert.base64Decode(
    'ChdJbWFnZUdlbmVyYXRpb25zUmVxdWVzdBIWCgZwcm9tcHQYASABKAlSBnByb21wdBIMCgFuGA'
    'IgASgNUgFuEhIKBHNpemUYAyABKAlSBHNpemUSJwoPcmVzcG9uc2VfZm9ybWF0GAQgASgJUg5y'
    'ZXNwb25zZUZvcm1hdBIhCgx1c2VyX2NvbnRleHQYBSABKAlSC3VzZXJDb250ZXh0EhgKB3F1YW'
    'xpdHkYBiABKAlSB3F1YWxpdHkSFAoFc3R5bGUYByABKAlSBXN0eWxl');

@$core.Deprecated('Use imageGenerationsResponseDescriptor instead')
const ImageGenerationsResponse$json = {
  '1': 'ImageGenerationsResponse',
  '2': [
    {'1': 'created', '3': 1, '4': 1, '5': 4, '10': 'created'},
    {'1': 'data', '3': 2, '4': 1, '5': 11, '6': '.msp.azure.openai.images.v1.ImageResult', '10': 'data'},
  ],
};

/// Descriptor for `ImageGenerationsResponse`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List imageGenerationsResponseDescriptor = $convert.base64Decode(
    'ChhJbWFnZUdlbmVyYXRpb25zUmVzcG9uc2USGAoHY3JlYXRlZBgBIAEoBFIHY3JlYXRlZBI7Cg'
    'RkYXRhGAIgASgLMicubXNwLmF6dXJlLm9wZW5haS5pbWFnZXMudjEuSW1hZ2VSZXN1bHRSBGRh'
    'dGE=');

@$core.Deprecated('Use imageResultDescriptor instead')
const ImageResult$json = {
  '1': 'ImageResult',
  '2': [
    {'1': 'url', '3': 1, '4': 1, '5': 9, '10': 'url'},
    {'1': 'b64_json', '3': 2, '4': 1, '5': 9, '10': 'b64Json'},
    {'1': 'content_filter_result', '3': 3, '4': 1, '5': 11, '6': '.msp.azure.openai.images.v1.DalleContentFilterResult', '10': 'content_filter_results'},
    {'1': 'revised_prompt', '3': 4, '4': 1, '5': 9, '10': 'revisedPrompt'},
    {'1': 'prompt_filter_result', '3': 5, '4': 1, '5': 11, '6': '.msp.azure.openai.images.v1.DalleFilterResult', '10': 'prompt_filter_results'},
  ],
};

/// Descriptor for `ImageResult`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List imageResultDescriptor = $convert.base64Decode(
    'CgtJbWFnZVJlc3VsdBIQCgN1cmwYASABKAlSA3VybBIZCghiNjRfanNvbhgCIAEoCVIHYjY0Sn'
    'NvbhJrChVjb250ZW50X2ZpbHRlcl9yZXN1bHQYAyABKAsyNC5tc3AuYXp1cmUub3BlbmFpLmlt'
    'YWdlcy52MS5EYWxsZUNvbnRlbnRGaWx0ZXJSZXN1bHRSFmNvbnRlbnRfZmlsdGVyX3Jlc3VsdH'
    'MSJQoOcmV2aXNlZF9wcm9tcHQYBCABKAlSDXJldmlzZWRQcm9tcHQSYgoUcHJvbXB0X2ZpbHRl'
    'cl9yZXN1bHQYBSABKAsyLS5tc3AuYXp1cmUub3BlbmFpLmltYWdlcy52MS5EYWxsZUZpbHRlcl'
    'Jlc3VsdFIVcHJvbXB0X2ZpbHRlcl9yZXN1bHRz');

@$core.Deprecated('Use dalleContentFilterResultDescriptor instead')
const DalleContentFilterResult$json = {
  '1': 'DalleContentFilterResult',
  '2': [
    {'1': 'sexual', '3': 1, '4': 1, '5': 11, '6': '.msp.azure.openai.v1.ContentFilterSeverityResult', '10': 'sexual'},
    {'1': 'violence', '3': 2, '4': 1, '5': 11, '6': '.msp.azure.openai.v1.ContentFilterSeverityResult', '10': 'violence'},
    {'1': 'hate', '3': 3, '4': 1, '5': 11, '6': '.msp.azure.openai.v1.ContentFilterSeverityResult', '10': 'hate'},
    {'1': 'self_harm', '3': 4, '4': 1, '5': 11, '6': '.msp.azure.openai.v1.ContentFilterSeverityResult', '10': 'selfHarm'},
  ],
};

/// Descriptor for `DalleContentFilterResult`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List dalleContentFilterResultDescriptor = $convert.base64Decode(
    'ChhEYWxsZUNvbnRlbnRGaWx0ZXJSZXN1bHQSSAoGc2V4dWFsGAEgASgLMjAubXNwLmF6dXJlLm'
    '9wZW5haS52MS5Db250ZW50RmlsdGVyU2V2ZXJpdHlSZXN1bHRSBnNleHVhbBJMCgh2aW9sZW5j'
    'ZRgCIAEoCzIwLm1zcC5henVyZS5vcGVuYWkudjEuQ29udGVudEZpbHRlclNldmVyaXR5UmVzdW'
    'x0Ugh2aW9sZW5jZRJECgRoYXRlGAMgASgLMjAubXNwLmF6dXJlLm9wZW5haS52MS5Db250ZW50'
    'RmlsdGVyU2V2ZXJpdHlSZXN1bHRSBGhhdGUSTQoJc2VsZl9oYXJtGAQgASgLMjAubXNwLmF6dX'
    'JlLm9wZW5haS52MS5Db250ZW50RmlsdGVyU2V2ZXJpdHlSZXN1bHRSCHNlbGZIYXJt');

@$core.Deprecated('Use dalleFilterResultDescriptor instead')
const DalleFilterResult$json = {
  '1': 'DalleFilterResult',
  '2': [
    {'1': 'sexual', '3': 1, '4': 1, '5': 11, '6': '.msp.azure.openai.v1.ContentFilterSeverityResult', '10': 'sexual'},
    {'1': 'violence', '3': 2, '4': 1, '5': 11, '6': '.msp.azure.openai.v1.ContentFilterSeverityResult', '10': 'violence'},
    {'1': 'hate', '3': 3, '4': 1, '5': 11, '6': '.msp.azure.openai.v1.ContentFilterSeverityResult', '10': 'hate'},
    {'1': 'self_harm', '3': 4, '4': 1, '5': 11, '6': '.msp.azure.openai.v1.ContentFilterSeverityResult', '10': 'selfHarm'},
    {'1': 'profanity', '3': 5, '4': 1, '5': 11, '6': '.msp.azure.openai.v1.ContentFilterDetectedResult', '10': 'profanity'},
    {'1': 'jailbreak', '3': 6, '4': 1, '5': 11, '6': '.msp.azure.openai.v1.ContentFilterDetectedResult', '10': 'jailbreak'},
  ],
};

/// Descriptor for `DalleFilterResult`. Decode as a `google.protobuf.DescriptorProto`.
final $typed_data.Uint8List dalleFilterResultDescriptor = $convert.base64Decode(
    'ChFEYWxsZUZpbHRlclJlc3VsdBJICgZzZXh1YWwYASABKAsyMC5tc3AuYXp1cmUub3BlbmFpLn'
    'YxLkNvbnRlbnRGaWx0ZXJTZXZlcml0eVJlc3VsdFIGc2V4dWFsEkwKCHZpb2xlbmNlGAIgASgL'
    'MjAubXNwLmF6dXJlLm9wZW5haS52MS5Db250ZW50RmlsdGVyU2V2ZXJpdHlSZXN1bHRSCHZpb2'
    'xlbmNlEkQKBGhhdGUYAyABKAsyMC5tc3AuYXp1cmUub3BlbmFpLnYxLkNvbnRlbnRGaWx0ZXJT'
    'ZXZlcml0eVJlc3VsdFIEaGF0ZRJNCglzZWxmX2hhcm0YBCABKAsyMC5tc3AuYXp1cmUub3Blbm'
    'FpLnYxLkNvbnRlbnRGaWx0ZXJTZXZlcml0eVJlc3VsdFIIc2VsZkhhcm0STgoJcHJvZmFuaXR5'
    'GAUgASgLMjAubXNwLmF6dXJlLm9wZW5haS52MS5Db250ZW50RmlsdGVyRGV0ZWN0ZWRSZXN1bH'
    'RSCXByb2Zhbml0eRJOCglqYWlsYnJlYWsYBiABKAsyMC5tc3AuYXp1cmUub3BlbmFpLnYxLkNv'
    'bnRlbnRGaWx0ZXJEZXRlY3RlZFJlc3VsdFIJamFpbGJyZWFr');

