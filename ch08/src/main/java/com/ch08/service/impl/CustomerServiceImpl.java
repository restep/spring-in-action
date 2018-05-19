package com.ch08.service.impl;

import com.ch08.exception.CustomerNotFoundException;
import com.ch08.model.Customer;
import com.ch08.service.CustomerService;
import org.apache.commons.lang3.StringUtils;

/**
 * @author restep
 * @date 2018/5/19
 */
public class CustomerServiceImpl implements CustomerService {
    @Override
    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
        if (!StringUtils.equals("9725551234", phoneNumber)) {
            throw new CustomerNotFoundException();
        }

        Customer customer = new Customer();
        customer.setId(123);
        customer.setName("Craig Walls");
        customer.setAddress("3700 Dunlavy Rd");
        customer.setCity("Denton");
        customer.setState("TX");
        customer.setZipCode("76210");
        customer.setPhoneNumber(phoneNumber);

        return customer;
    }
}
