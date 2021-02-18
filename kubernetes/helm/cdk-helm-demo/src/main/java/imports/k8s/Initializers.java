package imports.k8s;

/**
 * Initializers tracks the progress of initialization.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:08.913Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.Initializers")
@software.amazon.jsii.Jsii.Proxy(Initializers.Jsii$Proxy.class)
public interface Initializers extends software.amazon.jsii.JsiiSerializable {

    /**
     * Pending is a list of initializers that must execute in order before this object is visible.
     * <p>
     * When the last pending initializer is removed, and no failing result is set, the initializers struct will be set to nil and the object is considered as initialized and visible to all clients.
     */
    @org.jetbrains.annotations.NotNull java.util.List<imports.k8s.Initializer> getPending();

    /**
     * If result is set with the Failure field, the object will be persisted to storage and then deleted, ensuring that other clients can observe the deletion.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.Status getResult() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link Initializers}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link Initializers}
     */
    public static final class Builder implements software.amazon.jsii.Builder<Initializers> {
        private java.util.List<imports.k8s.Initializer> pending;
        private imports.k8s.Status result;

        /**
         * Sets the value of {@link Initializers#getPending}
         * @param pending Pending is a list of initializers that must execute in order before this object is visible. This parameter is required.
         *                When the last pending initializer is removed, and no failing result is set, the initializers struct will be set to nil and the object is considered as initialized and visible to all clients.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder pending(java.util.List<? extends imports.k8s.Initializer> pending) {
            this.pending = (java.util.List<imports.k8s.Initializer>)pending;
            return this;
        }

        /**
         * Sets the value of {@link Initializers#getResult}
         * @param result If result is set with the Failure field, the object will be persisted to storage and then deleted, ensuring that other clients can observe the deletion.
         * @return {@code this}
         */
        public Builder result(imports.k8s.Status result) {
            this.result = result;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link Initializers}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public Initializers build() {
            return new Jsii$Proxy(pending, result);
        }
    }

    /**
     * An implementation for {@link Initializers}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements Initializers {
        private final java.util.List<imports.k8s.Initializer> pending;
        private final imports.k8s.Status result;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.pending = this.jsiiGet("pending", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.Initializer.class)));
            this.result = this.jsiiGet("result", imports.k8s.Status.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        private Jsii$Proxy(final java.util.List<? extends imports.k8s.Initializer> pending, final imports.k8s.Status result) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.pending = (java.util.List<imports.k8s.Initializer>)java.util.Objects.requireNonNull(pending, "pending is required");
            this.result = result;
        }

        @Override
        public java.util.List<imports.k8s.Initializer> getPending() {
            return this.pending;
        }

        @Override
        public imports.k8s.Status getResult() {
            return this.result;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("pending", om.valueToTree(this.getPending()));
            if (this.getResult() != null) {
                data.set("result", om.valueToTree(this.getResult()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.Initializers"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Initializers.Jsii$Proxy that = (Initializers.Jsii$Proxy) o;

            if (!pending.equals(that.pending)) return false;
            return this.result != null ? this.result.equals(that.result) : that.result == null;
        }

        @Override
        public int hashCode() {
            int result = this.pending.hashCode();
            result = 31 * result + (this.result != null ? this.result.hashCode() : 0);
            return result;
        }
    }
}
