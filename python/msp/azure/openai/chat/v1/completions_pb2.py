# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: msp/azure/openai/chat/v1/completions.proto
# Protobuf Python Version: 5.27.1
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
    1,
    '',
    'msp/azure/openai/chat/v1/completions.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from msp.azure.openai.v1 import entity_pb2 as msp_dot_azure_dot_openai_dot_v1_dot_entity__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n*msp/azure/openai/chat/v1/completions.proto\x12\x18msp.azure.openai.chat.v1\x1a msp/azure/openai/v1/entity.proto\"\xc7\x04\n\x11\x43ompletionRequest\x12 \n\x0btemperature\x18\x01 \x01(\x02R\x0btemperature\x12\x13\n\x05top_p\x18\x02 \x01(\x02R\x04topP\x12\x16\n\x06stream\x18\x03 \x01(\x08R\x06stream\x12\x13\n\x05stops\x18\x04 \x03(\tR\x04stop\x12\x1d\n\nmax_tokens\x18\x05 \x01(\rR\tmaxTokens\x12)\n\x10presence_penalty\x18\x06 \x01(\x02R\x0fpresencePenalty\x12+\n\x11\x66requency_penalty\x18\x07 \x01(\x02R\x10\x66requencyPenalty\x12Y\n\nlogit_bias\x18\x08 \x03(\x0b\x32:.msp.azure.openai.chat.v1.CompletionRequest.LogitBiasEntryR\tlogitBias\x12\x12\n\x04user\x18\t \x01(\tR\x04user\x12O\n\x08messages\x18\n \x03(\x0b\x32\x33.msp.azure.openai.chat.v1.CompletionRequest.MessageR\x08messages\x12\x0c\n\x01n\x18\x0c \x01(\rR\x01n\x12\x12\n\x04seed\x18\r \x01(\x03R\x04seed\x1a<\n\x0eLogitBiasEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x14\n\x05value\x18\x02 \x01(\x02R\x05value:\x02\x38\x01\x1a\x37\n\x07Message\x12\x12\n\x04role\x18\x01 \x01(\tR\x04role\x12\x18\n\x07\x63ontent\x18\x02 \x01(\tR\x07\x63ontent\"\xcc\r\n\x12\x43ompletionResponse\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x16\n\x06object\x18\x02 \x01(\tR\x06object\x12\x18\n\x07\x63reated\x18\x03 \x01(\x04R\x07\x63reated\x12\x14\n\x05model\x18\x04 \x01(\tR\x05model\x12H\n\x05usage\x18\x05 \x01(\x0b\x32\x32.msp.azure.openai.chat.v1.CompletionResponse.UsageR\x05usage\x12-\n\x12system_fingerprint\x18\x06 \x01(\tR\x11systemFingerprint\x12[\n\x15prompt_filter_results\x18\x07 \x03(\x0b\x32\'.msp.azure.openai.v1.PromptFilterResultR\x13promptFilterResults\x12M\n\x07\x63hoices\x18\x08 \x03(\x0b\x32\x33.msp.azure.openai.chat.v1.CompletionResponse.ChoiceR\x07\x63hoices\x1a|\n\x05Usage\x12#\n\rprompt_tokens\x18\x01 \x01(\x04R\x0cpromptTokens\x12+\n\x11\x63ompletion_tokens\x18\x02 \x01(\x04R\x10\x63ompletionTokens\x12!\n\x0ctotal_tokens\x18\x03 \x01(\x04R\x0btotalTokens\x1a\xba\t\n\x06\x43hoice\x12\x14\n\x05index\x18\x01 \x01(\rR\x05index\x12#\n\rfinish_reason\x18\x02 \x01(\tR\x0c\x66inishReason\x12U\n\x07message\x18\x03 \x01(\x0b\x32;.msp.azure.openai.chat.v1.CompletionResponse.Choice.MessageR\x07message\x12\x65\n\x15\x63ontent_filter_result\x18\x04 \x01(\x0b\x32..msp.azure.openai.v1.ContentFilterChoiceResultR\x16\x63ontent_filter_results\x12\x1a\n\x08logprobs\x18\x05 \x03(\x02R\x08logprobs\x1a\x9a\x07\n\x07Message\x12\x12\n\x04role\x18\x01 \x01(\tR\x04role\x12\x18\n\x07\x63ontent\x18\x02 \x01(\tR\x07\x63ontent\x12\x63\n\ntool_calls\x18\x03 \x03(\x0b\x32\x44.msp.azure.openai.chat.v1.CompletionResponse.Choice.Message.ToolCallR\ttoolCalls\x12m\n\rfunction_call\x18\x04 \x01(\x0b\x32H.msp.azure.openai.chat.v1.CompletionResponse.Choice.Message.FunctionCallR\x0c\x66unctionCall\x12]\n\x07\x63ontext\x18\x05 \x01(\x0b\x32\x43.msp.azure.openai.chat.v1.CompletionResponse.Choice.Message.ContextR\x07\x63ontext\x1a\xd6\x01\n\x08ToolCall\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x12\n\x04type\x18\x02 \x01(\tR\x04type\x12i\n\x08\x66unction\x18\x03 \x01(\x0b\x32M.msp.azure.openai.chat.v1.CompletionResponse.Choice.Message.ToolCall.FunctionR\x08\x66unction\x1a;\n\x08\x46unction\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x1b\n\x08\x61rgument\x18\x02 \x01(\tR\targuments\x1a?\n\x0c\x46unctionCall\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x1b\n\x08\x61rgument\x18\x02 \x01(\tR\targuments\x1a\x93\x02\n\x07\x43ontext\x12j\n\tcitations\x18\x01 \x03(\x0b\x32L.msp.azure.openai.chat.v1.CompletionResponse.Choice.Message.Context.CitationR\tcitations\x12\x16\n\x06intent\x18\x02 \x01(\tR\x06intent\x1a\x83\x01\n\x08\x43itation\x12\x18\n\x07\x63ontent\x18\x01 \x01(\tR\x07\x63ontent\x12\x14\n\x05title\x18\x02 \x01(\tR\x05title\x12\x10\n\x03url\x18\x03 \x01(\tR\x03url\x12\x1a\n\x08\x66ilepath\x18\x04 \x01(\tR\x08\x66ilepath\x12\x19\n\x08\x63hunk_id\x18\x05 \x01(\tR\x07\x63hunkId\"\xc6\x02\n\rErrorResponse\x12\x12\n\x04\x63ode\x18\x01 \x01(\tR\x04\x63ode\x12\x18\n\x07message\x18\x02 \x01(\tR\x07message\x12\x14\n\x05param\x18\x03 \x01(\tR\x05param\x12\x12\n\x04type\x18\x04 \x01(\tR\x04type\x12S\n\x0binner_error\x18\x05 \x01(\x0b\x32\x32.msp.azure.openai.chat.v1.ErrorResponse.InnerErrorR\ninnerError\x1a\x87\x01\n\nInnerError\x12\x12\n\x04\x63ode\x18\x01 \x01(\tR\x04\x63ode\x12\x65\n\x15\x63ontent_filter_result\x18\x02 \x01(\x0b\x32..msp.azure.openai.v1.ContentFilterPromptResultR\x16\x63ontent_filter_resultsB\xf9\x01\n\x1c\x63om.msp.azure.openai.chat.v1B\x10\x43ompletionsProtoP\x01ZBgithub.com/anaregdesign/msproto/go/msp/azure/openai/chat/v1;chatv1\xa2\x02\x04MAOC\xaa\x02\x18Msp.Azure.Openai.Chat.V1\xca\x02\x18Msp\\Azure\\Openai\\Chat\\V1\xe2\x02$Msp\\Azure\\Openai\\Chat\\V1\\GPBMetadata\xea\x02\x1cMsp::Azure::Openai::Chat::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'msp.azure.openai.chat.v1.completions_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\034com.msp.azure.openai.chat.v1B\020CompletionsProtoP\001ZBgithub.com/anaregdesign/msproto/go/msp/azure/openai/chat/v1;chatv1\242\002\004MAOC\252\002\030Msp.Azure.Openai.Chat.V1\312\002\030Msp\\Azure\\Openai\\Chat\\V1\342\002$Msp\\Azure\\Openai\\Chat\\V1\\GPBMetadata\352\002\034Msp::Azure::Openai::Chat::V1'
  _globals['_COMPLETIONREQUEST_LOGITBIASENTRY']._loaded_options = None
  _globals['_COMPLETIONREQUEST_LOGITBIASENTRY']._serialized_options = b'8\001'
  _globals['_COMPLETIONREQUEST']._serialized_start=107
  _globals['_COMPLETIONREQUEST']._serialized_end=690
  _globals['_COMPLETIONREQUEST_LOGITBIASENTRY']._serialized_start=573
  _globals['_COMPLETIONREQUEST_LOGITBIASENTRY']._serialized_end=633
  _globals['_COMPLETIONREQUEST_MESSAGE']._serialized_start=635
  _globals['_COMPLETIONREQUEST_MESSAGE']._serialized_end=690
  _globals['_COMPLETIONRESPONSE']._serialized_start=693
  _globals['_COMPLETIONRESPONSE']._serialized_end=2433
  _globals['_COMPLETIONRESPONSE_USAGE']._serialized_start=1096
  _globals['_COMPLETIONRESPONSE_USAGE']._serialized_end=1220
  _globals['_COMPLETIONRESPONSE_CHOICE']._serialized_start=1223
  _globals['_COMPLETIONRESPONSE_CHOICE']._serialized_end=2433
  _globals['_COMPLETIONRESPONSE_CHOICE_MESSAGE']._serialized_start=1511
  _globals['_COMPLETIONRESPONSE_CHOICE_MESSAGE']._serialized_end=2433
  _globals['_COMPLETIONRESPONSE_CHOICE_MESSAGE_TOOLCALL']._serialized_start=1876
  _globals['_COMPLETIONRESPONSE_CHOICE_MESSAGE_TOOLCALL']._serialized_end=2090
  _globals['_COMPLETIONRESPONSE_CHOICE_MESSAGE_TOOLCALL_FUNCTION']._serialized_start=2031
  _globals['_COMPLETIONRESPONSE_CHOICE_MESSAGE_TOOLCALL_FUNCTION']._serialized_end=2090
  _globals['_COMPLETIONRESPONSE_CHOICE_MESSAGE_FUNCTIONCALL']._serialized_start=2092
  _globals['_COMPLETIONRESPONSE_CHOICE_MESSAGE_FUNCTIONCALL']._serialized_end=2155
  _globals['_COMPLETIONRESPONSE_CHOICE_MESSAGE_CONTEXT']._serialized_start=2158
  _globals['_COMPLETIONRESPONSE_CHOICE_MESSAGE_CONTEXT']._serialized_end=2433
  _globals['_COMPLETIONRESPONSE_CHOICE_MESSAGE_CONTEXT_CITATION']._serialized_start=2302
  _globals['_COMPLETIONRESPONSE_CHOICE_MESSAGE_CONTEXT_CITATION']._serialized_end=2433
  _globals['_ERRORRESPONSE']._serialized_start=2436
  _globals['_ERRORRESPONSE']._serialized_end=2762
  _globals['_ERRORRESPONSE_INNERERROR']._serialized_start=2627
  _globals['_ERRORRESPONSE_INNERERROR']._serialized_end=2762
# @@protoc_insertion_point(module_scope)
