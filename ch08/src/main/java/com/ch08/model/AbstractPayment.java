package com.ch08.model;

import java.io.Serializable;

/**
 * 付款
 * @author restep
 * @date 2018/5/19
 */
public abstract class AbstractPayment implements Serializable {
    private static final long serialVersionUID = -6539521090513765125L;
    private Float amount;

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }
}
