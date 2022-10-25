package com.linjingc.protobufdemo.protobuf;

public final class DemoProto {
    private DemoProto() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface DemoOrBuilder extends
            // @@protoc_insertion_point(interface_extends:com.wxw.notes.protobuf.proto.Demo)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * 自身属性
         * </pre>
         *
         * <code>int32 id = 1;</code>
         *
         * @return The id.
         */
        int getId();

        /**
         * <code>string code = 2;</code>
         *
         * @return The code.
         */
        java.lang.String getCode();

        /**
         * <code>string code = 2;</code>
         *
         * @return The bytes for code.
         */
        com.google.protobuf.ByteString
        getCodeBytes();

        /**
         * <code>string name = 3;</code>
         *
         * @return The name.
         */
        java.lang.String getName();

        /**
         * <code>string name = 3;</code>
         *
         * @return The bytes for name.
         */
        com.google.protobuf.ByteString
        getNameBytes();
    }

    /**
     * Protobuf type {@code com.wxw.notes.protobuf.proto.Demo}
     */
    public static final class Demo extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:com.wxw.notes.protobuf.proto.Demo)
            DemoOrBuilder {
        private static final long serialVersionUID = 0L;

        // Use Demo.newBuilder() to construct.
        private Demo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private Demo() {
            code_ = "";
            name_ = "";
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(
                UnusedPrivateParameter unused) {
            return new Demo();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return DemoProto.internal_static_com_wxw_notes_protobuf_proto_Demo_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return DemoProto.internal_static_com_wxw_notes_protobuf_proto_Demo_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            DemoProto.Demo.class, DemoProto.Demo.Builder.class);
        }

        public static final int ID_FIELD_NUMBER = 1;
        private int id_;

        /**
         * <pre>
         * 自身属性
         * </pre>
         *
         * <code>int32 id = 1;</code>
         *
         * @return The id.
         */
        @java.lang.Override
        public int getId() {
            return id_;
        }

        public static final int CODE_FIELD_NUMBER = 2;
        private volatile java.lang.Object code_;

        /**
         * <code>string code = 2;</code>
         *
         * @return The code.
         */
        @java.lang.Override
        public java.lang.String getCode() {
            java.lang.Object ref = code_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                code_ = s;
                return s;
            }
        }

        /**
         * <code>string code = 2;</code>
         *
         * @return The bytes for code.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString
        getCodeBytes() {
            java.lang.Object ref = code_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                code_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int NAME_FIELD_NUMBER = 3;
        private volatile java.lang.Object name_;

        /**
         * <code>string name = 3;</code>
         *
         * @return The name.
         */
        @java.lang.Override
        public java.lang.String getName() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                name_ = s;
                return s;
            }
        }

        /**
         * <code>string name = 3;</code>
         *
         * @return The bytes for name.
         */
        @java.lang.Override
        public com.google.protobuf.ByteString
        getNameBytes() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;

        @java.lang.Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            memoizedIsInitialized = 1;
            return true;
        }

        @java.lang.Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (id_ != 0) {
                output.writeInt32(1, id_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(code_)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, code_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
            }
            getUnknownFields().writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (id_ != 0) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32Size(1, id_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(code_)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, code_);
            }
            if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @java.lang.Override
        public boolean equals(final java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DemoProto.Demo)) {
                return super.equals(obj);
            }
            DemoProto.Demo other = (DemoProto.Demo) obj;

            if (getId()
                    != other.getId()) return false;
            if (!getCode()
                    .equals(other.getCode())) return false;
            if (!getName()
                    .equals(other.getName())) return false;
            if (!getUnknownFields().equals(other.getUnknownFields())) return false;
            return true;
        }

        @java.lang.Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            hash = (37 * hash) + ID_FIELD_NUMBER;
            hash = (53 * hash) + getId();
            hash = (37 * hash) + CODE_FIELD_NUMBER;
            hash = (53 * hash) + getCode().hashCode();
            hash = (37 * hash) + NAME_FIELD_NUMBER;
            hash = (53 * hash) + getName().hashCode();
            hash = (29 * hash) + getUnknownFields().hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static DemoProto.Demo parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static DemoProto.Demo parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static DemoProto.Demo parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static DemoProto.Demo parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static DemoProto.Demo parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static DemoProto.Demo parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static DemoProto.Demo parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static DemoProto.Demo parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        public static DemoProto.Demo parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }

        public static DemoProto.Demo parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }

        public static DemoProto.Demo parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }

        public static DemoProto.Demo parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(DemoProto.Demo prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code com.wxw.notes.protobuf.proto.Demo}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:com.wxw.notes.protobuf.proto.Demo)
                DemoProto.DemoOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return DemoProto.internal_static_com_wxw_notes_protobuf_proto_Demo_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return DemoProto.internal_static_com_wxw_notes_protobuf_proto_Demo_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                DemoProto.Demo.class, DemoProto.Demo.Builder.class);
            }

            // Construct using com.linjingc.protobufdemo.protobuf.DemoProto.Demo.newBuilder()
            private Builder() {

            }

            private Builder(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);

            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                id_ = 0;

                code_ = "";

                name_ = "";

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return DemoProto.internal_static_com_wxw_notes_protobuf_proto_Demo_descriptor;
            }

            @java.lang.Override
            public DemoProto.Demo getDefaultInstanceForType() {
                return DemoProto.Demo.getDefaultInstance();
            }

            @java.lang.Override
            public DemoProto.Demo build() {
                DemoProto.Demo result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public DemoProto.Demo buildPartial() {
                DemoProto.Demo result = new DemoProto.Demo(this);
                result.id_ = id_;
                result.code_ = code_;
                result.name_ = name_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof DemoProto.Demo) {
                    return mergeFrom((DemoProto.Demo) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(DemoProto.Demo other) {
                if (other == DemoProto.Demo.getDefaultInstance()) return this;
                if (other.getId() != 0) {
                    setId(other.getId());
                }
                if (!other.getCode().isEmpty()) {
                    code_ = other.code_;
                    onChanged();
                }
                if (!other.getName().isEmpty()) {
                    name_ = other.name_;
                    onChanged();
                }
                this.mergeUnknownFields(other.getUnknownFields());
                onChanged();
                return this;
            }

            @java.lang.Override
            public final boolean isInitialized() {
                return true;
            }

            @java.lang.Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                if (extensionRegistry == null) {
                    throw new java.lang.NullPointerException();
                }
                try {
                    boolean done = false;
                    while (!done) {
                        int tag = input.readTag();
                        switch (tag) {
                            case 0:
                                done = true;
                                break;
                            case 8: {
                                id_ = input.readInt32();

                                break;
                            } // case 8
                            case 18: {
                                code_ = input.readStringRequireUtf8();

                                break;
                            } // case 18
                            case 26: {
                                name_ = input.readStringRequireUtf8();

                                break;
                            } // case 26
                            default: {
                                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                                    done = true; // was an endgroup tag
                                }
                                break;
                            } // default:
                        } // switch (tag)
                    } // while (!done)
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.unwrapIOException();
                } finally {
                    onChanged();
                } // finally
                return this;
            }

            private int id_;

            /**
             * <pre>
             * 自身属性
             * </pre>
             *
             * <code>int32 id = 1;</code>
             *
             * @return The id.
             */
            @java.lang.Override
            public int getId() {
                return id_;
            }

            /**
             * <pre>
             * 自身属性
             * </pre>
             *
             * <code>int32 id = 1;</code>
             *
             * @param value The id to set.
             * @return This builder for chaining.
             */
            public Builder setId(int value) {

                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <pre>
             * 自身属性
             * </pre>
             *
             * <code>int32 id = 1;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearId() {

                id_ = 0;
                onChanged();
                return this;
            }

            private java.lang.Object code_ = "";

            /**
             * <code>string code = 2;</code>
             *
             * @return The code.
             */
            @Override
            public java.lang.String getCode() {
                java.lang.Object ref = code_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    code_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string code = 2;</code>
             *
             * @return The bytes for code.
             */
            @Override
            public com.google.protobuf.ByteString
            getCodeBytes() {
                java.lang.Object ref = code_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    code_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string code = 2;</code>
             *
             * @param value The code to set.
             * @return This builder for chaining.
             */
            public Builder setCode(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                code_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string code = 2;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearCode() {

                code_ = getDefaultInstance().getCode();
                onChanged();
                return this;
            }

            /**
             * <code>string code = 2;</code>
             *
             * @param value The bytes for code to set.
             * @return This builder for chaining.
             */
            public Builder setCodeBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                code_ = value;
                onChanged();
                return this;
            }

            private java.lang.Object name_ = "";

            /**
             * <code>string name = 3;</code>
             *
             * @return The name.
             */
            @Override
            public java.lang.String getName() {
                java.lang.Object ref = name_;
                if (!(ref instanceof java.lang.String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    java.lang.String s = bs.toStringUtf8();
                    name_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>string name = 3;</code>
             *
             * @return The bytes for name.
             */
            @Override
            public com.google.protobuf.ByteString
            getNameBytes() {
                java.lang.Object ref = name_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    name_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>string name = 3;</code>
             *
             * @param value The name to set.
             * @return This builder for chaining.
             */
            public Builder setName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }

                name_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>string name = 3;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearName() {

                name_ = getDefaultInstance().getName();
                onChanged();
                return this;
            }

            /**
             * <code>string name = 3;</code>
             *
             * @param value The bytes for name to set.
             * @return This builder for chaining.
             */
            public Builder setNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                checkByteStringIsUtf8(value);

                name_ = value;
                onChanged();
                return this;
            }

            @java.lang.Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @java.lang.Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:com.wxw.notes.protobuf.proto.Demo)
        }

        // @@protoc_insertion_point(class_scope:com.wxw.notes.protobuf.proto.Demo)
        private static final DemoProto.Demo DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new DemoProto.Demo();
        }

        public static DemoProto.Demo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<Demo>
                PARSER = new com.google.protobuf.AbstractParser<Demo>() {
            @java.lang.Override
            public Demo parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                Builder builder = newBuilder();
                try {
                    builder.mergeFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    throw e.setUnfinishedMessage(builder.buildPartial());
                } catch (com.google.protobuf.UninitializedMessageException e) {
                    throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
                } catch (java.io.IOException e) {
                    throw new com.google.protobuf.InvalidProtocolBufferException(e)
                            .setUnfinishedMessage(builder.buildPartial());
                }
                return builder.buildPartial();
            }
        };

        public static com.google.protobuf.Parser<Demo> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<Demo> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public DemoProto.Demo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_com_wxw_notes_protobuf_proto_Demo_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_com_wxw_notes_protobuf_proto_Demo_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\ndemo.proto\022\034com.wxw.notes.protobuf.pro" +
                        "to\".\n\004Demo\022\n\n\002id\030\001 \001(\005\022\014\n\004code\030\002 \001(\t\022\014\n\004" +
                        "name\030\003 \001(\tB&\n\031com.linjingc.protobufdemoB" +
                        "\tDemoProtob\006proto3"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        });
        internal_static_com_wxw_notes_protobuf_proto_Demo_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_com_wxw_notes_protobuf_proto_Demo_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_com_wxw_notes_protobuf_proto_Demo_descriptor,
                new java.lang.String[]{"Id", "Code", "Name",});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
