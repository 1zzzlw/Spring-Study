package com.zzzlew;

import com.zzzlew.pojo.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/27 - 04 - 27 - 23:24
 * @Description: com.zzzlew
 * @version: 1.0
 */
public class myTest {
    @Test
    public void test1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        person.getCat().shout();
        person.getDog().shout();
        System.out.println(person.getName());
    }
}
