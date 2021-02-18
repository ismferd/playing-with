package imports.k8s;

/**
 * Represents downward API info for projecting into a projected volume.
 * <p>
 * Note that this is identical to a downwardAPI volume source without the default mode.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:08.886Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.DownwardApiProjection")
@software.amazon.jsii.Jsii.Proxy(DownwardApiProjection.Jsii$Proxy.class)
public interface DownwardApiProjection extends software.amazon.jsii.JsiiSerializable {

    /**
     * Items is a list of DownwardAPIVolume file.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.DownwardApiVolumeFile> getItems() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link DownwardApiProjection}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link DownwardApiProjection}
     */
    public static final class Builder implements software.amazon.jsii.Builder<DownwardApiProjection> {
        private java.util.List<imports.k8s.DownwardApiVolumeFile> items;

        /**
         * Sets the value of {@link DownwardApiProjection#getItems}
         * @param items Items is a list of DownwardAPIVolume file.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder items(java.util.List<? extends imports.k8s.DownwardApiVolumeFile> items) {
            this.items = (java.util.List<imports.k8s.DownwardApiVolumeFile>)items;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link DownwardApiProjection}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public DownwardApiProjection build() {
            return new Jsii$Proxy(items);
        }
    }

    /**
     * An implementation for {@link DownwardApiProjection}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements DownwardApiProjection {
        private final java.util.List<imports.k8s.DownwardApiVolumeFile> items;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.items = this.jsiiGet("items", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.DownwardApiVolumeFile.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        private Jsii$Proxy(final java.util.List<? extends imports.k8s.DownwardApiVolumeFile> items) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.items = (java.util.List<imports.k8s.DownwardApiVolumeFile>)items;
        }

        @Override
        public java.util.List<imports.k8s.DownwardApiVolumeFile> getItems() {
            return this.items;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getItems() != null) {
                data.set("items", om.valueToTree(this.getItems()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.DownwardApiProjection"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            DownwardApiProjection.Jsii$Proxy that = (DownwardApiProjection.Jsii$Proxy) o;

            return this.items != null ? this.items.equals(that.items) : that.items == null;
        }

        @Override
        public int hashCode() {
            int result = this.items != null ? this.items.hashCode() : 0;
            return result;
        }
    }
}
