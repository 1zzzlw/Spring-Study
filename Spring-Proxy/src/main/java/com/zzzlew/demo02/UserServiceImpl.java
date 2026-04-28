package com.zzzlew.demo02;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/28 - 04 - 28 - 15:12
 * @Description: com.zzzlew.demo02
 * @version: 1.0
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加用户信息");
    }

    @Override
    public void delete() {
        System.out.println("删除用户信息");

    }

    @Override
    public void update() {
        System.out.println("更新用户信息");

    }

    @Override
    public void select() {
        System.out.println("查找用户信息");
    }
}
