package com.ch04.audience;

import org.aspectj.lang.annotation.*;

/**
 * 观众
 * @author restep
 * @date 2018/5/1
 */
@Aspect
public class AudienceNew {
    @Pointcut("execution(* com.ch04.performance.Performance.perform(..))")
    public void performance() {

    }

    /**
     * 表演之前 手机静音
     */
    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    /**
     * 表演之前 入座
     */
    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    /**
     * 表演之后 鼓掌
     */
    @AfterReturning("performance()")
    public void applause() {
        System.out.println("clap clap clap");
    }

    /**
     * 表演之后 要求退款
     */
    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
