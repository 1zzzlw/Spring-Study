package com.zzzlew.demo03;

import com.zzzlew.demo02.UserService;
import com.zzzlew.demo02.UserServiceImpl;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/28 - 04 - 28 - 15:41
 * @Description: com.zzzlew.demo03
 * @version: 1.0
 */
// 动态代理，不需要自己重新实现代理方法了
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler(userService);
        UserService proxy = (UserService) proxyInvocationHandler.getProxy();
        proxy.add();
    }
}
