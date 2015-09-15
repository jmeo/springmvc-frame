package com.jmeo.springmvc.webservice.Impl;

import com.jmeo.springmvc.webservice.IHelloService;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsClientFactoryBean;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jmeo on 15/9/15.
 */
public class IHelloServiceImplTest {

    @Test
    public void testSayHello() throws Exception {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());
        factory.setAddress("http://localhost:8080/service/HelloWorld");
        factory.setServiceClass(IHelloService.class);

        IHelloService service = (IHelloService)factory.create();
        String hh = service.sayHello("jk");
        System.out.println(hh);
    }
}