# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: azure/openai/v1/embeddings.proto
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
    'azure/openai/v1/embeddings.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from azure.openai.v1 import entity_pb2 as azure_dot_openai_dot_v1_dot_entity__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n azure/openai/v1/embeddings.proto\x12\x0f\x61zure.openai.v1\x1a\x1c\x61zure/openai/v1/entity.proto\"\xff\x01\n\x10\x45mbeddingRequest\x12\x14\n\x05input\x18\x01 \x01(\tR\x05input\x12\x12\n\x04user\x18\x02 \x01(\tR\x04user\x12\x1d\n\ninput_type\x18\x03 \x01(\tR\tinputType\x12_\n\x0f\x61\x64\x64itional_prop\x18\x04 \x03(\x0b\x32\x35.azure.openai.v1.EmbeddingRequest.AdditionalPropEntryR\x0f\x61\x64\x64itionalProp1\x1a\x41\n\x13\x41\x64\x64itionalPropEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x14\n\x05value\x18\x02 \x01(\tR\x05value:\x02\x38\x01\"\x9a\x01\n\x11\x45mbeddingResponse\x12\x16\n\x06object\x18\x01 \x01(\tR\x06object\x12\x14\n\x05model\x18\x02 \x01(\tR\x05model\x12)\n\x04\x64\x61ta\x18\x03 \x03(\x0b\x32\x15.azure.openai.v1.DataR\x04\x64\x61ta\x12,\n\x05usage\x18\x04 \x01(\x0b\x32\x16.azure.openai.v1.UsageR\x05usage\"R\n\x04\x44\x61ta\x12\x14\n\x05index\x18\x01 \x01(\rR\x05index\x12\x16\n\x06object\x18\x02 \x01(\tR\x06object\x12\x1c\n\tembedding\x18\x03 \x03(\x02R\tembeddingB\xc5\x01\n\x13\x63om.azure.openai.v1B\x0f\x45mbeddingsProtoP\x01Z?github.com/anaregdesign/azure-proto/go/azure/openai/v1;openaiv1\xa2\x02\x03\x41OX\xaa\x02\x0f\x41zure.Openai.V1\xca\x02\x0f\x41zure\\Openai\\V1\xe2\x02\x1b\x41zure\\Openai\\V1\\GPBMetadata\xea\x02\x11\x41zure::Openai::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'azure.openai.v1.embeddings_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\023com.azure.openai.v1B\017EmbeddingsProtoP\001Z?github.com/anaregdesign/azure-proto/go/azure/openai/v1;openaiv1\242\002\003AOX\252\002\017Azure.Openai.V1\312\002\017Azure\\Openai\\V1\342\002\033Azure\\Openai\\V1\\GPBMetadata\352\002\021Azure::Openai::V1'
  _globals['_EMBEDDINGREQUEST_ADDITIONALPROPENTRY']._loaded_options = None
  _globals['_EMBEDDINGREQUEST_ADDITIONALPROPENTRY']._serialized_options = b'8\001'
  _globals['_EMBEDDINGREQUEST']._serialized_start=84
  _globals['_EMBEDDINGREQUEST']._serialized_end=339
  _globals['_EMBEDDINGREQUEST_ADDITIONALPROPENTRY']._serialized_start=274
  _globals['_EMBEDDINGREQUEST_ADDITIONALPROPENTRY']._serialized_end=339
  _globals['_EMBEDDINGRESPONSE']._serialized_start=342
  _globals['_EMBEDDINGRESPONSE']._serialized_end=496
  _globals['_DATA']._serialized_start=498
  _globals['_DATA']._serialized_end=580
# @@protoc_insertion_point(module_scope)
