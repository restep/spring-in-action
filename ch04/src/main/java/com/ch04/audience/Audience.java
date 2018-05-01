package com.ch04.audience;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * 观众
 * @author restep
 * @date 2018/5/1
 */
@Aspect
public class Audience {
    /**
     * 表演之前 手机静音
     */
    @Before("execution(* com.ch04.performance.Performance.perform(..))")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    /**
     * 表演之前 入座
     */
    @Before("execution(* com.ch04.performance.Performance.perform(..))")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    /**
     * 表演之后 鼓掌
     */
    @AfterReturning("execution(* com.ch04.performance.Performance.perform(..))")
    public void applause() {
        System.out.println("clap clap clap");
    }

    /**
     * 表演之后 要求退款
     */
    @AfterThrowing("execution(* com.ch04.performance.Performance.perform(..))")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
