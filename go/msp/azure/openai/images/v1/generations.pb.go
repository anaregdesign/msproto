// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.31.0
// 	protoc        (unknown)
// source: msp/azure/openai/images/v1/generations.proto

package imagesv1

import (
	v1 "github.com/anaregdesign/msproto/go/msp/azure/openai/v1"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type ImageGenerationsRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Prompt         string `protobuf:"bytes,1,opt,name=prompt,proto3" json:"prompt,omitempty"`
	N              uint32 `protobuf:"varint,2,opt,name=n,proto3" json:"n,omitempty"`
	Size           string `protobuf:"bytes,3,opt,name=size,proto3" json:"size,omitempty"`
	ResponseFormat string `protobuf:"bytes,4,opt,name=response_format,json=responseFormat,proto3" json:"response_format,omitempty"`
	UserContext    string `protobuf:"bytes,5,opt,name=user_context,json=userContext,proto3" json:"user_context,omitempty"`
	Quality        string `protobuf:"bytes,6,opt,name=quality,proto3" json:"quality,omitempty"`
	Style          string `protobuf:"bytes,7,opt,name=style,proto3" json:"style,omitempty"`
}

func (x *ImageGenerationsRequest) Reset() {
	*x = ImageGenerationsRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_msp_azure_openai_images_v1_generations_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ImageGenerationsRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ImageGenerationsRequest) ProtoMessage() {}

func (x *ImageGenerationsRequest) ProtoReflect() protoreflect.Message {
	mi := &file_msp_azure_openai_images_v1_generations_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ImageGenerationsRequest.ProtoReflect.Descriptor instead.
func (*ImageGenerationsRequest) Descriptor() ([]byte, []int) {
	return file_msp_azure_openai_images_v1_generations_proto_rawDescGZIP(), []int{0}
}

func (x *ImageGenerationsRequest) GetPrompt() string {
	if x != nil {
		return x.Prompt
	}
	return ""
}

func (x *ImageGenerationsRequest) GetN() uint32 {
	if x != nil {
		return x.N
	}
	return 0
}

func (x *ImageGenerationsRequest) GetSize() string {
	if x != nil {
		return x.Size
	}
	return ""
}

func (x *ImageGenerationsRequest) GetResponseFormat() string {
	if x != nil {
		return x.ResponseFormat
	}
	return ""
}

func (x *ImageGenerationsRequest) GetUserContext() string {
	if x != nil {
		return x.UserContext
	}
	return ""
}

func (x *ImageGenerationsRequest) GetQuality() string {
	if x != nil {
		return x.Quality
	}
	return ""
}

func (x *ImageGenerationsRequest) GetStyle() string {
	if x != nil {
		return x.Style
	}
	return ""
}

type ImageGenerationsResponse struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Created uint64       `protobuf:"varint,1,opt,name=created,proto3" json:"created,omitempty"`
	Data    *ImageResult `protobuf:"bytes,2,opt,name=data,proto3" json:"data,omitempty"`
}

func (x *ImageGenerationsResponse) Reset() {
	*x = ImageGenerationsResponse{}
	if protoimpl.UnsafeEnabled {
		mi := &file_msp_azure_openai_images_v1_generations_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ImageGenerationsResponse) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ImageGenerationsResponse) ProtoMessage() {}

func (x *ImageGenerationsResponse) ProtoReflect() protoreflect.Message {
	mi := &file_msp_azure_openai_images_v1_generations_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ImageGenerationsResponse.ProtoReflect.Descriptor instead.
func (*ImageGenerationsResponse) Descriptor() ([]byte, []int) {
	return file_msp_azure_openai_images_v1_generations_proto_rawDescGZIP(), []int{1}
}

func (x *ImageGenerationsResponse) GetCreated() uint64 {
	if x != nil {
		return x.Created
	}
	return 0
}

func (x *ImageGenerationsResponse) GetData() *ImageResult {
	if x != nil {
		return x.Data
	}
	return nil
}

type ImageResult struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Url                 string                    `protobuf:"bytes,1,opt,name=url,proto3" json:"url,omitempty"`
	B64Json             string                    `protobuf:"bytes,2,opt,name=b64_json,json=b64Json,proto3" json:"b64_json,omitempty"`
	ContentFilterResult *DalleContentFilterResult `protobuf:"bytes,3,opt,name=content_filter_result,json=content_filter_results,proto3" json:"content_filter_result,omitempty"`
	RevisedPrompt       string                    `protobuf:"bytes,4,opt,name=revised_prompt,json=revisedPrompt,proto3" json:"revised_prompt,omitempty"`
	PromptFilterResult  *DalleFilterResult        `protobuf:"bytes,5,opt,name=prompt_filter_result,json=prompt_filter_results,proto3" json:"prompt_filter_result,omitempty"`
}

func (x *ImageResult) Reset() {
	*x = ImageResult{}
	if protoimpl.UnsafeEnabled {
		mi := &file_msp_azure_openai_images_v1_generations_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ImageResult) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ImageResult) ProtoMessage() {}

func (x *ImageResult) ProtoReflect() protoreflect.Message {
	mi := &file_msp_azure_openai_images_v1_generations_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ImageResult.ProtoReflect.Descriptor instead.
func (*ImageResult) Descriptor() ([]byte, []int) {
	return file_msp_azure_openai_images_v1_generations_proto_rawDescGZIP(), []int{2}
}

func (x *ImageResult) GetUrl() string {
	if x != nil {
		return x.Url
	}
	return ""
}

func (x *ImageResult) GetB64Json() string {
	if x != nil {
		return x.B64Json
	}
	return ""
}

func (x *ImageResult) GetContentFilterResult() *DalleContentFilterResult {
	if x != nil {
		return x.ContentFilterResult
	}
	return nil
}

func (x *ImageResult) GetRevisedPrompt() string {
	if x != nil {
		return x.RevisedPrompt
	}
	return ""
}

func (x *ImageResult) GetPromptFilterResult() *DalleFilterResult {
	if x != nil {
		return x.PromptFilterResult
	}
	return nil
}

type DalleContentFilterResult struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Sexual   *v1.ContentFilterSeverityResult `protobuf:"bytes,1,opt,name=sexual,proto3" json:"sexual,omitempty"`
	Violence *v1.ContentFilterSeverityResult `protobuf:"bytes,2,opt,name=violence,proto3" json:"violence,omitempty"`
	Hate     *v1.ContentFilterSeverityResult `protobuf:"bytes,3,opt,name=hate,proto3" json:"hate,omitempty"`
	SelfHarm *v1.ContentFilterSeverityResult `protobuf:"bytes,4,opt,name=self_harm,json=selfHarm,proto3" json:"self_harm,omitempty"`
}

func (x *DalleContentFilterResult) Reset() {
	*x = DalleContentFilterResult{}
	if protoimpl.UnsafeEnabled {
		mi := &file_msp_azure_openai_images_v1_generations_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DalleContentFilterResult) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DalleContentFilterResult) ProtoMessage() {}

func (x *DalleContentFilterResult) ProtoReflect() protoreflect.Message {
	mi := &file_msp_azure_openai_images_v1_generations_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DalleContentFilterResult.ProtoReflect.Descriptor instead.
func (*DalleContentFilterResult) Descriptor() ([]byte, []int) {
	return file_msp_azure_openai_images_v1_generations_proto_rawDescGZIP(), []int{3}
}

func (x *DalleContentFilterResult) GetSexual() *v1.ContentFilterSeverityResult {
	if x != nil {
		return x.Sexual
	}
	return nil
}

func (x *DalleContentFilterResult) GetViolence() *v1.ContentFilterSeverityResult {
	if x != nil {
		return x.Violence
	}
	return nil
}

func (x *DalleContentFilterResult) GetHate() *v1.ContentFilterSeverityResult {
	if x != nil {
		return x.Hate
	}
	return nil
}

func (x *DalleContentFilterResult) GetSelfHarm() *v1.ContentFilterSeverityResult {
	if x != nil {
		return x.SelfHarm
	}
	return nil
}

type DalleFilterResult struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Sexual    *v1.ContentFilterSeverityResult `protobuf:"bytes,1,opt,name=sexual,proto3" json:"sexual,omitempty"`
	Violence  *v1.ContentFilterSeverityResult `protobuf:"bytes,2,opt,name=violence,proto3" json:"violence,omitempty"`
	Hate      *v1.ContentFilterSeverityResult `protobuf:"bytes,3,opt,name=hate,proto3" json:"hate,omitempty"`
	SelfHarm  *v1.ContentFilterSeverityResult `protobuf:"bytes,4,opt,name=self_harm,json=selfHarm,proto3" json:"self_harm,omitempty"`
	Profanity *v1.ContentFilterDetectedResult `protobuf:"bytes,5,opt,name=profanity,proto3" json:"profanity,omitempty"`
	Jailbreak *v1.ContentFilterDetectedResult `protobuf:"bytes,6,opt,name=jailbreak,proto3" json:"jailbreak,omitempty"`
}

func (x *DalleFilterResult) Reset() {
	*x = DalleFilterResult{}
	if protoimpl.UnsafeEnabled {
		mi := &file_msp_azure_openai_images_v1_generations_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DalleFilterResult) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DalleFilterResult) ProtoMessage() {}

func (x *DalleFilterResult) ProtoReflect() protoreflect.Message {
	mi := &file_msp_azure_openai_images_v1_generations_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DalleFilterResult.ProtoReflect.Descriptor instead.
func (*DalleFilterResult) Descriptor() ([]byte, []int) {
	return file_msp_azure_openai_images_v1_generations_proto_rawDescGZIP(), []int{4}
}

func (x *DalleFilterResult) GetSexual() *v1.ContentFilterSeverityResult {
	if x != nil {
		return x.Sexual
	}
	return nil
}

func (x *DalleFilterResult) GetViolence() *v1.ContentFilterSeverityResult {
	if x != nil {
		return x.Violence
	}
	return nil
}

func (x *DalleFilterResult) GetHate() *v1.ContentFilterSeverityResult {
	if x != nil {
		return x.Hate
	}
	return nil
}

func (x *DalleFilterResult) GetSelfHarm() *v1.ContentFilterSeverityResult {
	if x != nil {
		return x.SelfHarm
	}
	return nil
}

func (x *DalleFilterResult) GetProfanity() *v1.ContentFilterDetectedResult {
	if x != nil {
		return x.Profanity
	}
	return nil
}

func (x *DalleFilterResult) GetJailbreak() *v1.ContentFilterDetectedResult {
	if x != nil {
		return x.Jailbreak
	}
	return nil
}

var File_msp_azure_openai_images_v1_generations_proto protoreflect.FileDescriptor

var file_msp_azure_openai_images_v1_generations_proto_rawDesc = []byte{
	0x0a, 0x2c, 0x6d, 0x73, 0x70, 0x2f, 0x61, 0x7a, 0x75, 0x72, 0x65, 0x2f, 0x6f, 0x70, 0x65, 0x6e,
	0x61, 0x69, 0x2f, 0x69, 0x6d, 0x61, 0x67, 0x65, 0x73, 0x2f, 0x76, 0x31, 0x2f, 0x67, 0x65, 0x6e,
	0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x1a,
	0x6d, 0x73, 0x70, 0x2e, 0x61, 0x7a, 0x75, 0x72, 0x65, 0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x69,
	0x2e, 0x69, 0x6d, 0x61, 0x67, 0x65, 0x73, 0x2e, 0x76, 0x31, 0x1a, 0x20, 0x6d, 0x73, 0x70, 0x2f,
	0x61, 0x7a, 0x75, 0x72, 0x65, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x69, 0x2f, 0x76, 0x31, 0x2f,
	0x65, 0x6e, 0x74, 0x69, 0x74, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xcf, 0x01, 0x0a,
	0x17, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x70, 0x72, 0x6f, 0x6d,
	0x70, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x70, 0x72, 0x6f, 0x6d, 0x70, 0x74,
	0x12, 0x0c, 0x0a, 0x01, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0d, 0x52, 0x01, 0x6e, 0x12, 0x12,
	0x0a, 0x04, 0x73, 0x69, 0x7a, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x73, 0x69,
	0x7a, 0x65, 0x12, 0x27, 0x0a, 0x0f, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x5f, 0x66,
	0x6f, 0x72, 0x6d, 0x61, 0x74, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x72, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x46, 0x6f, 0x72, 0x6d, 0x61, 0x74, 0x12, 0x21, 0x0a, 0x0c, 0x75,
	0x73, 0x65, 0x72, 0x5f, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x78, 0x74, 0x18, 0x05, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0b, 0x75, 0x73, 0x65, 0x72, 0x43, 0x6f, 0x6e, 0x74, 0x65, 0x78, 0x74, 0x12, 0x18,
	0x0a, 0x07, 0x71, 0x75, 0x61, 0x6c, 0x69, 0x74, 0x79, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x07, 0x71, 0x75, 0x61, 0x6c, 0x69, 0x74, 0x79, 0x12, 0x14, 0x0a, 0x05, 0x73, 0x74, 0x79, 0x6c,
	0x65, 0x18, 0x07, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x73, 0x74, 0x79, 0x6c, 0x65, 0x22, 0x71,
	0x0a, 0x18, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x73, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x63, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x04, 0x52, 0x07, 0x63, 0x72, 0x65,
	0x61, 0x74, 0x65, 0x64, 0x12, 0x3b, 0x0a, 0x04, 0x64, 0x61, 0x74, 0x61, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x27, 0x2e, 0x6d, 0x73, 0x70, 0x2e, 0x61, 0x7a, 0x75, 0x72, 0x65, 0x2e, 0x6f,
	0x70, 0x65, 0x6e, 0x61, 0x69, 0x2e, 0x69, 0x6d, 0x61, 0x67, 0x65, 0x73, 0x2e, 0x76, 0x31, 0x2e,
	0x49, 0x6d, 0x61, 0x67, 0x65, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x04, 0x64, 0x61, 0x74,
	0x61, 0x22, 0xb2, 0x02, 0x0a, 0x0b, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x52, 0x65, 0x73, 0x75, 0x6c,
	0x74, 0x12, 0x10, 0x0a, 0x03, 0x75, 0x72, 0x6c, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03,
	0x75, 0x72, 0x6c, 0x12, 0x19, 0x0a, 0x08, 0x62, 0x36, 0x34, 0x5f, 0x6a, 0x73, 0x6f, 0x6e, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x62, 0x36, 0x34, 0x4a, 0x73, 0x6f, 0x6e, 0x12, 0x6b,
	0x0a, 0x15, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x5f, 0x66, 0x69, 0x6c, 0x74, 0x65, 0x72,
	0x5f, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x34, 0x2e,
	0x6d, 0x73, 0x70, 0x2e, 0x61, 0x7a, 0x75, 0x72, 0x65, 0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x69,
	0x2e, 0x69, 0x6d, 0x61, 0x67, 0x65, 0x73, 0x2e, 0x76, 0x31, 0x2e, 0x44, 0x61, 0x6c, 0x6c, 0x65,
	0x43, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x46, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x52, 0x65, 0x73,
	0x75, 0x6c, 0x74, 0x52, 0x16, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x5f, 0x66, 0x69, 0x6c,
	0x74, 0x65, 0x72, 0x5f, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x73, 0x12, 0x25, 0x0a, 0x0e, 0x72,
	0x65, 0x76, 0x69, 0x73, 0x65, 0x64, 0x5f, 0x70, 0x72, 0x6f, 0x6d, 0x70, 0x74, 0x18, 0x04, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x0d, 0x72, 0x65, 0x76, 0x69, 0x73, 0x65, 0x64, 0x50, 0x72, 0x6f, 0x6d,
	0x70, 0x74, 0x12, 0x62, 0x0a, 0x14, 0x70, 0x72, 0x6f, 0x6d, 0x70, 0x74, 0x5f, 0x66, 0x69, 0x6c,
	0x74, 0x65, 0x72, 0x5f, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x2d, 0x2e, 0x6d, 0x73, 0x70, 0x2e, 0x61, 0x7a, 0x75, 0x72, 0x65, 0x2e, 0x6f, 0x70, 0x65,
	0x6e, 0x61, 0x69, 0x2e, 0x69, 0x6d, 0x61, 0x67, 0x65, 0x73, 0x2e, 0x76, 0x31, 0x2e, 0x44, 0x61,
	0x6c, 0x6c, 0x65, 0x46, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52,
	0x15, 0x70, 0x72, 0x6f, 0x6d, 0x70, 0x74, 0x5f, 0x66, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x5f, 0x72,
	0x65, 0x73, 0x75, 0x6c, 0x74, 0x73, 0x22, 0xc7, 0x02, 0x0a, 0x18, 0x44, 0x61, 0x6c, 0x6c, 0x65,
	0x43, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x46, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x52, 0x65, 0x73,
	0x75, 0x6c, 0x74, 0x12, 0x48, 0x0a, 0x06, 0x73, 0x65, 0x78, 0x75, 0x61, 0x6c, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x6d, 0x73, 0x70, 0x2e, 0x61, 0x7a, 0x75, 0x72, 0x65, 0x2e,
	0x6f, 0x70, 0x65, 0x6e, 0x61, 0x69, 0x2e, 0x76, 0x31, 0x2e, 0x43, 0x6f, 0x6e, 0x74, 0x65, 0x6e,
	0x74, 0x46, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x53, 0x65, 0x76, 0x65, 0x72, 0x69, 0x74, 0x79, 0x52,
	0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x06, 0x73, 0x65, 0x78, 0x75, 0x61, 0x6c, 0x12, 0x4c, 0x0a,
	0x08, 0x76, 0x69, 0x6f, 0x6c, 0x65, 0x6e, 0x63, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x30, 0x2e, 0x6d, 0x73, 0x70, 0x2e, 0x61, 0x7a, 0x75, 0x72, 0x65, 0x2e, 0x6f, 0x70, 0x65, 0x6e,
	0x61, 0x69, 0x2e, 0x76, 0x31, 0x2e, 0x43, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x46, 0x69, 0x6c,
	0x74, 0x65, 0x72, 0x53, 0x65, 0x76, 0x65, 0x72, 0x69, 0x74, 0x79, 0x52, 0x65, 0x73, 0x75, 0x6c,
	0x74, 0x52, 0x08, 0x76, 0x69, 0x6f, 0x6c, 0x65, 0x6e, 0x63, 0x65, 0x12, 0x44, 0x0a, 0x04, 0x68,
	0x61, 0x74, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x6d, 0x73, 0x70, 0x2e,
	0x61, 0x7a, 0x75, 0x72, 0x65, 0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x69, 0x2e, 0x76, 0x31, 0x2e,
	0x43, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x46, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x53, 0x65, 0x76,
	0x65, 0x72, 0x69, 0x74, 0x79, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x04, 0x68, 0x61, 0x74,
	0x65, 0x12, 0x4d, 0x0a, 0x09, 0x73, 0x65, 0x6c, 0x66, 0x5f, 0x68, 0x61, 0x72, 0x6d, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x6d, 0x73, 0x70, 0x2e, 0x61, 0x7a, 0x75, 0x72, 0x65,
	0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x69, 0x2e, 0x76, 0x31, 0x2e, 0x43, 0x6f, 0x6e, 0x74, 0x65,
	0x6e, 0x74, 0x46, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x53, 0x65, 0x76, 0x65, 0x72, 0x69, 0x74, 0x79,
	0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x08, 0x73, 0x65, 0x6c, 0x66, 0x48, 0x61, 0x72, 0x6d,
	0x22, 0xe0, 0x03, 0x0a, 0x11, 0x44, 0x61, 0x6c, 0x6c, 0x65, 0x46, 0x69, 0x6c, 0x74, 0x65, 0x72,
	0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x48, 0x0a, 0x06, 0x73, 0x65, 0x78, 0x75, 0x61, 0x6c,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x6d, 0x73, 0x70, 0x2e, 0x61, 0x7a, 0x75,
	0x72, 0x65, 0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x69, 0x2e, 0x76, 0x31, 0x2e, 0x43, 0x6f, 0x6e,
	0x74, 0x65, 0x6e, 0x74, 0x46, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x53, 0x65, 0x76, 0x65, 0x72, 0x69,
	0x74, 0x79, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x06, 0x73, 0x65, 0x78, 0x75, 0x61, 0x6c,
	0x12, 0x4c, 0x0a, 0x08, 0x76, 0x69, 0x6f, 0x6c, 0x65, 0x6e, 0x63, 0x65, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x30, 0x2e, 0x6d, 0x73, 0x70, 0x2e, 0x61, 0x7a, 0x75, 0x72, 0x65, 0x2e, 0x6f,
	0x70, 0x65, 0x6e, 0x61, 0x69, 0x2e, 0x76, 0x31, 0x2e, 0x43, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74,
	0x46, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x53, 0x65, 0x76, 0x65, 0x72, 0x69, 0x74, 0x79, 0x52, 0x65,
	0x73, 0x75, 0x6c, 0x74, 0x52, 0x08, 0x76, 0x69, 0x6f, 0x6c, 0x65, 0x6e, 0x63, 0x65, 0x12, 0x44,
	0x0a, 0x04, 0x68, 0x61, 0x74, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x6d,
	0x73, 0x70, 0x2e, 0x61, 0x7a, 0x75, 0x72, 0x65, 0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x69, 0x2e,
	0x76, 0x31, 0x2e, 0x43, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x46, 0x69, 0x6c, 0x74, 0x65, 0x72,
	0x53, 0x65, 0x76, 0x65, 0x72, 0x69, 0x74, 0x79, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x04,
	0x68, 0x61, 0x74, 0x65, 0x12, 0x4d, 0x0a, 0x09, 0x73, 0x65, 0x6c, 0x66, 0x5f, 0x68, 0x61, 0x72,
	0x6d, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x6d, 0x73, 0x70, 0x2e, 0x61, 0x7a,
	0x75, 0x72, 0x65, 0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x69, 0x2e, 0x76, 0x31, 0x2e, 0x43, 0x6f,
	0x6e, 0x74, 0x65, 0x6e, 0x74, 0x46, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x53, 0x65, 0x76, 0x65, 0x72,
	0x69, 0x74, 0x79, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x08, 0x73, 0x65, 0x6c, 0x66, 0x48,
	0x61, 0x72, 0x6d, 0x12, 0x4e, 0x0a, 0x09, 0x70, 0x72, 0x6f, 0x66, 0x61, 0x6e, 0x69, 0x74, 0x79,
	0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x6d, 0x73, 0x70, 0x2e, 0x61, 0x7a, 0x75,
	0x72, 0x65, 0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x69, 0x2e, 0x76, 0x31, 0x2e, 0x43, 0x6f, 0x6e,
	0x74, 0x65, 0x6e, 0x74, 0x46, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x44, 0x65, 0x74, 0x65, 0x63, 0x74,
	0x65, 0x64, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x09, 0x70, 0x72, 0x6f, 0x66, 0x61, 0x6e,
	0x69, 0x74, 0x79, 0x12, 0x4e, 0x0a, 0x09, 0x6a, 0x61, 0x69, 0x6c, 0x62, 0x72, 0x65, 0x61, 0x6b,
	0x18, 0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x30, 0x2e, 0x6d, 0x73, 0x70, 0x2e, 0x61, 0x7a, 0x75,
	0x72, 0x65, 0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x69, 0x2e, 0x76, 0x31, 0x2e, 0x43, 0x6f, 0x6e,
	0x74, 0x65, 0x6e, 0x74, 0x46, 0x69, 0x6c, 0x74, 0x65, 0x72, 0x44, 0x65, 0x74, 0x65, 0x63, 0x74,
	0x65, 0x64, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52, 0x09, 0x6a, 0x61, 0x69, 0x6c, 0x62, 0x72,
	0x65, 0x61, 0x6b, 0x42, 0x87, 0x02, 0x0a, 0x1e, 0x63, 0x6f, 0x6d, 0x2e, 0x6d, 0x73, 0x70, 0x2e,
	0x61, 0x7a, 0x75, 0x72, 0x65, 0x2e, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x69, 0x2e, 0x69, 0x6d, 0x61,
	0x67, 0x65, 0x73, 0x2e, 0x76, 0x31, 0x42, 0x10, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x69,
	0x6f, 0x6e, 0x73, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x50, 0x01, 0x5a, 0x46, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x61, 0x6e, 0x61, 0x72, 0x65, 0x67, 0x64, 0x65, 0x73,
	0x69, 0x67, 0x6e, 0x2f, 0x6d, 0x73, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x2f, 0x6d,
	0x73, 0x70, 0x2f, 0x61, 0x7a, 0x75, 0x72, 0x65, 0x2f, 0x6f, 0x70, 0x65, 0x6e, 0x61, 0x69, 0x2f,
	0x69, 0x6d, 0x61, 0x67, 0x65, 0x73, 0x2f, 0x76, 0x31, 0x3b, 0x69, 0x6d, 0x61, 0x67, 0x65, 0x73,
	0x76, 0x31, 0xa2, 0x02, 0x04, 0x4d, 0x41, 0x4f, 0x49, 0xaa, 0x02, 0x1a, 0x4d, 0x73, 0x70, 0x2e,
	0x41, 0x7a, 0x75, 0x72, 0x65, 0x2e, 0x4f, 0x70, 0x65, 0x6e, 0x61, 0x69, 0x2e, 0x49, 0x6d, 0x61,
	0x67, 0x65, 0x73, 0x2e, 0x56, 0x31, 0xca, 0x02, 0x1a, 0x4d, 0x73, 0x70, 0x5c, 0x41, 0x7a, 0x75,
	0x72, 0x65, 0x5c, 0x4f, 0x70, 0x65, 0x6e, 0x61, 0x69, 0x5c, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x73,
	0x5c, 0x56, 0x31, 0xe2, 0x02, 0x26, 0x4d, 0x73, 0x70, 0x5c, 0x41, 0x7a, 0x75, 0x72, 0x65, 0x5c,
	0x4f, 0x70, 0x65, 0x6e, 0x61, 0x69, 0x5c, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x73, 0x5c, 0x56, 0x31,
	0x5c, 0x47, 0x50, 0x42, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0xea, 0x02, 0x1e, 0x4d,
	0x73, 0x70, 0x3a, 0x3a, 0x41, 0x7a, 0x75, 0x72, 0x65, 0x3a, 0x3a, 0x4f, 0x70, 0x65, 0x6e, 0x61,
	0x69, 0x3a, 0x3a, 0x49, 0x6d, 0x61, 0x67, 0x65, 0x73, 0x3a, 0x3a, 0x56, 0x31, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_msp_azure_openai_images_v1_generations_proto_rawDescOnce sync.Once
	file_msp_azure_openai_images_v1_generations_proto_rawDescData = file_msp_azure_openai_images_v1_generations_proto_rawDesc
)

func file_msp_azure_openai_images_v1_generations_proto_rawDescGZIP() []byte {
	file_msp_azure_openai_images_v1_generations_proto_rawDescOnce.Do(func() {
		file_msp_azure_openai_images_v1_generations_proto_rawDescData = protoimpl.X.CompressGZIP(file_msp_azure_openai_images_v1_generations_proto_rawDescData)
	})
	return file_msp_azure_openai_images_v1_generations_proto_rawDescData
}

var file_msp_azure_openai_images_v1_generations_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_msp_azure_openai_images_v1_generations_proto_goTypes = []interface{}{
	(*ImageGenerationsRequest)(nil),        // 0: msp.azure.openai.images.v1.ImageGenerationsRequest
	(*ImageGenerationsResponse)(nil),       // 1: msp.azure.openai.images.v1.ImageGenerationsResponse
	(*ImageResult)(nil),                    // 2: msp.azure.openai.images.v1.ImageResult
	(*DalleContentFilterResult)(nil),       // 3: msp.azure.openai.images.v1.DalleContentFilterResult
	(*DalleFilterResult)(nil),              // 4: msp.azure.openai.images.v1.DalleFilterResult
	(*v1.ContentFilterSeverityResult)(nil), // 5: msp.azure.openai.v1.ContentFilterSeverityResult
	(*v1.ContentFilterDetectedResult)(nil), // 6: msp.azure.openai.v1.ContentFilterDetectedResult
}
var file_msp_azure_openai_images_v1_generations_proto_depIdxs = []int32{
	2,  // 0: msp.azure.openai.images.v1.ImageGenerationsResponse.data:type_name -> msp.azure.openai.images.v1.ImageResult
	3,  // 1: msp.azure.openai.images.v1.ImageResult.content_filter_result:type_name -> msp.azure.openai.images.v1.DalleContentFilterResult
	4,  // 2: msp.azure.openai.images.v1.ImageResult.prompt_filter_result:type_name -> msp.azure.openai.images.v1.DalleFilterResult
	5,  // 3: msp.azure.openai.images.v1.DalleContentFilterResult.sexual:type_name -> msp.azure.openai.v1.ContentFilterSeverityResult
	5,  // 4: msp.azure.openai.images.v1.DalleContentFilterResult.violence:type_name -> msp.azure.openai.v1.ContentFilterSeverityResult
	5,  // 5: msp.azure.openai.images.v1.DalleContentFilterResult.hate:type_name -> msp.azure.openai.v1.ContentFilterSeverityResult
	5,  // 6: msp.azure.openai.images.v1.DalleContentFilterResult.self_harm:type_name -> msp.azure.openai.v1.ContentFilterSeverityResult
	5,  // 7: msp.azure.openai.images.v1.DalleFilterResult.sexual:type_name -> msp.azure.openai.v1.ContentFilterSeverityResult
	5,  // 8: msp.azure.openai.images.v1.DalleFilterResult.violence:type_name -> msp.azure.openai.v1.ContentFilterSeverityResult
	5,  // 9: msp.azure.openai.images.v1.DalleFilterResult.hate:type_name -> msp.azure.openai.v1.ContentFilterSeverityResult
	5,  // 10: msp.azure.openai.images.v1.DalleFilterResult.self_harm:type_name -> msp.azure.openai.v1.ContentFilterSeverityResult
	6,  // 11: msp.azure.openai.images.v1.DalleFilterResult.profanity:type_name -> msp.azure.openai.v1.ContentFilterDetectedResult
	6,  // 12: msp.azure.openai.images.v1.DalleFilterResult.jailbreak:type_name -> msp.azure.openai.v1.ContentFilterDetectedResult
	13, // [13:13] is the sub-list for method output_type
	13, // [13:13] is the sub-list for method input_type
	13, // [13:13] is the sub-list for extension type_name
	13, // [13:13] is the sub-list for extension extendee
	0,  // [0:13] is the sub-list for field type_name
}

func init() { file_msp_azure_openai_images_v1_generations_proto_init() }
func file_msp_azure_openai_images_v1_generations_proto_init() {
	if File_msp_azure_openai_images_v1_generations_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_msp_azure_openai_images_v1_generations_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ImageGenerationsRequest); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_msp_azure_openai_images_v1_generations_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ImageGenerationsResponse); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_msp_azure_openai_images_v1_generations_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ImageResult); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_msp_azure_openai_images_v1_generations_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DalleContentFilterResult); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_msp_azure_openai_images_v1_generations_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DalleFilterResult); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_msp_azure_openai_images_v1_generations_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_msp_azure_openai_images_v1_generations_proto_goTypes,
		DependencyIndexes: file_msp_azure_openai_images_v1_generations_proto_depIdxs,
		MessageInfos:      file_msp_azure_openai_images_v1_generations_proto_msgTypes,
	}.Build()
	File_msp_azure_openai_images_v1_generations_proto = out.File
	file_msp_azure_openai_images_v1_generations_proto_rawDesc = nil
	file_msp_azure_openai_images_v1_generations_proto_goTypes = nil
	file_msp_azure_openai_images_v1_generations_proto_depIdxs = nil
}
