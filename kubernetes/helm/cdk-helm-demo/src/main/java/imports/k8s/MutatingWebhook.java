package imports.k8s;

/**
 * MutatingWebhook describes an admission webhook and the resources and operations it applies to.
 */
@javax.annotation.Generated(value = "jsii-pacmak/1.13.0 (build 385c325)", date = "2020-11-08T11:11:08.932Z")
@software.amazon.jsii.Jsii(module = imports.k8s.$Module.class, fqn = "k8s.MutatingWebhook")
@software.amazon.jsii.Jsii.Proxy(MutatingWebhook.Jsii$Proxy.class)
public interface MutatingWebhook extends software.amazon.jsii.JsiiSerializable {

    /**
     * ClientConfig defines how to communicate with the hook.
     * <p>
     * Required
     */
    @org.jetbrains.annotations.NotNull imports.k8s.WebhookClientConfig getClientConfig();

    /**
     * The name of the admission webhook.
     * <p>
     * Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
     */
    @org.jetbrains.annotations.NotNull java.lang.String getName();

    /**
     * AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects.
     * <p>
     * API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to <code>['v1beta1']</code>.
     * <p>
     * Default: v1beta1']`.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<java.lang.String> getAdmissionReviewVersions() {
        return null;
    }

    /**
     * FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail.
     * <p>
     * Defaults to Ignore.
     * <p>
     * Default: Ignore.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getFailurePolicy() {
        return null;
    }

    /**
     * matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
     * <p>
     * <ul>
     * <li>Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.</li>
     * <li>Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.</li>
     * </ul>
     * <p>
     * Defaults to "Exact"
     * <p>
     * Default: Exact"
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getMatchPolicy() {
        return null;
    }

    /**
     * NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector.
     * <p>
     * If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
     * <p>
     * For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
     * "matchExpressions": [
     * {
     * "key": "runlevel",
     * "operator": "NotIn",
     * "values": [
     * "0",
     * "1"
     * ]
     * }
     * ]
     * }
     * <p>
     * If instead you want to only run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
     * "matchExpressions": [
     * {
     * "key": "environment",
     * "operator": "In",
     * "values": [
     * "prod",
     * "staging"
     * ]
     * }
     * ]
     * }
     * <p>
     * See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.
     * <p>
     * Default to the empty LabelSelector, which matches everything.
     * <p>
     * Default: the empty LabelSelector, which matches everything.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getNamespaceSelector() {
        return null;
    }

    /**
     * ObjectSelector decides whether to run the webhook based on if the object has matching labels.
     * <p>
     * objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
     * <p>
     * Default: the empty LabelSelector, which matches everything.
     */
    default @org.jetbrains.annotations.Nullable imports.k8s.LabelSelector getObjectSelector() {
        return null;
    }

    /**
     * reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation.
     * <p>
     * Allowed values are "Never" and "IfNeeded".
     * <p>
     * Never: the webhook will not be called more than once in a single admission evaluation.
     * <p>
     * IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option <em>must</em> be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.
     * <p>
     * Defaults to "Never".
     * <p>
     * Default: Never".
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getReinvocationPolicy() {
        return null;
    }

    /**
     * Rules describes what operations on what resources/subresources the webhook cares about.
     * <p>
     * The webhook cares about an operation if it matches <em>any</em> Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
     */
    default @org.jetbrains.annotations.Nullable java.util.List<imports.k8s.RuleWithOperations> getRules() {
        return null;
    }

    /**
     * SideEffects states whether this webhookk has side effects.
     * <p>
     * Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
     * <p>
     * Default: Unknown.
     */
    default @org.jetbrains.annotations.Nullable java.lang.String getSideEffects() {
        return null;
    }

    /**
     * TimeoutSeconds specifies the timeout for this webhook.
     * <p>
     * After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
     * <p>
     * Default: 30 seconds.
     */
    default @org.jetbrains.annotations.Nullable java.lang.Number getTimeoutSeconds() {
        return null;
    }

    /**
     * @return a {@link Builder} of {@link MutatingWebhook}
     */
    static Builder builder() {
        return new Builder();
    }
    /**
     * A builder for {@link MutatingWebhook}
     */
    public static final class Builder implements software.amazon.jsii.Builder<MutatingWebhook> {
        private imports.k8s.WebhookClientConfig clientConfig;
        private java.lang.String name;
        private java.util.List<java.lang.String> admissionReviewVersions;
        private java.lang.String failurePolicy;
        private java.lang.String matchPolicy;
        private imports.k8s.LabelSelector namespaceSelector;
        private imports.k8s.LabelSelector objectSelector;
        private java.lang.String reinvocationPolicy;
        private java.util.List<imports.k8s.RuleWithOperations> rules;
        private java.lang.String sideEffects;
        private java.lang.Number timeoutSeconds;

        /**
         * Sets the value of {@link MutatingWebhook#getClientConfig}
         * @param clientConfig ClientConfig defines how to communicate with the hook. This parameter is required.
         *                     Required
         * @return {@code this}
         */
        public Builder clientConfig(imports.k8s.WebhookClientConfig clientConfig) {
            this.clientConfig = clientConfig;
            return this;
        }

        /**
         * Sets the value of {@link MutatingWebhook#getName}
         * @param name The name of the admission webhook. This parameter is required.
         *             Name should be fully qualified, e.g., imagepolicy.kubernetes.io, where "imagepolicy" is the name of the webhook, and kubernetes.io is the name of the organization. Required.
         * @return {@code this}
         */
        public Builder name(java.lang.String name) {
            this.name = name;
            return this;
        }

        /**
         * Sets the value of {@link MutatingWebhook#getAdmissionReviewVersions}
         * @param admissionReviewVersions AdmissionReviewVersions is an ordered list of preferred `AdmissionReview` versions the Webhook expects.
         *                                API server will try to use first version in the list which it supports. If none of the versions specified in this list supported by API server, validation will fail for this object. If a persisted webhook configuration specifies allowed versions and does not include any versions known to the API Server, calls to the webhook will fail and be subject to the failure policy. Default to <code>['v1beta1']</code>.
         * @return {@code this}
         */
        public Builder admissionReviewVersions(java.util.List<java.lang.String> admissionReviewVersions) {
            this.admissionReviewVersions = admissionReviewVersions;
            return this;
        }

        /**
         * Sets the value of {@link MutatingWebhook#getFailurePolicy}
         * @param failurePolicy FailurePolicy defines how unrecognized errors from the admission endpoint are handled - allowed values are Ignore or Fail.
         *                      Defaults to Ignore.
         * @return {@code this}
         */
        public Builder failurePolicy(java.lang.String failurePolicy) {
            this.failurePolicy = failurePolicy;
            return this;
        }

        /**
         * Sets the value of {@link MutatingWebhook#getMatchPolicy}
         * @param matchPolicy matchPolicy defines how the "rules" list is used to match incoming requests. Allowed values are "Exact" or "Equivalent".
         *                    <ul>
         *                    <li>Exact: match a request only if it exactly matches a specified rule. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, but "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would not be sent to the webhook.</li>
         *                    <li>Equivalent: match a request if modifies a resource listed in rules, even via another API group or version. For example, if deployments can be modified via apps/v1, apps/v1beta1, and extensions/v1beta1, and "rules" only included <code>apiGroups:["apps"], apiVersions:["v1"], resources: ["deployments"]</code>, a request to apps/v1beta1 or extensions/v1beta1 would be converted to apps/v1 and sent to the webhook.</li>
         *                    </ul>
         *                    <p>
         *                    Defaults to "Exact"
         * @return {@code this}
         */
        public Builder matchPolicy(java.lang.String matchPolicy) {
            this.matchPolicy = matchPolicy;
            return this;
        }

        /**
         * Sets the value of {@link MutatingWebhook#getNamespaceSelector}
         * @param namespaceSelector NamespaceSelector decides whether to run the webhook on an object based on whether the namespace for that object matches the selector.
         *                          If the object itself is a namespace, the matching is performed on object.metadata.labels. If the object is another cluster scoped resource, it never skips the webhook.
         *                          <p>
         *                          For example, to run the webhook on any objects whose namespace is not associated with "runlevel" of "0" or "1";  you will set the selector as follows: "namespaceSelector": {
         *                          "matchExpressions": [
         *                          {
         *                          "key": "runlevel",
         *                          "operator": "NotIn",
         *                          "values": [
         *                          "0",
         *                          "1"
         *                          ]
         *                          }
         *                          ]
         *                          }
         *                          <p>
         *                          If instead you want to only run the webhook on any objects whose namespace is associated with the "environment" of "prod" or "staging"; you will set the selector as follows: "namespaceSelector": {
         *                          "matchExpressions": [
         *                          {
         *                          "key": "environment",
         *                          "operator": "In",
         *                          "values": [
         *                          "prod",
         *                          "staging"
         *                          ]
         *                          }
         *                          ]
         *                          }
         *                          <p>
         *                          See https://kubernetes.io/docs/concepts/overview/working-with-objects/labels/ for more examples of label selectors.
         *                          <p>
         *                          Default to the empty LabelSelector, which matches everything.
         * @return {@code this}
         */
        public Builder namespaceSelector(imports.k8s.LabelSelector namespaceSelector) {
            this.namespaceSelector = namespaceSelector;
            return this;
        }

        /**
         * Sets the value of {@link MutatingWebhook#getObjectSelector}
         * @param objectSelector ObjectSelector decides whether to run the webhook based on if the object has matching labels.
         *                       objectSelector is evaluated against both the oldObject and newObject that would be sent to the webhook, and is considered to match if either object matches the selector. A null object (oldObject in the case of create, or newObject in the case of delete) or an object that cannot have labels (like a DeploymentRollback or a PodProxyOptions object) is not considered to match. Use the object selector only if the webhook is opt-in, because end users may skip the admission webhook by setting the labels. Default to the empty LabelSelector, which matches everything.
         * @return {@code this}
         */
        public Builder objectSelector(imports.k8s.LabelSelector objectSelector) {
            this.objectSelector = objectSelector;
            return this;
        }

        /**
         * Sets the value of {@link MutatingWebhook#getReinvocationPolicy}
         * @param reinvocationPolicy reinvocationPolicy indicates whether this webhook should be called multiple times as part of a single admission evaluation.
         *                           Allowed values are "Never" and "IfNeeded".
         *                           <p>
         *                           Never: the webhook will not be called more than once in a single admission evaluation.
         *                           <p>
         *                           IfNeeded: the webhook will be called at least one additional time as part of the admission evaluation if the object being admitted is modified by other admission plugins after the initial webhook call. Webhooks that specify this option <em>must</em> be idempotent, able to process objects they previously admitted. Note: * the number of additional invocations is not guaranteed to be exactly one. * if additional invocations result in further modifications to the object, webhooks are not guaranteed to be invoked again. * webhooks that use this option may be reordered to minimize the number of additional invocations. * to validate an object after all mutations are guaranteed complete, use a validating admission webhook instead.
         *                           <p>
         *                           Defaults to "Never".
         * @return {@code this}
         */
        public Builder reinvocationPolicy(java.lang.String reinvocationPolicy) {
            this.reinvocationPolicy = reinvocationPolicy;
            return this;
        }

        /**
         * Sets the value of {@link MutatingWebhook#getRules}
         * @param rules Rules describes what operations on what resources/subresources the webhook cares about.
         *              The webhook cares about an operation if it matches <em>any</em> Rule. However, in order to prevent ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks from putting the cluster in a state which cannot be recovered from without completely disabling the plugin, ValidatingAdmissionWebhooks and MutatingAdmissionWebhooks are never called on admission requests for ValidatingWebhookConfiguration and MutatingWebhookConfiguration objects.
         * @return {@code this}
         */
        @SuppressWarnings("unchecked")
        public Builder rules(java.util.List<? extends imports.k8s.RuleWithOperations> rules) {
            this.rules = (java.util.List<imports.k8s.RuleWithOperations>)rules;
            return this;
        }

        /**
         * Sets the value of {@link MutatingWebhook#getSideEffects}
         * @param sideEffects SideEffects states whether this webhookk has side effects.
         *                    Acceptable values are: Unknown, None, Some, NoneOnDryRun Webhooks with side effects MUST implement a reconciliation system, since a request may be rejected by a future step in the admission change and the side effects therefore need to be undone. Requests with the dryRun attribute will be auto-rejected if they match a webhook with sideEffects == Unknown or Some. Defaults to Unknown.
         * @return {@code this}
         */
        public Builder sideEffects(java.lang.String sideEffects) {
            this.sideEffects = sideEffects;
            return this;
        }

        /**
         * Sets the value of {@link MutatingWebhook#getTimeoutSeconds}
         * @param timeoutSeconds TimeoutSeconds specifies the timeout for this webhook.
         *                       After the timeout passes, the webhook call will be ignored or the API call will fail based on the failure policy. The timeout value must be between 1 and 30 seconds. Default to 30 seconds.
         * @return {@code this}
         */
        public Builder timeoutSeconds(java.lang.Number timeoutSeconds) {
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * Builds the configured instance.
         * @return a new instance of {@link MutatingWebhook}
         * @throws NullPointerException if any required attribute was not provided
         */
        @Override
        public MutatingWebhook build() {
            return new Jsii$Proxy(clientConfig, name, admissionReviewVersions, failurePolicy, matchPolicy, namespaceSelector, objectSelector, reinvocationPolicy, rules, sideEffects, timeoutSeconds);
        }
    }

    /**
     * An implementation for {@link MutatingWebhook}
     */
    final class Jsii$Proxy extends software.amazon.jsii.JsiiObject implements MutatingWebhook {
        private final imports.k8s.WebhookClientConfig clientConfig;
        private final java.lang.String name;
        private final java.util.List<java.lang.String> admissionReviewVersions;
        private final java.lang.String failurePolicy;
        private final java.lang.String matchPolicy;
        private final imports.k8s.LabelSelector namespaceSelector;
        private final imports.k8s.LabelSelector objectSelector;
        private final java.lang.String reinvocationPolicy;
        private final java.util.List<imports.k8s.RuleWithOperations> rules;
        private final java.lang.String sideEffects;
        private final java.lang.Number timeoutSeconds;

        /**
         * Constructor that initializes the object based on values retrieved from the JsiiObject.
         * @param objRef Reference to the JSII managed object.
         */
        protected Jsii$Proxy(final software.amazon.jsii.JsiiObjectRef objRef) {
            super(objRef);
            this.clientConfig = this.jsiiGet("clientConfig", imports.k8s.WebhookClientConfig.class);
            this.name = this.jsiiGet("name", java.lang.String.class);
            this.admissionReviewVersions = this.jsiiGet("admissionReviewVersions", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(java.lang.String.class)));
            this.failurePolicy = this.jsiiGet("failurePolicy", java.lang.String.class);
            this.matchPolicy = this.jsiiGet("matchPolicy", java.lang.String.class);
            this.namespaceSelector = this.jsiiGet("namespaceSelector", imports.k8s.LabelSelector.class);
            this.objectSelector = this.jsiiGet("objectSelector", imports.k8s.LabelSelector.class);
            this.reinvocationPolicy = this.jsiiGet("reinvocationPolicy", java.lang.String.class);
            this.rules = this.jsiiGet("rules", software.amazon.jsii.NativeType.listOf(software.amazon.jsii.NativeType.forClass(imports.k8s.RuleWithOperations.class)));
            this.sideEffects = this.jsiiGet("sideEffects", java.lang.String.class);
            this.timeoutSeconds = this.jsiiGet("timeoutSeconds", java.lang.Number.class);
        }

        /**
         * Constructor that initializes the object based on literal property values passed by the {@link Builder}.
         */
        @SuppressWarnings("unchecked")
        private Jsii$Proxy(final imports.k8s.WebhookClientConfig clientConfig, final java.lang.String name, final java.util.List<java.lang.String> admissionReviewVersions, final java.lang.String failurePolicy, final java.lang.String matchPolicy, final imports.k8s.LabelSelector namespaceSelector, final imports.k8s.LabelSelector objectSelector, final java.lang.String reinvocationPolicy, final java.util.List<? extends imports.k8s.RuleWithOperations> rules, final java.lang.String sideEffects, final java.lang.Number timeoutSeconds) {
            super(software.amazon.jsii.JsiiObject.InitializationMode.JSII);
            this.clientConfig = java.util.Objects.requireNonNull(clientConfig, "clientConfig is required");
            this.name = java.util.Objects.requireNonNull(name, "name is required");
            this.admissionReviewVersions = admissionReviewVersions;
            this.failurePolicy = failurePolicy;
            this.matchPolicy = matchPolicy;
            this.namespaceSelector = namespaceSelector;
            this.objectSelector = objectSelector;
            this.reinvocationPolicy = reinvocationPolicy;
            this.rules = (java.util.List<imports.k8s.RuleWithOperations>)rules;
            this.sideEffects = sideEffects;
            this.timeoutSeconds = timeoutSeconds;
        }

        @Override
        public imports.k8s.WebhookClientConfig getClientConfig() {
            return this.clientConfig;
        }

        @Override
        public java.lang.String getName() {
            return this.name;
        }

        @Override
        public java.util.List<java.lang.String> getAdmissionReviewVersions() {
            return this.admissionReviewVersions;
        }

        @Override
        public java.lang.String getFailurePolicy() {
            return this.failurePolicy;
        }

        @Override
        public java.lang.String getMatchPolicy() {
            return this.matchPolicy;
        }

        @Override
        public imports.k8s.LabelSelector getNamespaceSelector() {
            return this.namespaceSelector;
        }

        @Override
        public imports.k8s.LabelSelector getObjectSelector() {
            return this.objectSelector;
        }

        @Override
        public java.lang.String getReinvocationPolicy() {
            return this.reinvocationPolicy;
        }

        @Override
        public java.util.List<imports.k8s.RuleWithOperations> getRules() {
            return this.rules;
        }

        @Override
        public java.lang.String getSideEffects() {
            return this.sideEffects;
        }

        @Override
        public java.lang.Number getTimeoutSeconds() {
            return this.timeoutSeconds;
        }

        @Override
        public com.fasterxml.jackson.databind.JsonNode $jsii$toJson() {
            final com.fasterxml.jackson.databind.ObjectMapper om = software.amazon.jsii.JsiiObjectMapper.INSTANCE;
            final com.fasterxml.jackson.databind.node.ObjectNode data = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();

            data.set("clientConfig", om.valueToTree(this.getClientConfig()));
            data.set("name", om.valueToTree(this.getName()));
            if (this.getAdmissionReviewVersions() != null) {
                data.set("admissionReviewVersions", om.valueToTree(this.getAdmissionReviewVersions()));
            }
            if (this.getFailurePolicy() != null) {
                data.set("failurePolicy", om.valueToTree(this.getFailurePolicy()));
            }
            if (this.getMatchPolicy() != null) {
                data.set("matchPolicy", om.valueToTree(this.getMatchPolicy()));
            }
            if (this.getNamespaceSelector() != null) {
                data.set("namespaceSelector", om.valueToTree(this.getNamespaceSelector()));
            }
            if (this.getObjectSelector() != null) {
                data.set("objectSelector", om.valueToTree(this.getObjectSelector()));
            }
            if (this.getReinvocationPolicy() != null) {
                data.set("reinvocationPolicy", om.valueToTree(this.getReinvocationPolicy()));
            }
            if (this.getRules() != null) {
                data.set("rules", om.valueToTree(this.getRules()));
            }
            if (this.getSideEffects() != null) {
                data.set("sideEffects", om.valueToTree(this.getSideEffects()));
            }
            if (this.getTimeoutSeconds() != null) {
                data.set("timeoutSeconds", om.valueToTree(this.getTimeoutSeconds()));
            }

            final com.fasterxml.jackson.databind.node.ObjectNode struct = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            struct.set("fqn", om.valueToTree("k8s.MutatingWebhook"));
            struct.set("data", data);

            final com.fasterxml.jackson.databind.node.ObjectNode obj = com.fasterxml.jackson.databind.node.JsonNodeFactory.instance.objectNode();
            obj.set("$jsii.struct", struct);

            return obj;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MutatingWebhook.Jsii$Proxy that = (MutatingWebhook.Jsii$Proxy) o;

            if (!clientConfig.equals(that.clientConfig)) return false;
            if (!name.equals(that.name)) return false;
            if (this.admissionReviewVersions != null ? !this.admissionReviewVersions.equals(that.admissionReviewVersions) : that.admissionReviewVersions != null) return false;
            if (this.failurePolicy != null ? !this.failurePolicy.equals(that.failurePolicy) : that.failurePolicy != null) return false;
            if (this.matchPolicy != null ? !this.matchPolicy.equals(that.matchPolicy) : that.matchPolicy != null) return false;
            if (this.namespaceSelector != null ? !this.namespaceSelector.equals(that.namespaceSelector) : that.namespaceSelector != null) return false;
            if (this.objectSelector != null ? !this.objectSelector.equals(that.objectSelector) : that.objectSelector != null) return false;
            if (this.reinvocationPolicy != null ? !this.reinvocationPolicy.equals(that.reinvocationPolicy) : that.reinvocationPolicy != null) return false;
            if (this.rules != null ? !this.rules.equals(that.rules) : that.rules != null) return false;
            if (this.sideEffects != null ? !this.sideEffects.equals(that.sideEffects) : that.sideEffects != null) return false;
            return this.timeoutSeconds != null ? this.timeoutSeconds.equals(that.timeoutSeconds) : that.timeoutSeconds == null;
        }

        @Override
        public int hashCode() {
            int result = this.clientConfig.hashCode();
            result = 31 * result + (this.name.hashCode());
            result = 31 * result + (this.admissionReviewVersions != null ? this.admissionReviewVersions.hashCode() : 0);
            result = 31 * result + (this.failurePolicy != null ? this.failurePolicy.hashCode() : 0);
            result = 31 * result + (this.matchPolicy != null ? this.matchPolicy.hashCode() : 0);
            result = 31 * result + (this.namespaceSelector != null ? this.namespaceSelector.hashCode() : 0);
            result = 31 * result + (this.objectSelector != null ? this.objectSelector.hashCode() : 0);
            result = 31 * result + (this.reinvocationPolicy != null ? this.reinvocationPolicy.hashCode() : 0);
            result = 31 * result + (this.rules != null ? this.rules.hashCode() : 0);
            result = 31 * result + (this.sideEffects != null ? this.sideEffects.hashCode() : 0);
            result = 31 * result + (this.timeoutSeconds != null ? this.timeoutSeconds.hashCode() : 0);
            return result;
        }
    }
}