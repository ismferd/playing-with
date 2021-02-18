package imports.k8s;

/**
 * LimitRangeSpec defines a min/max usage limit for resources that match on kind.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:08.929Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.LimitRangeSpec")
@software.amazon.jsii.Jsii.Proxy(LimitRangeSpec.Jsii$Proxy.class)
public interface LimitRangeSpec extends software.amazon.jsii.JsiiSerializable {

    /**
     * Limits is the list of LimitRangeItem objects that are enforced.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.LimitRangeItem> getLimits();

    /**
     * @return a {@link Builder} of {@link LimitRangeSpec}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link LimitRangeSpec}
     */
    public static final class Builder implements software.amazon.jsii.Builder<LimitRangeSpec> {
        private java.util.List<imports.k8s.LimitRangeItem> limits;

        /**
         * Sets the value of {@link LimitRangeSpec#getLimits}
         * @param limits Limits is the list of LimitRangeItem objects that are enforced. This parameter is required.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder limits(java.util.List<? extends imports.k8s.LimitRangeItem> limits) {
            this.limits = (java.util.List<imports.k8s.LimitRangeItem>)limits;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link LimitRangeSpec}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public LimitRangeSpec build() {
            return new Jsii$Proxy(limits);
        }
    }

    /**
     * An implementation for {@link LimitRangeSpec}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements LimitRangeSpec {
        private final java.util.List<imports.k8s.LimitRangeItem> limits;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.limits = this.jsiiGet("limits", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.LimitRangeItem.class)));
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        private Jsii$Proxy(final java.util.List<? extends imports.k8s.LimitRangeItem> limits) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.limits = (java.util.List<imports.k8s.LimitRangeItem>)java.util.Objects.requireNonNull(limits, "limits is required");
        }

        @Override
        public java.util.List<imports.k8s.LimitRangeItem> getLimits() {
            return this.limits;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("limits", om.valueToTree(this.getLimits()));

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.LimitRangeSpec"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            LimitRangeSpec.Jsii$Proxy that = (LimitRangeSpec.Jsii$Proxy) o;

            return this.limits.equals(that.limits);
        }

        @Override
        public int hashCode() {
            int result = this.limits.hashCode();
            return result;
        }
    }
}