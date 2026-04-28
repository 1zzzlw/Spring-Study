package com.zzzlew.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/28 - 04 - 28 - 16:45
 * @Description: com.zzzlew.annotation
 * @version: 1.0
 */
@Aspect
public class annotationAop {

    @Before("execution(* com.zzzlew.server.*.*(..))")
    public void before() {
        System.out.println("执行方法之前");
    }

    @After("execution(* com.zzzlew.server.*.*(..))")
    public void after() {
        System.out.println("执行方法之后");
    }

    @Around("execution(* com.zzzlew.server.*.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("=========");
        // 获得前面
        System.out.println(jp.getSignature());
        // 执行方法
        jp.proceed();
        System.out.println("=========");
    }
}
