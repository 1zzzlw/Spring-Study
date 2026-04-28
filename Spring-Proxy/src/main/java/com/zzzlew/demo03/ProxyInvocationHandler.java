package com.zzzlew.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/28 - 04 - 28 - 15:30
 * @Description: com.zzzlew.demo03
 * @version: 1.0
 */
// 动态代理类，根据反射，自动生成代理对象
public class ProxyInvocationHandler implements InvocationHandler {

    private Object target;

    public ProxyInvocationHandler(Object target) {
        this.target = target;
    }

    // 创建代理对象
    public Object getProxy() {
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces()
                , this);
    }

    // 代理对象调用任何方法，都会进入这里
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log();
        Object result = method.invoke(this.target, args);
        return result;
    }

    private void log() {
        System.out.println("打印日志");
    }
}
