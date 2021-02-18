package imports.k8s;

/**
 * PortworxVolumeSource represents a Portworx volume resource.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:08.990Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.PortworxVolumeSource")
@software.amazon.jsii.Jsii.Proxy(PortworxVolumeSource.Jsii$Proxy.class)
public interface PortworxVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * VolumeID uniquely identifies a Portworx volume.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getVolumeId();

    /**
     * FSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system.
     * <p>
     * Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFsType() {
        return null;
    }

    /**
     * Defaults to false (read/write).
     * <p>
     * ReadOnly here will force the ReadOnly setting in VolumeMounts.
     * <p>
     * Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link PortworxVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link PortworxVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<PortworxVolumeSource> {
        private java.lang.String volumeId;
        private java.lang.String fsType;
        private java.lang.Boolean readOnly;

        /**
         * Sets the value of {@link PortworxVolumeSource#getVolumeId}
         * @param volumeId VolumeID uniquely identifies a Portworx volume. This parameter is required.
         * @return {@code this}
         */
        public Builder volumeId(java.lang.String volumeId) {
            this.volumeId = volumeId;
            return this;
        }

        /**
         * Sets the value of {@link PortworxVolumeSource#getFsType}
         * @param fsType FSType represents the filesystem type to mount Must be a filesystem type supported by the host operating system.
         *               Ex. "ext4", "xfs". Implicitly inferred to be "ext4" if unspecified.
         * @return {@code this}
         */
        public Builder fsType(java.lang.String fsType) {
            this.fsType = fsType;
            return this;
        }

        /**
         * Sets the value of {@link PortworxVolumeSource#getReadOnly}
         * @param readOnly Defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts.
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link PortworxVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public PortworxVolumeSource build() {
            return new Jsii$Proxy(volumeId, fsType, readOnly);
        }
    }

    /**
     * An implementation for {@link PortworxVolumeSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements PortworxVolumeSource {
        private final java.lang.String volumeId;
        private final java.lang.String fsType;
        private final java.lang.Boolean readOnly;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.volumeId = this.jsiiGet("volumeID", java.lang.String.class);
            this.fsType = this.jsiiGet("fsType", java.lang.String.class);
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.lang.String volumeId, final java.lang.String fsType, final java.lang.Boolean readOnly) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.volumeId = java.util.Objects.requireNonNull(volumeId, "volumeId is required");
            this.fsType = fsType;
            this.readOnly = readOnly;
        }

        @Override
        public java.lang.String getVolumeId() {
            return this.volumeId;
        }

        @Override
        public java.lang.String getFsType() {
            return this.fsType;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("volumeID", om.valueToTree(this.getVolumeId()));
            if (this.getFsType() != null) {
                data.set("fsType", om.valueToTree(this.getFsType()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.PortworxVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            PortworxVolumeSource.Jsii$Proxy that = (PortworxVolumeSource.Jsii$Proxy) o;

            if (!volumeId.equals(that.volumeId)) return false;
            if (this.fsType != null ? !this.fsType.equals(that.fsType) : that.fsType != null) return false;
            return this.readOnly != null ? this.readOnly.equals(that.readOnly) : that.readOnly == null;
        }

        @Override
        public int hashCode() {
            int result = this.volumeId.hashCode();
            result = 31 * result + (this.fsType != null ? this.fsType.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            return result;
        }
    }
}
