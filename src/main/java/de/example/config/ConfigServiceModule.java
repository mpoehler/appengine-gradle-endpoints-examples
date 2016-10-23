package de.example.config;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import de.example.service.ExampleService;
import de.example.service.impl.ExampleServiceImpl;

/**
 * Created by marco on 03.10.16.
 */
public class ConfigServiceModule extends AbstractModule {

    /**
     * here is defined which implementations are for service interfaces will be used.
     */
    @Override
    protected void configure() {
        bind(ExampleService.class).to(ExampleServiceImpl.class).in(Singleton.class);
    }

}
