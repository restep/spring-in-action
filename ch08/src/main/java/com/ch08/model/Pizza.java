package com.ch08.model;

import com.ch08.enums.PizzaSizeEnum;
import com.ch08.enums.PizzaToppingEnum;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 披萨
 *
 * @author restep
 * @date 2018/5/19
 */
public class Pizza implements Serializable {
    private static final long serialVersionUID = -8914543153423105364L;
    private PizzaSizeEnum pizzaSizeEnum;

    private List<PizzaToppingEnum> pizzaToppingEnumList;

    public Pizza() {
        this.pizzaSizeEnum = PizzaSizeEnum.LARGE;
        this.pizzaToppingEnumList = new ArrayList<>();
    }

    public PizzaSizeEnum getPizzaSizeEnum() {
        return pizzaSizeEnum;
    }

    public void setPizzaSizeEnum(PizzaSizeEnum pizzaSizeEnum) {
        this.pizzaSizeEnum = pizzaSizeEnum;
    }

    public List<PizzaToppingEnum> getPizzaToppingEnumList() {
        return pizzaToppingEnumList;
    }

    public void setPizzaToppingEnumList(List<PizzaToppingEnum> pizzaToppingEnumList) {
        this.pizzaToppingEnumList = pizzaToppingEnumList;
    }
}
