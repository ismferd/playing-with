package imports.k8s;

/**
 * ConfigMapList is a resource containing a list of ConfigMap objects.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:08.848Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.ConfigMapListOptions")
@software.amazon.jsii.Jsii.Proxy(ConfigMapListOptions.Jsii$Proxy.class)
public interface ConfigMapListOptions extends software.amazon.jsii.JsiiSerializable {

    /**
     * Items is the list of ConfigMaps.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.ConfigMap> getItems();

    /**
     * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.ListMeta getMetadata() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link ConfigMapListOptions}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link ConfigMapListOptions}
     */
    public static final class Builder implements software.amazon.jsii.Builder<ConfigMapListOptions> {
        private java.util.List<imports.k8s.ConfigMap> items;
        private imports.k8s.ListMeta metadata;

        /**
         * Sets the value of {@link ConfigMapListOptions#getItems}
         * @param items Items is the list of ConfigMaps. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder items(java.util.List<? extends imports.k8s.ConfigMap> items) {
            this.items = (java.util.List<imports.k8s.ConfigMap>)items;
            return this;
        }

        /**
         * Sets the value of {@link ConfigMapListOptions#getMetadata}
         * @param metadata More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
         * @return {@code this}
         */
        public Builder metadata(imports.k8s.ListMeta metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link ConfigMapListOptions}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public ConfigMapListOptions build() {
            return new Jsii$Proxy(items, metadata);
        }
    }

    /**
     * An implementation for {@link ConfigMapListOptions}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements ConfigMapListOptions {
        private final java.util.List<imports.k8s.ConfigMap> items;
        private final imports.k8s.ListMeta metadata;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.items = this.jsiiGet("items", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.ConfigMap.class)));
            this.metadata = this.jsiiGet("metadata", imports.k8s.ListMeta.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        private Jsii$Proxy(final java.util.List<? extends imports.k8s.ConfigMap> items, final imports.k8s.ListMeta metadata) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.items = (java.util.List<imports.k8s.ConfigMap>)java.util.Objects.requireNonNull(items, "items is required");
            this.metadata = metadata;
        }

        @Override
        public java.util.List<imports.k8s.ConfigMap> getItems() {
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
            struct.set("fqn", om.valueToTree("k8s.ConfigMapListOptions"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ConfigMapListOptions.Jsii$Proxy that = (ConfigMapListOptions.Jsii$Proxy) o;

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
