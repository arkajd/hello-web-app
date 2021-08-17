package com.example.helloworldweb.controller;

import com.example.helloworldweb.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @GetMapping(path = "/hello")
    public ResponseEntity<String> getGreetings(){
        String response = helloWorldService.getHello();
        return new ResponseEntity<String>(response, HttpStatus.OK);
    }


}
