package com.ch08.service.impl;

import com.ch08.exception.PaymentException;

/**
 * @author restep
 * @date 2018/5/19
 */
public class PaymentProcessor {
    public PaymentProcessor() {

    }

    public void approveCreditCard(String creditCardNumber, String expMonth, String expYear, Float amount) throws PaymentException {
        if (amount > 20.00) {
            throw new PaymentException();
        }
    }
}
