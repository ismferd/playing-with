package imports.k8s;

/**
 * HTTPIngressPath associates a path regex with a backend.
 * <p>
 * Incoming urls matching the path are forwarded to the backend.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:08.909Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.HttpIngressPath")
@software.amazon.jsii.Jsii.Proxy(HttpIngressPath.Jsii$Proxy.class)
public interface HttpIngressPath extends software.amazon.jsii.JsiiSerializable {

    /**
     * Backend defines the referenced service endpoint to which the traffic will be forwarded to.
     */
    @org.jetbrains.annotations.NotNull imports.k8s.IngressBackend getBackend();

    /**
     * Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'. If unspecified, the path defaults to a catch all sending traffic to the backend.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link HttpIngressPath}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link HttpIngressPath}
     */
    public static final class Builder implements software.amazon.jsii.Builder<HttpIngressPath> {
        private imports.k8s.IngressBackend backend;
        private java.lang.String path;

        /**
         * Sets the value of {@link HttpIngressPath#getBackend}
         * @param backend Backend defines the referenced service endpoint to which the traffic will be forwarded to. This parameter is required.
         * @return {@code this}
         */
        public Builder backend(imports.k8s.IngressBackend backend) {
            this.backend = backend;
            return this;
        }

        /**
         * Sets the value of {@link HttpIngressPath#getPath}
         * @param path Path is an extended POSIX regex as defined by IEEE Std 1003.1, (i.e this follows the egrep/unix syntax, not the perl syntax) matched against the path of an incoming request. Currently it can contain characters disallowed from the conventional "path" part of a URL as defined by RFC 3986. Paths must begin with a '/'. If unspecified, the path defaults to a catch all sending traffic to the backend.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link HttpIngressPath}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public HttpIngressPath build() {
            return new Jsii$Proxy(backend, path);
        }
    }

    /**
     * An implementation for {@link HttpIngressPath}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements HttpIngressPath {
        private final imports.k8s.IngressBackend backend;
        private final java.lang.String path;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.backend = this.jsiiGet("backend", imports.k8s.IngressBackend.class);
            this.path = this.jsiiGet("path", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final imports.k8s.IngressBackend backend, final java.lang.String path) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.backend = java.util.Objects.requireNonNull(backend, "backend is required");
            this.path = path;
        }

        @Override
        public imports.k8s.IngressBackend getBackend() {
            return this.backend;
        }

        @Override
        public java.lang.String getPath() {
            return this.path;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("backend", om.valueToTree(this.getBackend()));
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.HttpIngressPath"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            HttpIngressPath.Jsii$Proxy that = (HttpIngressPath.Jsii$Proxy) o;

            if (!backend.equals(that.backend)) return false;
            return this.path != null ? this.path.equals(that.path) : that.path == null;
        }

        @Override
        public int hashCode() {
            int result = this.backend.hashCode();
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            return result;
        }
    }
}
