package imports.k8s;

/**
 * CustomResourceValidation is a list of validation methods for CustomResources.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:08.878Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CustomResourceValidation")
@software.amazon.jsii.Jsii.Proxy(CustomResourceValidation.Jsii$Proxy.class)
public interface CustomResourceValidation extends software.amazon.jsii.JsiiSerializable {

    /**
     * OpenAPIV3Schema is the OpenAPI v3 schema to be validated against.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.JsonSchemaProps getOpenApiv3Schema() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CustomResourceValidation}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CustomResourceValidation}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CustomResourceValidation> {
        private imports.k8s.JsonSchemaProps openApiv3Schema;

        /**
         * Sets the value of {@link CustomResourceValidation#getOpenApiv3Schema}
         * @param openApiv3Schema OpenAPIV3Schema is the OpenAPI v3 schema to be validated against.
         * @return {@code this}
         */
        public Builder openApiv3Schema(imports.k8s.JsonSchemaProps openApiv3Schema) {
            this.openApiv3Schema = openApiv3Schema;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CustomResourceValidation}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CustomResourceValidation build() {
            return new Jsii$Proxy(openApiv3Schema);
        }
    }

    /**
     * An implementation for {@link CustomResourceValidation}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CustomResourceValidation {
        private final imports.k8s.JsonSchemaProps openApiv3Schema;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.openApiv3Schema = this.jsiiGet("openAPIV3Schema", imports.k8s.JsonSchemaProps.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final imports.k8s.JsonSchemaProps openApiv3Schema) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.openApiv3Schema = openApiv3Schema;
        }

        @Override
        public imports.k8s.JsonSchemaProps getOpenApiv3Schema() {
            return this.openApiv3Schema;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            if (this.getOpenApiv3Schema() != null) {
                data.set("openAPIV3Schema", om.valueToTree(this.getOpenApiv3Schema()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CustomResourceValidation"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CustomResourceValidation.Jsii$Proxy that = (CustomResourceValidation.Jsii$Proxy) o;

            return this.openApiv3Schema != null ? this.openApiv3Schema.equals(that.openApiv3Schema) : that.openApiv3Schema == null;
        }

        @Override
        public int hashCode() {
            int result = this.openApiv3Schema != null ? this.openApiv3Schema.hashCode() : 0;
            return result;
        }
    }
}
