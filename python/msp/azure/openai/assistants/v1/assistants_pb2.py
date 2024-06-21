# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# NO CHECKED-IN PROTOBUF GENCODE
# source: msp/azure/openai/assistants/v1/assistants.proto
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
    'msp/azure/openai/assistants/v1/assistants.proto'
)
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n/msp/azure/openai/assistants/v1/assistants.proto\x12\x1emsp.azure.openai.assistants.v1\"\x1a\n\x04Tool\x12\x12\n\x04type\x18\x01 \x01(\tR\x04type\"\xaa\x03\n\tAssistant\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x16\n\x06object\x18\x02 \x01(\tR\x06object\x12\x1d\n\ncreated_at\x18\x03 \x01(\x04R\tcreatedAt\x12\x12\n\x04name\x18\x04 \x01(\tR\x04name\x12 \n\x0b\x64\x65scription\x18\x05 \x01(\tR\x0b\x64\x65scription\x12\x14\n\x05model\x18\x06 \x01(\tR\x05model\x12!\n\x0binstruction\x18\x07 \x01(\tR\x0cinstructions\x12:\n\x05tools\x18\x08 \x03(\x0b\x32$.msp.azure.openai.assistants.v1.ToolR\x05tools\x12\x19\n\x08\x66ile_ids\x18\t \x03(\tR\x07\x66ileIds\x12S\n\x08metadata\x18\n \x03(\x0b\x32\x37.msp.azure.openai.assistants.v1.Assistant.MetadataEntryR\x08metadata\x1a;\n\rMetadataEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x14\n\x05value\x18\x02 \x01(\tR\x05value:\x02\x38\x01\"\xdd\x03\n\x16\x43reateAssistantRequest\x12\x14\n\x05model\x18\x01 \x01(\tR\x05model\x12\x12\n\x04name\x18\x02 \x01(\tR\x04name\x12 \n\x0b\x64\x65scription\x18\x03 \x01(\tR\x0b\x64\x65scription\x12!\n\x0binstruction\x18\x04 \x01(\tR\x0cinstructions\x12:\n\x05tools\x18\x05 \x03(\x0b\x32$.msp.azure.openai.assistants.v1.ToolR\x05tools\x12\x19\n\x08\x66ile_ids\x18\x06 \x03(\tR\x07\x66ileIds\x12`\n\x08metadata\x18\x07 \x03(\x0b\x32\x44.msp.azure.openai.assistants.v1.CreateAssistantRequest.MetadataEntryR\x08metadata\x12 \n\x0btemperature\x18\x08 \x01(\x02R\x0btemperature\x12\x13\n\x05top_p\x18\t \x01(\x02R\x04topP\x12\'\n\x0fresponse_format\x18\n \x01(\tR\x0eresponseFormat\x1a;\n\rMetadataEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x14\n\x05value\x18\x02 \x01(\tR\x05value:\x02\x38\x01\"\xe7\x02\n\x16ModifyAssistantRequest\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12!\n\x0binstruction\x18\x03 \x01(\tR\x0cinstructions\x12:\n\x05tools\x18\x04 \x03(\x0b\x32$.msp.azure.openai.assistants.v1.ToolR\x05tools\x12\x19\n\x08\x66ile_ids\x18\x05 \x03(\tR\x07\x66ileIds\x12`\n\x08metadata\x18\x06 \x03(\x0b\x32\x44.msp.azure.openai.assistants.v1.ModifyAssistantRequest.MetadataEntryR\x08metadata\x1a;\n\rMetadataEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12\x14\n\x05value\x18\x02 \x01(\tR\x05value:\x02\x38\x01\x42\xa2\x02\n\"com.msp.azure.openai.assistants.v1B\x0f\x41ssistantsProtoP\x01ZNgithub.com/anaregdesign/msproto/go/msp/azure/openai/assistants/v1;assistantsv1\xa2\x02\x04MAOA\xaa\x02\x1eMsp.Azure.Openai.Assistants.V1\xca\x02\x1eMsp\\Azure\\Openai\\Assistants\\V1\xe2\x02*Msp\\Azure\\Openai\\Assistants\\V1\\GPBMetadata\xea\x02\"Msp::Azure::Openai::Assistants::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'msp.azure.openai.assistants.v1.assistants_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\"com.msp.azure.openai.assistants.v1B\017AssistantsProtoP\001ZNgithub.com/anaregdesign/msproto/go/msp/azure/openai/assistants/v1;assistantsv1\242\002\004MAOA\252\002\036Msp.Azure.Openai.Assistants.V1\312\002\036Msp\\Azure\\Openai\\Assistants\\V1\342\002*Msp\\Azure\\Openai\\Assistants\\V1\\GPBMetadata\352\002\"Msp::Azure::Openai::Assistants::V1'
  _globals['_ASSISTANT_METADATAENTRY']._loaded_options = None
  _globals['_ASSISTANT_METADATAENTRY']._serialized_options = b'8\001'
  _globals['_CREATEASSISTANTREQUEST_METADATAENTRY']._loaded_options = None
  _globals['_CREATEASSISTANTREQUEST_METADATAENTRY']._serialized_options = b'8\001'
  _globals['_MODIFYASSISTANTREQUEST_METADATAENTRY']._loaded_options = None
  _globals['_MODIFYASSISTANTREQUEST_METADATAENTRY']._serialized_options = b'8\001'
  _globals['_TOOL']._serialized_start=83
  _globals['_TOOL']._serialized_end=109
  _globals['_ASSISTANT']._serialized_start=112
  _globals['_ASSISTANT']._serialized_end=538
  _globals['_ASSISTANT_METADATAENTRY']._serialized_start=479
  _globals['_ASSISTANT_METADATAENTRY']._serialized_end=538
  _globals['_CREATEASSISTANTREQUEST']._serialized_start=541
  _globals['_CREATEASSISTANTREQUEST']._serialized_end=1018
  _globals['_CREATEASSISTANTREQUEST_METADATAENTRY']._serialized_start=479
  _globals['_CREATEASSISTANTREQUEST_METADATAENTRY']._serialized_end=538
  _globals['_MODIFYASSISTANTREQUEST']._serialized_start=1021
  _globals['_MODIFYASSISTANTREQUEST']._serialized_end=1380
  _globals['_MODIFYASSISTANTREQUEST_METADATAENTRY']._serialized_start=479
  _globals['_MODIFYASSISTANTREQUEST_METADATAENTRY']._serialized_end=538
# @@protoc_insertion_point(module_scope)