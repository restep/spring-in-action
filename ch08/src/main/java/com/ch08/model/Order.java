package com.ch08.model;

import org.springframework.context.annotation.Configuration;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 订单
 *
 * @author restep
 * @date 2018/5/19
 */
@Configuration("order")
public class Order implements Serializable {
    private static final long serialVersionUID = 3075199755349225923L;
    private Customer customer;
    private List<Pizza> pizzaList;
    private AbstractPayment payment;

    public Order() {
        this.customer = new Customer();
        this.pizzaList = new ArrayList<>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public AbstractPayment getPayment() {
        return payment;
    }

    public void setPayment(AbstractPayment payment) {
        this.payment = payment;
    }
}
