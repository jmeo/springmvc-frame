package com.jmeo.springmvc.webservice;

import javax.jws.WebService;

/**
 * Created by jmeo on 15/9/15.
 */
@WebService
public interface IHelloService {

    String sayHello(String name);
}
