package com.example.helloworldweb.service.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloWorldServiceImplTest {

    private HelloWorldServiceImpl helloWorldService;

    @Test
    void itShouldReturnHelloWorld() {

        // given
        helloWorldService = new HelloWorldServiceImpl();

        // when
        String response = helloWorldService.getHello();

        // then
        assertEquals(response, "Hello world!");

    }
}