package com.zzzlew;

import com.zzzlew.Service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/27 - 04 - 27 - 21:31
 * @Description: com.zzzlew
 * @version: 1.0
 */
public class XMLTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl user = (UserServiceImpl) applicationContext.getBean("user1");
        System.out.println(user.getUserDao());
        System.out.println(user.getUserDao().getUsername());
        System.out.println(user.getUserDao().getJob());
    }


}
