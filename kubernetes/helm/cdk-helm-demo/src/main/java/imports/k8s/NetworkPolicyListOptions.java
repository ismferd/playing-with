package imports.k8s;

/**
 * NetworkPolicyList is a list of NetworkPolicy objects.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:08.941Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.NetworkPolicyListOptions")
@software.amazon.jsii.Jsii.Proxy(NetworkPolicyListOptions.Jsii$Proxy.class)
public interface NetworkPolicyListOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Items is a list of schema objects.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.NetworkPolicy> getItems();

    /**
     * Standard list metadata.
     * <p>
     * More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ListMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link NetworkPolicyListOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link NetworkPolicyListOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<NetworkPolicyListOptions> {
        private java.util.List<imports.k8s.NetworkPolicy> items;
        private imports.k8s.ListMeta metadata;

        /**
         * Sets the value of {@link NetworkPolicyListOptions#getItems}
         * @param items Items is a list of schema objects. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder items(java.util.List<? extends imports.k8s.NetworkPolicy> items) {
            this.items = (java.util.List<imports.k8s.NetworkPolicy>)items;
            return this;
        }

        /**
         * Sets the value of {@link NetworkPolicyListOptions#getMetadata}
         * @param metadata Standard list metadata.
         *                 More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ListMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link NetworkPolicyListOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public NetworkPolicyListOptions build() {
            return new Jsii$Proxy(items, metadata);
        }
    }

    /**
     * An implementation for {@link NetworkPolicyListOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements NetworkPolicyListOptions {
        private final java.util.List<imports.k8s.NetworkPolicy> items;
        private final imports.k8s.ListMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.items = this.jsiiGet("items", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.NetworkPolicy.class)));
            this.metadata = this.jsiiGet("metadata", imports.k8s.ListMeta.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        private Jsii$Proxy(final java.util.List<? extends imports.k8s.NetworkPolicy> items, final imports.k8s.ListMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.items = (java.util.List<imports.k8s.NetworkPolicy>)java.util.Objects.requireNonNull(items, "items is required");
            this.metadata = metadata;
        }

        @Override
        public java.util.List<imports.k8s.NetworkPolicy> getItems() {
            return this.items;
        }

        @Override
        public imports.k8s.ListMeta getMetadata() {
            return this.metadata;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("items", om.valueToTree(this.getItems()));
            if (this.getMetadata() != null) {
                data.set("metadata", om.valueToTree(this.getMetadata()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.NetworkPolicyListOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            NetworkPolicyListOptions.Jsii$Proxy that = (NetworkPolicyListOptions.Jsii$Proxy) o;

            if (!items.equals(that.items)) return false;
            return this.metadata != null ? this.metadata.equals(that.metadata) : that.metadata == null;
        }

        @Override
        public int hashCode() {
            int result = this.items.hashCode();
            result = 31 * result + (this.metadata != null ? this.metadata.hashCode() : 0);
            return result;
        }
    }
}
