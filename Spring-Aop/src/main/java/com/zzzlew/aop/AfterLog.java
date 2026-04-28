package com.zzzlew.aop;

import org.jspecify.annotations.Nullable;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/28 - 04 - 28 - 16:08
 * @Description: com.zzzlew.aop
 * @version: 1.0
 */
public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(@Nullable Object returnValue, Method method, @Nullable Object[] args, @Nullable Object target) throws Throwable {
        System.out.println("[After-Log]" + method.getClass().getName() + "类调用了" + method.getName() + "方法");
    }
}
