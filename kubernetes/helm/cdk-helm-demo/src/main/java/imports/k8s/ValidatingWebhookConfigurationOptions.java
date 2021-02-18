package imports.k8s;

/**
 * ValidatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and object without changing it.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:09.050Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ValidatingWebhookConfigurationOptions")
@software.amazon.jsii.Jsii.Proxy(ValidatingWebhookConfigurationOptions.Jsii$Proxy.class)
public interface ValidatingWebhookConfigurationOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Standard object metadata;
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ObjectMeta getMetadata() {
        return null;
    }

    /**
     * Webhooks is a list of webhooks and the affected resources and operations.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.ValidatingWebhook> getWebhooks() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ValidatingWebhookConfigurationOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ValidatingWebhookConfigurationOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ValidatingWebhookConfigurationOptions> {
        private imports.k8s.ObjectMeta metadata;
        private java.util.List<imports.k8s.ValidatingWebhook> webhooks;

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationOptions#getMetadata}
         * @param metadata Standard object metadata;.
         *                 More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ObjectMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Sets the value of {@link ValidatingWebhookConfigurationOptions#getWebhooks}
         * @param webhooks Webhooks is a list of webhooks and the affected resources and operations.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder webhooks(java.util.List<? extends imports.k8s.ValidatingWebhook> webhooks) {
            this.webhooks = (java.util.List<imports.k8s.ValidatingWebhook>)webhooks;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ValidatingWebhookConfigurationOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ValidatingWebhookConfigurationOptions build() {
            return new Jsii$Proxy(metadata, webhooks);
        }
    }

    /**
     * An implementation for {@link ValidatingWebhookConfigurationOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ValidatingWebhookConfigurationOptions {
        private final imports.k8s.ObjectMeta metadata;
        private final java.util.List<imports.k8s.ValidatingWebhook> webhooks;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.metadata = this.jsiiGet("metadata", imports.k8s.ObjectMeta.class);
            this.webhooks = this.jsiiGet("webhooks", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.ValidatingWebhook.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        private Jsii$Proxy(final imports.k8s.ObjectMeta metadata, final java.util.List<? extends imports.k8s.ValidatingWebhook> webhooks) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.metadata = metadata;
            this.webhooks = (java.util.List<imports.k8s.ValidatingWebhook>)webhooks;
        }

        @Override
        public imports.k8s.ObjectMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public java.util.List<imports.k8s.ValidatingWebhook> getWebhooks() {
            return this.webhooks;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }
            if (this.getWebhooks() != null) {
                data.set("webhooks", om.valueToTree(this.getWebhooks()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.ValidatingWebhookConfigurationOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ValidatingWebhookConfigurationOptions.Jsii$Proxy that = (ValidatingWebhookConfigurationOptions.Jsii$Proxy) o;

            if (this.metadata != null ? !this.metadata.equals(that.metadata) : that.metadata != null) return false;
            return this.webhooks != null ? this.webhooks.equals(that.webhooks) : that.webhooks == null;
        }

        @Override
        public int hashCode() {
            int result = this.metadata != null ? this.metadata.hashCode() : 0;
            result = 31 * result + (this.webhooks != null ? this.webhooks.hashCode() : 0);
            return result;
        }
    }
}
