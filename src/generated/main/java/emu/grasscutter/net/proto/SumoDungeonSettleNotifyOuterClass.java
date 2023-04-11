// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SumoDungeonSettleNotify.proto

package emu.grasscutter.net.proto;

public final class SumoDungeonSettleNotifyOuterClass {
  private SumoDungeonSettleNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SumoDungeonSettleNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SumoDungeonSettleNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 stage_id = 7;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>uint32 final_score = 6;</code>
     * @return The finalScore.
     */
    int getFinalScore();

    /**
     * <code>uint32 LFMGDDMJGIP = 3;</code>
     * @return The lFMGDDMJGIP.
     */
    int getLFMGDDMJGIP();

    /**
     * <code>uint32 DNCGDPEOCHL = 14;</code>
     * @return The dNCGDPEOCHL.
     */
    int getDNCGDPEOCHL();

    /**
     * <code>bool is_new_record = 12;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 difficulty_id = 11;</code>
     * @return The difficultyId.
     */
    int getDifficultyId();
  }
  /**
   * <pre>
   * Name: DBDANFEPCMO
   * CmdId: 8665
   * </pre>
   *
   * Protobuf type {@code SumoDungeonSettleNotify}
   */
  public static final class SumoDungeonSettleNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SumoDungeonSettleNotify)
      SumoDungeonSettleNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SumoDungeonSettleNotify.newBuilder() to construct.
    private SumoDungeonSettleNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SumoDungeonSettleNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SumoDungeonSettleNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SumoDungeonSettleNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 24: {

              lFMGDDMJGIP_ = input.readUInt32();
              break;
            }
            case 48: {

              finalScore_ = input.readUInt32();
              break;
            }
            case 56: {

              stageId_ = input.readUInt32();
              break;
            }
            case 88: {

              difficultyId_ = input.readUInt32();
              break;
            }
            case 96: {

              isNewRecord_ = input.readBool();
              break;
            }
            case 112: {

              dNCGDPEOCHL_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.internal_static_SumoDungeonSettleNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.internal_static_SumoDungeonSettleNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify.class, emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify.Builder.class);
    }

    public static final int STAGE_ID_FIELD_NUMBER = 7;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 7;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int FINAL_SCORE_FIELD_NUMBER = 6;
    private int finalScore_;
    /**
     * <code>uint32 final_score = 6;</code>
     * @return The finalScore.
     */
    @java.lang.Override
    public int getFinalScore() {
      return finalScore_;
    }

    public static final int LFMGDDMJGIP_FIELD_NUMBER = 3;
    private int lFMGDDMJGIP_;
    /**
     * <code>uint32 LFMGDDMJGIP = 3;</code>
     * @return The lFMGDDMJGIP.
     */
    @java.lang.Override
    public int getLFMGDDMJGIP() {
      return lFMGDDMJGIP_;
    }

    public static final int DNCGDPEOCHL_FIELD_NUMBER = 14;
    private int dNCGDPEOCHL_;
    /**
     * <code>uint32 DNCGDPEOCHL = 14;</code>
     * @return The dNCGDPEOCHL.
     */
    @java.lang.Override
    public int getDNCGDPEOCHL() {
      return dNCGDPEOCHL_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 12;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 12;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int DIFFICULTY_ID_FIELD_NUMBER = 11;
    private int difficultyId_;
    /**
     * <code>uint32 difficulty_id = 11;</code>
     * @return The difficultyId.
     */
    @java.lang.Override
    public int getDifficultyId() {
      return difficultyId_;
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
      if (lFMGDDMJGIP_ != 0) {
        output.writeUInt32(3, lFMGDDMJGIP_);
      }
      if (finalScore_ != 0) {
        output.writeUInt32(6, finalScore_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(7, stageId_);
      }
      if (difficultyId_ != 0) {
        output.writeUInt32(11, difficultyId_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(12, isNewRecord_);
      }
      if (dNCGDPEOCHL_ != 0) {
        output.writeUInt32(14, dNCGDPEOCHL_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lFMGDDMJGIP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, lFMGDDMJGIP_);
      }
      if (finalScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, finalScore_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, stageId_);
      }
      if (difficultyId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, difficultyId_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isNewRecord_);
      }
      if (dNCGDPEOCHL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, dNCGDPEOCHL_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify other = (emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify) obj;

      if (getStageId()
          != other.getStageId()) return false;
      if (getFinalScore()
          != other.getFinalScore()) return false;
      if (getLFMGDDMJGIP()
          != other.getLFMGDDMJGIP()) return false;
      if (getDNCGDPEOCHL()
          != other.getDNCGDPEOCHL()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getDifficultyId()
          != other.getDifficultyId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      hash = (37 * hash) + FINAL_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getFinalScore();
      hash = (37 * hash) + LFMGDDMJGIP_FIELD_NUMBER;
      hash = (53 * hash) + getLFMGDDMJGIP();
      hash = (37 * hash) + DNCGDPEOCHL_FIELD_NUMBER;
      hash = (53 * hash) + getDNCGDPEOCHL();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + DIFFICULTY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDifficultyId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify prototype) {
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
     * <pre>
     * Name: DBDANFEPCMO
     * CmdId: 8665
     * </pre>
     *
     * Protobuf type {@code SumoDungeonSettleNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SumoDungeonSettleNotify)
        emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.internal_static_SumoDungeonSettleNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.internal_static_SumoDungeonSettleNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify.class, emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        stageId_ = 0;

        finalScore_ = 0;

        lFMGDDMJGIP_ = 0;

        dNCGDPEOCHL_ = 0;

        isNewRecord_ = false;

        difficultyId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.internal_static_SumoDungeonSettleNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify build() {
        emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify buildPartial() {
        emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify result = new emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify(this);
        result.stageId_ = stageId_;
        result.finalScore_ = finalScore_;
        result.lFMGDDMJGIP_ = lFMGDDMJGIP_;
        result.dNCGDPEOCHL_ = dNCGDPEOCHL_;
        result.isNewRecord_ = isNewRecord_;
        result.difficultyId_ = difficultyId_;
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
        if (other instanceof emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify) {
          return mergeFrom((emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify other) {
        if (other == emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify.getDefaultInstance()) return this;
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (other.getFinalScore() != 0) {
          setFinalScore(other.getFinalScore());
        }
        if (other.getLFMGDDMJGIP() != 0) {
          setLFMGDDMJGIP(other.getLFMGDDMJGIP());
        }
        if (other.getDNCGDPEOCHL() != 0) {
          setDNCGDPEOCHL(other.getDNCGDPEOCHL());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getDifficultyId() != 0) {
          setDifficultyId(other.getDifficultyId());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 7;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 7;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private int finalScore_ ;
      /**
       * <code>uint32 final_score = 6;</code>
       * @return The finalScore.
       */
      @java.lang.Override
      public int getFinalScore() {
        return finalScore_;
      }
      /**
       * <code>uint32 final_score = 6;</code>
       * @param value The finalScore to set.
       * @return This builder for chaining.
       */
      public Builder setFinalScore(int value) {
        
        finalScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 final_score = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinalScore() {
        
        finalScore_ = 0;
        onChanged();
        return this;
      }

      private int lFMGDDMJGIP_ ;
      /**
       * <code>uint32 LFMGDDMJGIP = 3;</code>
       * @return The lFMGDDMJGIP.
       */
      @java.lang.Override
      public int getLFMGDDMJGIP() {
        return lFMGDDMJGIP_;
      }
      /**
       * <code>uint32 LFMGDDMJGIP = 3;</code>
       * @param value The lFMGDDMJGIP to set.
       * @return This builder for chaining.
       */
      public Builder setLFMGDDMJGIP(int value) {
        
        lFMGDDMJGIP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LFMGDDMJGIP = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLFMGDDMJGIP() {
        
        lFMGDDMJGIP_ = 0;
        onChanged();
        return this;
      }

      private int dNCGDPEOCHL_ ;
      /**
       * <code>uint32 DNCGDPEOCHL = 14;</code>
       * @return The dNCGDPEOCHL.
       */
      @java.lang.Override
      public int getDNCGDPEOCHL() {
        return dNCGDPEOCHL_;
      }
      /**
       * <code>uint32 DNCGDPEOCHL = 14;</code>
       * @param value The dNCGDPEOCHL to set.
       * @return This builder for chaining.
       */
      public Builder setDNCGDPEOCHL(int value) {
        
        dNCGDPEOCHL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DNCGDPEOCHL = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearDNCGDPEOCHL() {
        
        dNCGDPEOCHL_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 12;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 12;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int difficultyId_ ;
      /**
       * <code>uint32 difficulty_id = 11;</code>
       * @return The difficultyId.
       */
      @java.lang.Override
      public int getDifficultyId() {
        return difficultyId_;
      }
      /**
       * <code>uint32 difficulty_id = 11;</code>
       * @param value The difficultyId to set.
       * @return This builder for chaining.
       */
      public Builder setDifficultyId(int value) {
        
        difficultyId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficultyId() {
        
        difficultyId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SumoDungeonSettleNotify)
    }

    // @@protoc_insertion_point(class_scope:SumoDungeonSettleNotify)
    private static final emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify();
    }

    public static emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SumoDungeonSettleNotify>
        PARSER = new com.google.protobuf.AbstractParser<SumoDungeonSettleNotify>() {
      @java.lang.Override
      public SumoDungeonSettleNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SumoDungeonSettleNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SumoDungeonSettleNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SumoDungeonSettleNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SumoDungeonSettleNotifyOuterClass.SumoDungeonSettleNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SumoDungeonSettleNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SumoDungeonSettleNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035SumoDungeonSettleNotify.proto\"\230\001\n\027Sumo" +
      "DungeonSettleNotify\022\020\n\010stage_id\030\007 \001(\r\022\023\n" +
      "\013final_score\030\006 \001(\r\022\023\n\013LFMGDDMJGIP\030\003 \001(\r\022" +
      "\023\n\013DNCGDPEOCHL\030\016 \001(\r\022\025\n\ris_new_record\030\014 " +
      "\001(\010\022\025\n\rdifficulty_id\030\013 \001(\rB\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SumoDungeonSettleNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SumoDungeonSettleNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SumoDungeonSettleNotify_descriptor,
        new java.lang.String[] { "StageId", "FinalScore", "LFMGDDMJGIP", "DNCGDPEOCHL", "IsNewRecord", "DifficultyId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}