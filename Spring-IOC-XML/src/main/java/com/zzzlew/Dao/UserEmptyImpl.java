package com.zzzlew.Dao;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/27 - 04 - 27 - 22:22
 * @Description: com.zzzlew.Dao
 * @version: 1.0
 */
public class UserEmptyImpl implements UserDao {

    // 一旦注册，无论是否使用，都会直接初始化到Bean容器中
    public UserEmptyImpl() {
        System.out.println("空构造");
    }

    @Override
    public String getUsername() {
        return "";
    }

    @Override
    public String getJob() {
        return "";
    }
}
