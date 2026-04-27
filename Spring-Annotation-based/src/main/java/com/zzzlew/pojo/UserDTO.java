package com.zzzlew.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/28 - 04 - 28 - 0:26
 * @Description: com.zzzlew.pojo
 * @version: 1.0
 */
// 自动注入的注解，相当于 <bean id="user" class="com.zzzlew.pojo.UserDTO"></bean>
@Component
public class UserDTO {
    // 相当于 <property name="username" value="张三"/>
    @Value("张三")
    private String username;
}
