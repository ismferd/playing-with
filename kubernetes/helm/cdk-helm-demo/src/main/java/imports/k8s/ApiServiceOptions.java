package imports.k8s;

/**
 * APIService represents a server for a particular GroupVersion.
 * <p>
 * Name must be "version.group".
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:08.826Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ApiServiceOptions")
@software.amazon.jsii.Jsii.Proxy(ApiServiceOptions.Jsii$Proxy.class)
public interface ApiServiceOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Spec contains information for locating and communicating with a server.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ApiServiceSpec getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ApiServiceOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ApiServiceOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ApiServiceOptions> {
        private imports.k8s.ObjectMeta metadata;
        private imports.k8s.ApiServiceSpec spec;

        /**
         * Sets the value of {@link ApiServiceOptions#getMetadata}
         * @param metadata the value to be set.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link ApiServiceOptions#getSpec}
         * @param spec Spec contains information for locating and communicating with a server.
         * @return {@code this}
         */
        public Builder spec(imports.k8s.ApiServiceSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ApiServiceOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ApiServiceOptions build() {
            return new Jsii$Proxy(metadata, spec);
        }
    }

    /**
     * An implementation for {@link ApiServiceOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ApiServiceOptions {
        private final imports.k8s.ObjectMeta metadata;
        private final imports.k8s.ApiServiceSpec spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = this.jsiiGet("metadata", imports.k8s.ObjectMeta.class);
            this.spec = this.jsiiGet("spec", imports.k8s.ApiServiceSpec.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final imports.k8s.ObjectMeta metadata, final imports.k8s.ApiServiceSpec spec) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = metadata;
            this.spec = spec;
        }

        @Override
        public imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public imports.k8s.ApiServiceSpec getSpec() {
            return this.spec;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getSpec() != null) {
                data.set("spec", om.valueToTree(this.getSpec()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ApiServiceOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ApiServiceOptions.Jsii$Proxy that = (ApiServiceOptions.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.spec != null ? this.spec.equals(that.spec) : that.spec == null;
        }

        @Override
        public int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.spec != null ? this.spec.hashCode() : 0);
            return result;
        }
    }
}
