package imports.k8s;

/**
 * StatefulSet represents a set of pods with consistent identities.
 * <p>
 * Identities are defined as:
 * <p>
 * <ul>
 * <li>Network: A single stable DNS and hostname.</li>
 * <li>Storage: As many VolumeClaims as requested.
 * The StatefulSet guarantees that a given network identity will always map to the same storage identity.</li>
 * </ul>
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:09.035Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.StatefulSetOptions")
@software.amazon.jsii.Jsii.Proxy(StatefulSetOptions.Jsii$Proxy.class)
public interface StatefulSetOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Spec defines the desired identities of pods in this set.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.StatefulSetSpec getSpec() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link StatefulSetOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link StatefulSetOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<StatefulSetOptions> {
        private imports.k8s.ObjectMeta metadata;
        private imports.k8s.StatefulSetSpec spec;

        /**
         * Sets the value of {@link StatefulSetOptions#getMetadata}
         * @param metadata the value to be set.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link StatefulSetOptions#getSpec}
         * @param spec Spec defines the desired identities of pods in this set.
         * @return {@code this}
         */
        public Builder spec(imports.k8s.StatefulSetSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link StatefulSetOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public StatefulSetOptions build() {
            return new Jsii$Proxy(metadata, spec);
        }
    }

    /**
     * An implementation for {@link StatefulSetOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements StatefulSetOptions {
        private final imports.k8s.ObjectMeta metadata;
        private final imports.k8s.StatefulSetSpec spec;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = this.jsiiGet("metadata", imports.k8s.ObjectMeta.class);
            this.spec = this.jsiiGet("spec", imports.k8s.StatefulSetSpec.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final imports.k8s.ObjectMeta metadata, final imports.k8s.StatefulSetSpec spec) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = metadata;
            this.spec = spec;
        }

        @Override
        public imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public imports.k8s.StatefulSetSpec getSpec() {
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
            struct.set("fqn", om.valueToTree("k8s.StatefulSetOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StatefulSetOptions.Jsii$Proxy that = (StatefulSetOptions.Jsii$Proxy) o;

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
