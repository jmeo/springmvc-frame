package com.jmeo.springmvc.webservice.impl;

import com.jmeo.springmvc.webservice.HelloWorld;

import javax.jws.WebService;

/**
 * Created by jmeo on 15/10/1.
 */
@WebService(endpointInterface = "com.jmeo.springmvc.webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
    public String sayHello(String name) {
        return null;
    }
}
