package com.ch08.model;

import com.ch08.enums.PaymentTypeEnum;

import java.io.Serializable;

/**
 * @author restep
 * @date 2018/5/19
 */
public class PaymentDetail implements Serializable {
    private static final long serialVersionUID = -8462321656152210266L;
    private PaymentTypeEnum paymentTypeEnum;
    private String creditCardNumber;

    public PaymentTypeEnum getPaymentTypeEnum() {
        return paymentTypeEnum;
    }

    public void setPaymentTypeEnum(PaymentTypeEnum paymentTypeEnum) {
        this.paymentTypeEnum = paymentTypeEnum;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
