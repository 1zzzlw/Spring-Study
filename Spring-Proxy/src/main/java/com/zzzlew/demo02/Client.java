package com.zzzlew.demo02;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/28 - 04 - 28 - 15:12
 * @Description: com.zzzlew.demo02
 * @version: 1.0
 */
// 在不修改内部代码的情况下，使用代理对每条操作都加入一个打印日志的功能
public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
        userServiceProxy.add();
        userServiceProxy.delete();
        userServiceProxy.update();
        userServiceProxy.select();
    }
}
