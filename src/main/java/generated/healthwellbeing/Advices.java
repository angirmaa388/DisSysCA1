// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HealthWellBeing.proto

package generated.healthwellbeing;

/**
 * Protobuf type {@code HealthWellBeing.Advices}
 */
public final class Advices extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:HealthWellBeing.Advices)
    AdvicesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Advices.newBuilder() to construct.
  private Advices(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Advices() {
    newBornCare_ = "";
    vaccine_ = "";
    treatments_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Advices();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Advices(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            newBornCare_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            vaccine_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            treatments_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return generated.healthwellbeing.HealthWellBeingServiceImpl.internal_static_HealthWellBeing_Advices_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.healthwellbeing.HealthWellBeingServiceImpl.internal_static_HealthWellBeing_Advices_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.healthwellbeing.Advices.class, generated.healthwellbeing.Advices.Builder.class);
  }

  public static final int NEWBORNCARE_FIELD_NUMBER = 1;
  private volatile java.lang.Object newBornCare_;
  /**
   * <code>string newBornCare = 1;</code>
   * @return The newBornCare.
   */
  @java.lang.Override
  public java.lang.String getNewBornCare() {
    java.lang.Object ref = newBornCare_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newBornCare_ = s;
      return s;
    }
  }
  /**
   * <code>string newBornCare = 1;</code>
   * @return The bytes for newBornCare.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewBornCareBytes() {
    java.lang.Object ref = newBornCare_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newBornCare_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VACCINE_FIELD_NUMBER = 2;
  private volatile java.lang.Object vaccine_;
  /**
   * <code>string vaccine = 2;</code>
   * @return The vaccine.
   */
  @java.lang.Override
  public java.lang.String getVaccine() {
    java.lang.Object ref = vaccine_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vaccine_ = s;
      return s;
    }
  }
  /**
   * <code>string vaccine = 2;</code>
   * @return The bytes for vaccine.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getVaccineBytes() {
    java.lang.Object ref = vaccine_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      vaccine_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TREATMENTS_FIELD_NUMBER = 3;
  private volatile java.lang.Object treatments_;
  /**
   * <code>string treatments = 3;</code>
   * @return The treatments.
   */
  @java.lang.Override
  public java.lang.String getTreatments() {
    java.lang.Object ref = treatments_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      treatments_ = s;
      return s;
    }
  }
  /**
   * <code>string treatments = 3;</code>
   * @return The bytes for treatments.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTreatmentsBytes() {
    java.lang.Object ref = treatments_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      treatments_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newBornCare_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, newBornCare_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vaccine_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, vaccine_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(treatments_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, treatments_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newBornCare_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, newBornCare_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vaccine_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, vaccine_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(treatments_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, treatments_);
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
    if (!(obj instanceof generated.healthwellbeing.Advices)) {
      return super.equals(obj);
    }
    generated.healthwellbeing.Advices other = (generated.healthwellbeing.Advices) obj;

    if (!getNewBornCare()
        .equals(other.getNewBornCare())) return false;
    if (!getVaccine()
        .equals(other.getVaccine())) return false;
    if (!getTreatments()
        .equals(other.getTreatments())) return false;
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
    hash = (37 * hash) + NEWBORNCARE_FIELD_NUMBER;
    hash = (53 * hash) + getNewBornCare().hashCode();
    hash = (37 * hash) + VACCINE_FIELD_NUMBER;
    hash = (53 * hash) + getVaccine().hashCode();
    hash = (37 * hash) + TREATMENTS_FIELD_NUMBER;
    hash = (53 * hash) + getTreatments().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.healthwellbeing.Advices parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.healthwellbeing.Advices parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.healthwellbeing.Advices parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.healthwellbeing.Advices parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.healthwellbeing.Advices parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.healthwellbeing.Advices parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.healthwellbeing.Advices parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.healthwellbeing.Advices parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.healthwellbeing.Advices parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.healthwellbeing.Advices parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.healthwellbeing.Advices parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.healthwellbeing.Advices parseFrom(
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
  public static Builder newBuilder(generated.healthwellbeing.Advices prototype) {
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
   * Protobuf type {@code HealthWellBeing.Advices}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:HealthWellBeing.Advices)
      generated.healthwellbeing.AdvicesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.healthwellbeing.HealthWellBeingServiceImpl.internal_static_HealthWellBeing_Advices_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.healthwellbeing.HealthWellBeingServiceImpl.internal_static_HealthWellBeing_Advices_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.healthwellbeing.Advices.class, generated.healthwellbeing.Advices.Builder.class);
    }

    // Construct using generated.healthwellbeing.Advices.newBuilder()
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
      newBornCare_ = "";

      vaccine_ = "";

      treatments_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.healthwellbeing.HealthWellBeingServiceImpl.internal_static_HealthWellBeing_Advices_descriptor;
    }

    @java.lang.Override
    public generated.healthwellbeing.Advices getDefaultInstanceForType() {
      return generated.healthwellbeing.Advices.getDefaultInstance();
    }

    @java.lang.Override
    public generated.healthwellbeing.Advices build() {
      generated.healthwellbeing.Advices result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.healthwellbeing.Advices buildPartial() {
      generated.healthwellbeing.Advices result = new generated.healthwellbeing.Advices(this);
      result.newBornCare_ = newBornCare_;
      result.vaccine_ = vaccine_;
      result.treatments_ = treatments_;
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
      if (other instanceof generated.healthwellbeing.Advices) {
        return mergeFrom((generated.healthwellbeing.Advices)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.healthwellbeing.Advices other) {
      if (other == generated.healthwellbeing.Advices.getDefaultInstance()) return this;
      if (!other.getNewBornCare().isEmpty()) {
        newBornCare_ = other.newBornCare_;
        onChanged();
      }
      if (!other.getVaccine().isEmpty()) {
        vaccine_ = other.vaccine_;
        onChanged();
      }
      if (!other.getTreatments().isEmpty()) {
        treatments_ = other.treatments_;
        onChanged();
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
      generated.healthwellbeing.Advices parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.healthwellbeing.Advices) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object newBornCare_ = "";
    /**
     * <code>string newBornCare = 1;</code>
     * @return The newBornCare.
     */
    public java.lang.String getNewBornCare() {
      java.lang.Object ref = newBornCare_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newBornCare_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string newBornCare = 1;</code>
     * @return The bytes for newBornCare.
     */
    public com.google.protobuf.ByteString
        getNewBornCareBytes() {
      java.lang.Object ref = newBornCare_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newBornCare_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string newBornCare = 1;</code>
     * @param value The newBornCare to set.
     * @return This builder for chaining.
     */
    public Builder setNewBornCare(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      newBornCare_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string newBornCare = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNewBornCare() {
      
      newBornCare_ = getDefaultInstance().getNewBornCare();
      onChanged();
      return this;
    }
    /**
     * <code>string newBornCare = 1;</code>
     * @param value The bytes for newBornCare to set.
     * @return This builder for chaining.
     */
    public Builder setNewBornCareBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      newBornCare_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object vaccine_ = "";
    /**
     * <code>string vaccine = 2;</code>
     * @return The vaccine.
     */
    public java.lang.String getVaccine() {
      java.lang.Object ref = vaccine_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vaccine_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string vaccine = 2;</code>
     * @return The bytes for vaccine.
     */
    public com.google.protobuf.ByteString
        getVaccineBytes() {
      java.lang.Object ref = vaccine_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        vaccine_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string vaccine = 2;</code>
     * @param value The vaccine to set.
     * @return This builder for chaining.
     */
    public Builder setVaccine(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      vaccine_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string vaccine = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearVaccine() {
      
      vaccine_ = getDefaultInstance().getVaccine();
      onChanged();
      return this;
    }
    /**
     * <code>string vaccine = 2;</code>
     * @param value The bytes for vaccine to set.
     * @return This builder for chaining.
     */
    public Builder setVaccineBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      vaccine_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object treatments_ = "";
    /**
     * <code>string treatments = 3;</code>
     * @return The treatments.
     */
    public java.lang.String getTreatments() {
      java.lang.Object ref = treatments_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        treatments_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string treatments = 3;</code>
     * @return The bytes for treatments.
     */
    public com.google.protobuf.ByteString
        getTreatmentsBytes() {
      java.lang.Object ref = treatments_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        treatments_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string treatments = 3;</code>
     * @param value The treatments to set.
     * @return This builder for chaining.
     */
    public Builder setTreatments(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      treatments_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string treatments = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearTreatments() {
      
      treatments_ = getDefaultInstance().getTreatments();
      onChanged();
      return this;
    }
    /**
     * <code>string treatments = 3;</code>
     * @param value The bytes for treatments to set.
     * @return This builder for chaining.
     */
    public Builder setTreatmentsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      treatments_ = value;
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


    // @@protoc_insertion_point(builder_scope:HealthWellBeing.Advices)
  }

  // @@protoc_insertion_point(class_scope:HealthWellBeing.Advices)
  private static final generated.healthwellbeing.Advices DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.healthwellbeing.Advices();
  }

  public static generated.healthwellbeing.Advices getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Advices>
      PARSER = new com.google.protobuf.AbstractParser<Advices>() {
    @java.lang.Override
    public Advices parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Advices(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Advices> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Advices> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.healthwellbeing.Advices getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

