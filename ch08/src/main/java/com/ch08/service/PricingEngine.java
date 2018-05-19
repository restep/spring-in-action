package com.ch08.service;

import com.ch08.model.Order;

/**
 * 定价器
 * @author restep
 * @date 2018/5/19
 */
public interface PricingEngine {
    /**
     * 计算订单总价
     * @param order
     * @return
     */
    Float calculateOrderTotal(Order order);
}
