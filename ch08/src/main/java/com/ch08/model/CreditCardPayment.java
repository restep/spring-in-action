package com.ch08.model;

/**
 * 信用卡支付
 * @author restep
 * @date 2018/5/19
 */
public class CreditCardPayment extends AbstractPayment {
    /** 授权 */
    private String authorization;

    public CreditCardPayment() {

    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }
}
