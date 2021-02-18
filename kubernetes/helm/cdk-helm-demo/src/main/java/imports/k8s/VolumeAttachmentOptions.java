package imports.k8s;

/**
 * VolumeAttachment captures the intent to attach or detach the specified volume to/from the specified node.
 * <p>
 * VolumeAttachment objects are non-namespaced.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:09.058Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.VolumeAttachmentOptions")
@software.amazon.jsii.Jsii.Proxy(VolumeAttachmentOptions.Jsii$Proxy.class)
public interface VolumeAttachmentOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Specification of the desired attach/detach volume behavior.
     * <p>
     * Populated by the Kubernetes system.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.VolumeAttachmentSpec getSpec();

    /**
     * Standard object metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link VolumeAttachmentOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link VolumeAttachmentOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<VolumeAttachmentOptions> {
        private imports.k8s.VolumeAttachmentSpec spec;
        private imports.k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link VolumeAttachmentOptions#getSpec}
         * @param spec Specification of the desired attach/detach volume behavior. This parameter is required.
         *             Populated by the Kubernetes system.
         * @return {@code this}
         */
        public Builder spec(imports.k8s.VolumeAttachmentSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Sets the value of {@link VolumeAttachmentOptions#getMetadata}
         * @param metadata Standard object metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link VolumeAttachmentOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public VolumeAttachmentOptions build() {
            return new Jsii$Proxy(spec, metadata);
        }
    }

    /**
     * An implementation for {@link VolumeAttachmentOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements VolumeAttachmentOptions {
        private final imports.k8s.VolumeAttachmentSpec spec;
        private final imports.k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.spec = this.jsiiGet("spec", imports.k8s.VolumeAttachmentSpec.class);
            this.metadata = this.jsiiGet("metadata", imports.k8s.ObjectMeta.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final imports.k8s.VolumeAttachmentSpec spec, final imports.k8s.ObjectMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.spec = java.util.Objects.requireNonNull(spec, "spec is required");
            this.metadata = metadata;
        }

        @Override
        public imports.k8s.VolumeAttachmentSpec getSpec() {
            return this.spec;
        }

        @Override
        public imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("spec", om.valueToTree(this.getSpec()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.VolumeAttachmentOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            VolumeAttachmentOptions.Jsii$Proxy that = (VolumeAttachmentOptions.Jsii$Proxy) o;

            if (!spec.equals(that.spec)) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public int hashCode() {
            int result = this.spec.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
