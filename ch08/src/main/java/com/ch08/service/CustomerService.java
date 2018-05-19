package com.ch08.service;

import com.ch08.exception.CustomerNotFoundException;
import com.ch08.model.Customer;

/**
 * @author restep
 * @date 2018/5/19
 */
public interface CustomerService {
    Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;
}
