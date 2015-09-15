package com.jmeo.springmvc.webservice.Impl;

import com.jmeo.springmvc.service.UserService;
import com.jmeo.springmvc.webservice.IHelloService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;

/**
 * Created by jmeo on 15/9/15.
 */
@WebService(endpointInterface = "com.jmeo.springmvc.webservice.IHelloService")
public class IHelloServiceImpl implements IHelloService{

    @Autowired
    UserService userService;

    public String sayHello(String name) {
        System.out.println("hello : " +name);
        String ss = userService.getHello();
        return ss;

    }

}
