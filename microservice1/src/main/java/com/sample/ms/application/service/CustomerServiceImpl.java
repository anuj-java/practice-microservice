package com.sample.ms.application.service;

import com.sample.ms.application.model.Address;
import com.sample.ms.application.model.Customer;
import org.springframework.stereotype.Service;

/**
 * This class represents the idea of S in SOLID which
 * states that a class should have one and single reason
 * to change.
 *
 * This class has a single responsiblity and is limited
 * to Customer related CRUD activities only.
 */
@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public Customer retrieveDetails(Integer customerId) {
        // will retrieve values from database later, for now hardcoding
        Address address = new Address("Payal Villa", "Magarapatta, Pune", "Maharashtra","India", "2080000");
        Customer customer = new Customer("Riya",address , 28, "Female");

        return customer;
    }
}
