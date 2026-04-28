package com.zzzlew.demo01;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/28 - 04 - 28 - 14:54
 * @Description: com.zzzlew.demo01
 * @version: 1.0
 */
// 房东租房
public class Host implements House {
    @Override
    public void rent() {
        System.out.println("房东出租该房子");
    }
}
