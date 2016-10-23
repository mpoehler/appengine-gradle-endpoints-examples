package de.example.config;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

/**
 * Created by marco on 23.10.16.
 */
public class ModulesGuiceServletConfig extends GuiceServletContextListener {

    @Override
    protected Injector getInjector() {
        return Guice.createInjector(
            new ConfigEndpointsModule(),
                new ConfigServiceModule()
        );
    }

}