package de.example.service.impl;

import de.example.service.ExampleService;

/**
 * Created by marco on 23.10.16.
 */
public class ExampleServiceImpl implements ExampleService {
    @Override
    public String getName() {
        return "This is from ExampleService";
    }
}
