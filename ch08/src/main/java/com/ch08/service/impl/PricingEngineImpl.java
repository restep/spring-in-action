package com.ch08.service.impl;

import com.ch08.enums.PizzaSizeEnum;
import com.ch08.model.Order;
import com.ch08.model.Pizza;
import com.ch08.service.PricingEngine;

import java.util.HashMap;
import java.util.Map;

/**
 * @author restep
 * @date 2018/5/19
 */
public class PricingEngineImpl implements PricingEngine {
    private static Float PRICE_PER_TOPPING = 0.20F;
    private static Map<PizzaSizeEnum, Float> SIZE_PRICES;

    static {
        SIZE_PRICES = new HashMap<>();
        SIZE_PRICES.put(PizzaSizeEnum.SMALL, 6.99F);
        SIZE_PRICES.put(PizzaSizeEnum.MEDIUM, 7.99F);
        SIZE_PRICES.put(PizzaSizeEnum.LARGE, 8.99F);
        SIZE_PRICES.put(PizzaSizeEnum.GINORMOUS, 9.99F);
    }


    public PricingEngineImpl() {

    }

    @Override
    public Float calculateOrderTotal(Order order) {
        Float total = 0.0F;
        for (Pizza pizza : order.getPizzaList()) {
            Float pizzaPrice = SIZE_PRICES.get(pizza.getPizzaSizeEnum());
            if (pizza.getPizzaToppingEnumList().size() > 2) {
                pizzaPrice += pizza.getPizzaToppingEnumList().size() * PRICE_PER_TOPPING;
            }
            total += pizzaPrice;
        }

        return total;
    }
}
