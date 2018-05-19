package com.ch08.enums;

import java.util.Arrays;
import java.util.List;

/**
 * 支付类型
 * @author restep
 * @date 2018/5/19
 */
public enum PaymentTypeEnum {
    /** 现金 */
    CASH,
    /** 支票 */
    CHECK,
    /** 信用卡 */
    CREDIT_CARD;

    public static List<PaymentTypeEnum> asList() {
        PaymentTypeEnum[] all = PaymentTypeEnum.values();
        return Arrays.asList(all);
    }
}
