package com.jmeo.springmvc.webservice;

import javax.jws.WebService;

/**
 * Created by jmeo on 15/10/1.
 */
@WebService
public interface HelloWorld {

    String sayHello(String name);

}
