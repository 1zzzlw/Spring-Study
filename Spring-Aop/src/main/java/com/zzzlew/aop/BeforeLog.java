package com.zzzlew.aop;

import org.jspecify.annotations.Nullable;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/28 - 04 - 28 - 16:08
 * @Description: com.zzzlew.aop
 * @version: 1.0
 */
public class BeforeLog implements MethodBeforeAdvice {
    /**
     * method -- 当前正在调用的目标方法（反射 Method 对象）
     * args -- 目标方法的入参
     * target -- 被代理的目标对象
     *
     */
    @Override
    public void before(Method method, @Nullable Object[] args, @Nullable Object target) throws Throwable {
        System.out.println("[Before-Log]" + method.getClass().getName() + "类调用了" + method.getName() + "方法");
    }
}
