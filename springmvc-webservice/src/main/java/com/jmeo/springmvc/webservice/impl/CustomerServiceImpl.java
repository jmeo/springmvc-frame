package com.jmeo.springmvc.webservice.impl;

import com.jmeo.springmvc.webservice.CustomerService;
import com.jmeo.springmvc.webservice.bean.Customer;

import javax.jws.WebService;

/**
 * Created by jmeo on 15/10/1.
 */
@WebService(endpointInterface = "com.jmeo.springmvc.webservice.CustomerService")
public class CustomerServiceImpl implements CustomerService {

    public Customer[] getCustomers(String name) {
        return new Customer[0];
    }

}
