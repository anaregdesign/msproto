# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: azure/openai/v1/chat_completions.proto
# Protobuf Python Version: 5.27.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import runtime_version as _runtime_version
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
_runtime_version.ValidateProtobufRuntimeVersion(
    _runtime_version.Domain.PUBLIC,
    5,
    27,
    0,
    '',
    'azure/openai/v1/chat_completions.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from azure.openai.v1 import entity_pb2 as azure_dot_openai_dot_v1_dot_entity__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n&azure/openai/v1/chat_completions.proto\x12\x0f\x61zure.openai.v1\x1a\x1c\x61zure/openai/v1/entity.proto\"\xbc\x07\n\x15\x43hatCompletionRequest\x12\x38\n\x08messages\x18\x01 \x03(\x0b\x32\x1c.azure.openai.v1.ChatMessageR\x08messages\x12%\n\x0btemperature\x18\x02 \x01(\x02H\x00R\x0btemperature\x88\x01\x01\x12\x12\n\x04role\x18\x03 \x01(\tR\x04role\x12&\n\x0c\x63ontent_part\x18\x04 \x01(\tH\x01R\x0b\x43ontentPart\x88\x01\x01\x12T\n\x12\x63ontent_part_image\x18\x05 \x01(\x0b\x32!.azure.openai.v1.ContentPartImageH\x02R\x10\x43ontentPartImage\x88\x01\x01\x12\x11\n\x01n\x18\x06 \x01(\rH\x03R\x01n\x88\x01\x01\x12\x1b\n\x06stream\x18\x07 \x01(\x08H\x04R\x06stream\x88\x01\x01\x12\x12\n\x04stop\x18\x08 \x03(\tR\x04stop\x12\"\n\nmax_tokens\x18\t \x01(\rH\x05R\tmaxTokens\x88\x01\x01\x12.\n\x10presence_penalty\x18\n \x01(\x02H\x06R\x0fpresencePenalty\x88\x01\x01\x12\x30\n\x11\x66requency_penalty\x18\x0b \x01(\x02H\x07R\x10\x66requencyPenalty\x88\x01\x01\x12T\n\nlogit_bias\x18\x0c \x03(\x0b\x32\x35.azure.openai.v1.ChatCompletionRequest.LogitBiasEntryR\tlogitBias\x12\x17\n\x04user\x18\r \x01(\tH\x08R\x04user\x88\x01\x01\x12\x18\n\x05top_p\x18\x0e \x01(\x02H\tR\x04topP\x88\x01\x01\x12 \n\tlog_probs\x18\x0f \x01(\x08H\nR\x08logProbs\x88\x01\x01\x12&\n\x0ctop_logprobs\x18\x10 \x01(\rH\x0bR\x0btopLogprobs\x88\x01\x01\x12\x17\n\x04seed\x18\x11 \x01(\rH\x0cR\x04seed\x88\x01\x01\x1a<\n\x0eLogitBiasEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x14\n\x05value\x18\x02 \x01(\x02R\x05value:\x02\x38\x01\x42\x0e\n\x0c_temperatureB\x0f\n\r_content_partB\x15\n\x13_content_part_imageB\x04\n\x02_nB\t\n\x07_streamB\r\n\x0b_max_tokensB\x13\n\x11_presence_penaltyB\x14\n\x12_frequency_penaltyB\x07\n\x05_userB\x08\n\x06_top_pB\x0c\n\n_log_probsB\x0f\n\r_top_logprobsB\x07\n\x05_seed\"\xd5\x01\n\x16\x43hatCompletionResponse\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x16\n\x06object\x18\x02 \x01(\tR\x06object\x12\x18\n\x07\x63reated\x18\x03 \x01(\rR\x07\x63reated\x12\x14\n\x05model\x18\x04 \x01(\tR\x05model\x12,\n\x05usage\x18\x05 \x01(\x0b\x32\x16.azure.openai.v1.UsageR\x05usage\x12\x35\n\x07\x63hoices\x18\x06 \x03(\x0b\x32\x1b.azure.openai.v1.ChatChoiceR\x07\x63hoices\"O\n\x0b\x43hatMessage\x12\x18\n\x07\x63ontent\x18\x01 \x01(\tR\x07\x63ontent\x12\x12\n\x04name\x18\x02 \x01(\tR\x04name\x12\x12\n\x04role\x18\x03 \x01(\tR\x04role\"<\n\x10\x43ontentPartImage\x12\x10\n\x03url\x18\x01 \x01(\tR\x03url\x12\x16\n\x06\x64\x65tail\x18\x02 \x01(\tR\x06\x64\x65tail\"\x7f\n\nChatChoice\x12\x36\n\x07message\x18\x01 \x01(\x0b\x32\x1c.azure.openai.v1.ChatMessageR\x07message\x12#\n\rfinish_reason\x18\x02 \x01(\tR\x0c\x66inishReason\x12\x14\n\x05index\x18\x03 \x01(\rR\x05indexB\xca\x01\n\x13\x63om.azure.openai.v1B\x14\x43hatCompletionsProtoP\x01Z?github.com/anaregdesign/azure-proto/go/azure/openai/v1;openaiv1\xa2\x02\x03\x41OX\xaa\x02\x0f\x41zure.Openai.V1\xca\x02\x0f\x41zure\\Openai\\V1\xe2\x02\x1b\x41zure\\Openai\\V1\\GPBMetadata\xea\x02\x11\x41zure::Openai::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'azure.openai.v1.chat_completions_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\023com.azure.openai.v1B\024ChatCompletionsProtoP\001Z?github.com/anaregdesign/azure-proto/go/azure/openai/v1;openaiv1\242\002\003AOX\252\002\017Azure.Openai.V1\312\002\017Azure\\Openai\\V1\342\002\033Azure\\Openai\\V1\\GPBMetadata\352\002\021Azure::Openai::V1'
  _globals['_CHATCOMPLETIONREQUEST_LOGITBIASENTRY']._loaded_options = None
  _globals['_CHATCOMPLETIONREQUEST_LOGITBIASENTRY']._serialized_options = b'8\001'
  _globals['_CHATCOMPLETIONREQUEST']._serialized_start=90
  _globals['_CHATCOMPLETIONREQUEST']._serialized_end=1046
  _globals['_CHATCOMPLETIONREQUEST_LOGITBIASENTRY']._serialized_start=796
  _globals['_CHATCOMPLETIONREQUEST_LOGITBIASENTRY']._serialized_end=856
  _globals['_CHATCOMPLETIONRESPONSE']._serialized_start=1049
  _globals['_CHATCOMPLETIONRESPONSE']._serialized_end=1262
  _globals['_CHATMESSAGE']._serialized_start=1264
  _globals['_CHATMESSAGE']._serialized_end=1343
  _globals['_CONTENTPARTIMAGE']._serialized_start=1345
  _globals['_CONTENTPARTIMAGE']._serialized_end=1405
  _globals['_CHATCHOICE']._serialized_start=1407
  _globals['_CHATCHOICE']._serialized_end=1534
# @@protoc_insertion_point(module_scope)
