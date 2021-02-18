package com.mycompany.app;

import software.constructs.Construct;

import org.cdk8s.App;
import org.cdk8s.Chart;
import org.cdk8s.ChartOptions;

public class Main extends Chart 
{

    public Main(final Construct scope, final String id) {
        this(scope, id, null);
    }

    public Main(final Construct scope, final String id, final ChartOptions options) {
        super(scope, id, options);

        new WebService(this, "hello", new WebServiceOptions.Builder()
                                                           .image("paulbouwer/hello-kubernetes:1.7")
                                                           .replicas(2)
                                                           .build());

        new WebService(this, "ghost", new WebServiceOptions.Builder()
                                                           .image("ghost")
                                                           .containerPort(2368)
                                                           .build());
    }

    public static void main(String[] args) {
        final App app = new App();
        new Main(app, "web-service-java");
        app.synth();
    }
}
