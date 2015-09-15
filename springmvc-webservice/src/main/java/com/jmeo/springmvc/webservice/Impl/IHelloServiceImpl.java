package com.jmeo.springmvc.webservice.Impl;

import com.jmeo.springmvc.webservice.IHelloService;

import javax.jws.WebService;

/**
 * Created by jmeo on 15/9/15.
 */
@WebService(endpointInterface = "com.jmeo.springmvc.webservice.IHelloService")
public class IHelloServiceImpl implements IHelloService{

    public String sayHello(String name) {
        System.out.println("hello : " +name);

        return "this is jmeo";

    }

}
