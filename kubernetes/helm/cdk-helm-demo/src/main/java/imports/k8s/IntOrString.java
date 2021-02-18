package imports.k8s;

/**
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:08.913Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.IntOrString")
public class IntOrString extends software.amazon.jsii.JsiiObject {

    protected IntOrString(final software.amazon.jsii.JsiiObjectRef objRef) {
        super(objRef);
    }

    protected IntOrString(final software.amazon.jsii.JsiiObject.InitializationMode initializationMode) {
        super(initializationMode);
    }

    public static @org.jetbrains.annotations.NotNull imports.k8s.IntOrString fromNumber(final @org.jetbrains.annotations.NotNull java.lang.Number value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.IntOrString.class, "fromNumber", imports.k8s.IntOrString.class, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }

    public static @org.jetbrains.annotations.NotNull imports.k8s.IntOrString fromString(final @org.jetbrains.annotations.NotNull java.lang.String value) {
        return software.amazon.jsii.JsiiObject.jsiiStaticCall(imports.k8s.IntOrString.class, "fromString", imports.k8s.IntOrString.class, new Object[] { java.util.Objects.requireNonNull(value, "value is required") });
    }
}
