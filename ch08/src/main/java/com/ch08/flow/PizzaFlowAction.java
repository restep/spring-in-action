package com.ch08.flow;

import com.ch08.enums.PaymentTypeEnum;
import com.ch08.exception.CustomerNotFoundException;
import com.ch08.model.*;
import com.ch08.service.CustomerService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author restep
 * @date 2018/5/19
 */
@Component
public class PizzaFlowAction {
    @Autowired
    private CustomerService customerService;

    public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
        Customer customer = customerService.lookupCustomer(phoneNumber);
        if (null == customer) {
            throw new CustomerNotFoundException();
        }

        return customer;
    }

    public void addCustomer(Customer customer) {
        System.out.println("addCustomer");
    }

    public AbstractPayment verifyPayment(PaymentDetail paymentDetail) {
        AbstractPayment payment = null;
        if (paymentDetail.getPaymentTypeEnum() == PaymentTypeEnum.CREDIT_CARD) {
            payment = new CreditCardPayment();
        } else {
            payment = new CashOrCheckPayment();
        }

        return payment;
    }

    public void saveOrder(Order order) {
        System.out.println("saveOrder");
    }

    public boolean checkDeliveryArea(String zipCode) {
        return StringUtils.equals("75075", zipCode);
    }
}
