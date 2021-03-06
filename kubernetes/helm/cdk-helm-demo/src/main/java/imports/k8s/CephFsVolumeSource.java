package imports.k8s;

/**
 * Represents a Ceph Filesystem mount that lasts the lifetime of a pod Cephfs volumes do not support ownership management or SELinux relabeling.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:08.835Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.CephFsVolumeSource")
@software.amazon.jsii.Jsii.Proxy(CephFsVolumeSource.Jsii$Proxy.class)
public interface CephFsVolumeSource extends software.amazon.jsii.JsiiSerializable {

    /**
     * Required: Monitors is a collection of Ceph monitors More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
     */
    @org.jetbrains.annotations.NotNull java.util.List<java.lang.String> getMonitors();

    /**
     * Optional: Used as the mounted root, rather than the full Ceph tree, default is /.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getPath() {
        return null;
    }

    /**
     * Optional: Defaults to false (read/write).
     * <p>
     * ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
     * <p>
     * Default: false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable java.lang.Boolean getReadOnly() {
        return null;
    }

    /**
     * Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSecretFile() {
        return null;
    }

    /**
     * Optional: SecretRef is reference to the authentication secret for User, default is empty.
     * <p>
     * More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LocalObjectReference getSecretRef() {
        return null;
    }

    /**
     * Optional: User is the rados user name, default is admin More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getUser() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link CephFsVolumeSource}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link CephFsVolumeSource}
     */
    public static final class Builder implements software.amazon.jsii.Builder<CephFsVolumeSource> {
        private java.util.List<java.lang.String> monitors;
        private java.lang.String path;
        private java.lang.Boolean readOnly;
        private java.lang.String secretFile;
        private imports.k8s.LocalObjectReference secretRef;
        private java.lang.String user;

        /**
         * Sets the value of {@link CephFsVolumeSource#getMonitors}
         * @param monitors Required: Monitors is a collection of Ceph monitors More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it. This parameter is required.
         * @return {@code this}
         */
        public Builder monitors(java.util.List<java.lang.String> monitors) {
            this.monitors = monitors;
            return this;
        }

        /**
         * Sets the value of {@link CephFsVolumeSource#getPath}
         * @param path Optional: Used as the mounted root, rather than the full Ceph tree, default is /.
         * @return {@code this}
         */
        public Builder path(java.lang.String path) {
            this.path = path;
            return this;
        }

        /**
         * Sets the value of {@link CephFsVolumeSource#getReadOnly}
         * @param readOnly Optional: Defaults to false (read/write).
         *                 ReadOnly here will force the ReadOnly setting in VolumeMounts. More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder readOnly(java.lang.Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        /**
         * Sets the value of {@link CephFsVolumeSource#getSecretFile}
         * @param secretFile Optional: SecretFile is the path to key ring for User, default is /etc/ceph/user.secret More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
         * @return {@code this}
         */
        public Builder secretFile(java.lang.String secretFile) {
            this.secretFile = secretFile;
            return this;
        }

        /**
         * Sets the value of {@link CephFsVolumeSource#getSecretRef}
         * @param secretRef Optional: SecretRef is reference to the authentication secret for User, default is empty.
         *                  More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it
         * @return {@code this}
         */
        public Builder secretRef(imports.k8s.LocalObjectReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        /**
         * Sets the value of {@link CephFsVolumeSource#getUser}
         * @param user Optional: User is the rados user name, default is admin More info: https://releases.k8s.io/HEAD/examples/volumes/cephfs/README.md#how-to-use-it.
         * @return {@code this}
         */
        public Builder user(java.lang.String user) {
            this.user = user;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link CephFsVolumeSource}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public CephFsVolumeSource build() {
            return new Jsii$Proxy(monitors, path, readOnly, secretFile, secretRef, user);
        }
    }

    /**
     * An implementation for {@link CephFsVolumeSource}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements CephFsVolumeSource {
        private final java.util.List<java.lang.String> monitors;
        private final java.lang.String path;
        private final java.lang.Boolean readOnly;
        private final java.lang.String secretFile;
        private final imports.k8s.LocalObjectReference secretRef;
        private final java.lang.String user;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.monitors = this.jsiiGet("monitors", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.path = this.jsiiGet("path", java.lang.String.class);
            this.readOnly = this.jsiiGet("readOnly", java.lang.Boolean.class);
            this.secretFile = this.jsiiGet("secretFile", java.lang.String.class);
            this.secretRef = this.jsiiGet("secretRef", imports.k8s.LocalObjectReference.class);
            this.user = this.jsiiGet("user", java.lang.String.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        private Jsii$Proxy(final java.util.List<java.lang.String> monitors, final java.lang.String path, final java.lang.Boolean readOnly, final java.lang.String secretFile, final imports.k8s.LocalObjectReference secretRef, final java.lang.String user) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.monitors = java.util.Objects.requireNonNull(monitors, "monitors is required");
            this.path = path;
            this.readOnly = readOnly;
            this.secretFile = secretFile;
            this.secretRef = secretRef;
            this.user = user;
        }

        @Override
        public java.util.List<java.lang.String> getMonitors() {
            return this.monitors;
        }

        @Override
        public java.lang.String getPath() {
            return this.path;
        }

        @Override
        public java.lang.Boolean getReadOnly() {
            return this.readOnly;
        }

        @Override
        public java.lang.String getSecretFile() {
            return this.secretFile;
        }

        @Override
        public imports.k8s.LocalObjectReference getSecretRef() {
            return this.secretRef;
        }

        @Override
        public java.lang.String getUser() {
            return this.user;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("monitors", om.valueToTree(this.getMonitors()));
            if (this.getPath() != null) {
                data.set("path", om.valueToTree(this.getPath()));
            }
            if (this.getReadOnly() != null) {
                data.set("readOnly", om.valueToTree(this.getReadOnly()));
            }
            if (this.getSecretFile() != null) {
                data.set("secretFile", om.valueToTree(this.getSecretFile()));
            }
            if (this.getSecretRef() != null) {
                data.set("secretRef", om.valueToTree(this.getSecretRef()));
            }
            if (this.getUser() != null) {
                data.set("user", om.valueToTree(this.getUser()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.CephFsVolumeSource"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            CephFsVolumeSource.Jsii$Proxy that = (CephFsVolumeSource.Jsii$Proxy) o;

            if (!monitors.equals(that.monitors)) return false;
            if (this.path != null ? !this.path.equals(that.path) : that.path != null) return false;
            if (this.readOnly != null ? !this.readOnly.equals(that.readOnly) : that.readOnly != null) return false;
            if (this.secretFile != null ? !this.secretFile.equals(that.secretFile) : that.secretFile != null) return false;
            if (this.secretRef != null ? !this.secretRef.equals(that.secretRef) : that.secretRef != null) return false;
            return this.user != null ? this.user.equals(that.user) : that.user == null;
        }

        @Override
        public int hashCode() {
            int result = this.monitors.hashCode();
            result = 31 * result + (this.path != null ? this.path.hashCode() : 0);
            result = 31 * result + (this.readOnly != null ? this.readOnly.hashCode() : 0);
            result = 31 * result + (this.secretFile != null ? this.secretFile.hashCode() : 0);
            result = 31 * result + (this.secretRef != null ? this.secretRef.hashCode() : 0);
            result = 31 * result + (this.user != null ? this.user.hashCode() : 0);
            return result;
        }
    }
}
