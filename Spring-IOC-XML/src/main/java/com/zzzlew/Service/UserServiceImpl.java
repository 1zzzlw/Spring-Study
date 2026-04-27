package com.zzzlew.Service;

import com.zzzlew.Dao.UserDao;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/27 - 04 - 27 - 21:57
 * @Description: com.zzzlew.Service
 * @version: 1.0
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

}
