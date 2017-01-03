package com.im.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.im.service.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        System.out.println("sayHi called");
        return "Hello " + text;
    }
}
