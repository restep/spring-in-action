package com.ch08.enums;

import java.util.Arrays;
import java.util.List;

/**
 * 披萨配料枚举
 *
 * @author restep
 * @date 2018/5/19
 */
public enum PizzaToppingEnum {
    /** 意大利辣香肠 */
    PEPPERONI,
    /** 香肠 */
    SAUSAGE,
    /** 汉堡 */
    HAMBURGER,
    /** 蘑菇 */
    MUSHROOM,
    /** 加拿大腌肉 */
    CANADIAN_BACON,
    /** 菠萝 */
    PINEAPPLE,
    /** 青椒 */
    GREEN_PEPPER,
    /** 墨西哥胡椒 */
    JALAPENO,
    /** 番茄 */
    TOMATO,
    /** 洋葱 */
    ONION,
    /** 奶酪 */
    EXTRA_CHEESE;

    public static List<PizzaToppingEnum> asList() {
        PizzaToppingEnum[] all = PizzaToppingEnum.values();
        return Arrays.asList(all);
    }
}
