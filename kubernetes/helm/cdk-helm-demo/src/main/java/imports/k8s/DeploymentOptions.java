package imports.k8s;

/**
 * Deployment enables declarative updates for Pods and ReplicaSets.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:08.885Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.DeploymentOptions")
@software.amazon.jsii.Jsii.Proxy(DeploymentOptions.Jsii$Proxy.class)
public interface DeploymentOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Standard object metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Specification of the desired behavior of the Deployment.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.DeploymentSpec getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DeploymentOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DeploymentOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DeploymentOptions> {
        private imports.k8s.ObjectMeta metadata;
        private imports.k8s.DeploymentSpec spec;

        /**
         * Sets the value of {@link DeploymentOptions#getMetadata}
         * @param metadata Standard object metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link DeploymentOptions#getSpec}
         * @param spec Specification of the desired behavior of the Deployment.
         * @return {@code this}
         */
        public Builder spec(imports.k8s.DeploymentSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DeploymentOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DeploymentOptions build() {
            return new Jsii$Proxy(metadata, spec);
        }
    }

    /**
     * An implementation for {@link DeploymentOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DeploymentOptions {
        private final imports.k8s.ObjectMeta metadata;
        private final imports.k8s.DeploymentSpec spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = this.jsiiGet("metadata", imports.k8s.ObjectMeta.class);
            this.spec = this.jsiiGet("spec", imports.k8s.DeploymentSpec.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final imports.k8s.ObjectMeta metadata, final imports.k8s.DeploymentSpec spec) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = metadata;
            this.spec = spec;
        }

        @Override
        public imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public imports.k8s.DeploymentSpec getSpec() {
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
            struct.set("fqn", om.valueToTree("k8s.DeploymentOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DeploymentOptions.Jsii$Proxy that = (DeploymentOptions.Jsii$Proxy) o;

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
