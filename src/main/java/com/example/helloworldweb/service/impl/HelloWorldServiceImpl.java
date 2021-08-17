package com.example.helloworldweb.service.impl;

import com.example.helloworldweb.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {

    @Override
    public String getHello() {
        return "Hello world!";
    }
}
