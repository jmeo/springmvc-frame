package com.jmeo.springmvc.webservice;

import com.jmeo.springmvc.webservice.bean.Customer;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by jmeo on 15/10/1.
 */
@WebService
public interface CustomerService {

    Customer[] getCustomers(@WebParam(name = "name")String name);

}
