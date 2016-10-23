package de.example.config;

import com.google.api.server.spi.guice.EndpointsModule;
import com.google.common.collect.ImmutableList;
import de.example.ExampleEndpoint;

/**
 * Created by marco on 03.10.16.
 */
public class ConfigEndpointsModule extends EndpointsModule {

    @Override
    public void configureServlets() {
        bind(ExampleEndpoint.class).toInstance(new ExampleEndpoint());
        configureEndpoints("/_ah/api/*", ImmutableList.of(ExampleEndpoint.class));
    }
}