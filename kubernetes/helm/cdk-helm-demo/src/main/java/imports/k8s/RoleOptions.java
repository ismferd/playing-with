package imports.k8s;

/**
 * Role is a namespaced, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:09.008Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.RoleOptions")
@software.amazon.jsii.Jsii.Proxy(RoleOptions.Jsii$Proxy.class)
public interface RoleOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Standard object's metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Rules holds all the PolicyRules for this Role.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.PolicyRule> getRules() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link RoleOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link RoleOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<RoleOptions> {
        private imports.k8s.ObjectMeta metadata;
        private java.util.List<imports.k8s.PolicyRule> rules;

        /**
         * Sets the value of {@link RoleOptions#getMetadata}
         * @param metadata Standard object's metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link RoleOptions#getRules}
         * @param rules Rules holds all the PolicyRules for this Role.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rules(java.util.List<? extends imports.k8s.PolicyRule> rules) {
            this.rules = (java.util.List<imports.k8s.PolicyRule>)rules;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link RoleOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public RoleOptions build() {
            return new Jsii$Proxy(metadata, rules);
        }
    }

    /**
     * An implementation for {@link RoleOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements RoleOptions {
        private final imports.k8s.ObjectMeta metadata;
        private final java.util.List<imports.k8s.PolicyRule> rules;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = this.jsiiGet("metadata", imports.k8s.ObjectMeta.class);
            this.rules = this.jsiiGet("rules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.PolicyRule.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        private Jsii$Proxy(final imports.k8s.ObjectMeta metadata, final java.util.List<? extends imports.k8s.PolicyRule> rules) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = metadata;
            this.rules = (java.util.List<imports.k8s.PolicyRule>)rules;
        }

        @Override
        public imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public java.util.List<imports.k8s.PolicyRule> getRules() {
            return this.rules;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getRules() != null) {
                data.set("rules", om.valueToTree(this.getRules()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.RoleOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            RoleOptions.Jsii$Proxy that = (RoleOptions.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.rules != null ? this.rules.equals(that.rules) : that.rules == null;
        }

        @Override
        public int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.rules != null ? this.rules.hashCode() : 0);
            return result;
        }
    }
}
