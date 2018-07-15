package com.sample.ms.application.service;

import com.sample.ms.application.model.Customer;

/**
 * Below class represents the idea of I in SOLID where interface segregation
 * is done in a way that we have smaller interfaces rather than creating GOD
 * like classes. This interface will only be responsible for Customer related CRUD
 *
 * I in SOLID states that it is better to have smaller interfaces rather than one
 * big interface having all methods
 *
 */
public interface CustomerService {

    Customer retrieveDetails(Integer customerId);

}
