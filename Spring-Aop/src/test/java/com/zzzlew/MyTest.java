package com.zzzlew;

import com.zzzlew.server.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/28 - 04 - 28 - 16:13
 * @Description: com.zzzlew
 * @version: 1.0
 */
public class MyTest {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.add();
    }
}
