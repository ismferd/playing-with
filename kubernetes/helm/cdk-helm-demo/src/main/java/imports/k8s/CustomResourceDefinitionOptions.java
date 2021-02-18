package imports.k8s;

/**
 * CustomResourceDefinition represents a resource that should be exposed on the API server.
 * <p>
 * Its name MUST be in the format &lt;.spec.name&gt;.&lt;.spec.group&gt;.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:08.876Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CustomResourceDefinitionOptions")
@software.amazon.jsii.Jsii.Proxy(CustomResourceDefinitionOptions.Jsii$Proxy.class)
public interface CustomResourceDefinitionOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Spec describes how the user wants the resources to appear.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.CustomResourceDefinitionSpec getSpec();

    /**
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CustomResourceDefinitionOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CustomResourceDefinitionOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CustomResourceDefinitionOptions> {
        private imports.k8s.CustomResourceDefinitionSpec spec;
        private imports.k8s.ObjectMeta metadata;

        /**
         * Sets the value of {@link CustomResourceDefinitionOptions#getSpec}
         * @param spec Spec describes how the user wants the resources to appear. This parameter is required.
         * @return {@code this}
         */
        public Builder spec(imports.k8s.CustomResourceDefinitionSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Sets the value of {@link CustomResourceDefinitionOptions#getMetadata}
         * @param metadata the value to be set.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CustomResourceDefinitionOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CustomResourceDefinitionOptions build() {
            return new Jsii$Proxy(spec, metadata);
        }
    }

    /**
     * An implementation for {@link CustomResourceDefinitionOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CustomResourceDefinitionOptions {
        private final imports.k8s.CustomResourceDefinitionSpec spec;
        private final imports.k8s.ObjectMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.spec = this.jsiiGet("spec", imports.k8s.CustomResourceDefinitionSpec.class);
            this.metadata = this.jsiiGet("metadata", imports.k8s.ObjectMeta.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final imports.k8s.CustomResourceDefinitionSpec spec, final imports.k8s.ObjectMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.spec = java.util.Objects.requireNonNull(spec, "spec is required");
            this.metadata = metadata;
        }

        @Override
        public imports.k8s.CustomResourceDefinitionSpec getSpec() {
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
            struct.set("fqn", om.valueToTree("k8s.CustomResourceDefinitionOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CustomResourceDefinitionOptions.Jsii$Proxy that = (CustomResourceDefinitionOptions.Jsii$Proxy) o;

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
