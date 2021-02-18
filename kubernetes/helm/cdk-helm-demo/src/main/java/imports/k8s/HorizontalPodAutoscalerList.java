package imports.k8s;

/**
 * list of horizontal pod autoscaler objects.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:08.903Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.HorizontalPodAutoscalerList")
public class HorizontalPodAutoscalerList extends org.cdk8s.ApiObject {

    protected HorizontalPodAutoscalerList(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected HorizontalPodAutoscalerList(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    /**
     * Defines a "io.k8s.api.autoscaling.v1.HorizontalPodAutoscalerList" API object.
     * <p>
     * @param scope the scope in which to define this object. This parameter is required.
     * @param name a scope-local name for the object. This parameter is required.
     * @param options configuration options. This parameter is required.
     */
    public HorizontalPodAutoscalerList(final @org.jetbrains.annotations.NotNull software.constructs.Construct scope, final @org.jetbrains.annotations.NotNull java.lang.String name, final @org.jetbrains.annotations.NotNull imports.k8s.HorizontalPodAutoscalerListOptions options) {
        super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
        software.amazon.jsii.JsiiEngine.getInstance().createNewObject(this, new Object[] { java.util.Objects.requireNonNull(scope, "scope is required"), java.util.Objects.requireNonNull(name, "name is required"), java.util.Objects.requireNonNull(options, "options is required") });
    }

    /**
     * A fluent builder for {@link imports.k8s.HorizontalPodAutoscalerList}.
     */
    public static final class Builder implements software.amazon.jsii.Builder<imports.k8s.HorizontalPodAutoscalerList> {
        /**
         * @return a new instance of {@link Builder}.
         * @param scope the scope in which to define this object. This parameter is required.
         * @param name a scope-local name for the object. This parameter is required.
         */
        public static Builder create(final software.constructs.Construct scope, final java.lang.String name) {
            return new Builder(scope, name);
        }

        private final software.constructs.Construct scope;
        private final java.lang.String name;
        private final imports.k8s.HorizontalPodAutoscalerListOptions.Builder options;

        private Builder(final software.constructs.Construct scope, final java.lang.String name) {
            this.scope = scope;
            this.name = name;
            this.options = new imports.k8s.HorizontalPodAutoscalerListOptions.Builder();
        }

        /**
         * list of horizontal pod autoscaler objects.
         * <p>
         * @return {@code this}
         * @param items list of horizontal pod autoscaler objects. This parameter is required.
         */
        public Builder items(final java.util.List<? extends imports.k8s.HorizontalPodAutoscaler> items) {
            this.options.items(items);
            return this;
        }

        /**
         * Standard list metadata.
         * <p>
         * @return {@code this}
         * @param metadata Standard list metadata. This parameter is required.
         */
        public Builder metadata(final imports.k8s.ListMeta metadata) {
            this.options.metadata(metadata);
            return this;
        }

        /**
         * @returns a newly built instance of {@link imports.k8s.HorizontalPodAutoscalerList}.
         */
        @Override
        public imports.k8s.HorizontalPodAutoscalerList build() {
            return new imports.k8s.HorizontalPodAutoscalerList(
                this.scope,
                this.name,
                this.options.build()
            );
        }
    }
}
