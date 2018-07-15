package com.sample.ms.application.controller;

import com.sample.ms.application.model.Customer;
import com.sample.ms.application.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {

    /**
     * Below is an example of using Dependency Injection, calling via interface name
     * and implementation class is automatically detected which is annotated with @Service
     *
     * This is D of SOLID
     */
    @Autowired
    private CustomerService customerService;

    /**
     * This method is a GET and retrieves customer details.
     * @param id
     * @return
     */
    @RequestMapping(path = "/customer/{id}", method =  RequestMethod.GET)
    public Customer getCustomerDetails(@PathVariable Integer id){

        return customerService.retrieveDetails(id);
    }

}
