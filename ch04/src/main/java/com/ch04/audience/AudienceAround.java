package com.ch04.audience;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 观众
 * @author restep
 * @date 2018/5/1
 */
@Aspect
public class AudienceAround {
    @Pointcut("execution(* com.ch04.performance.Performance.perform(..))")
    public void performance() {

    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint proceedingJoinPoint) {
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            proceedingJoinPoint.proceed();
            System.out.println("clap clap clap");
        } catch (Throwable throwable) {
            System.out.println("Demanding a refund");
        }
    }
}
