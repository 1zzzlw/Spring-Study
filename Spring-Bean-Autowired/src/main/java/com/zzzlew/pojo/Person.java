package com.zzzlew.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/27 - 04 - 27 - 23:19
 * @Description: com.zzzlew.pojo
 * @version: 1.0
 */
public class Person {

    // 这里的required默认是true
    // 如果定义为 false，就可以说明这个属性可以为空，为空也不会报错，否则就不能为空 和 @Nullable 的作用一样
    @Autowired(required = false)
    private Cat cat;
    @Autowired
    // 可以自由的指定Bean中已经存在的id值进行匹配
    @Qualifier("dog123")
    private Dog dog;
    private String name = "张三";

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }
}
