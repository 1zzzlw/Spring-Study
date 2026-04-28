package com.zzzlew.demo01;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/28 - 04 - 28 - 14:56
 * @Description: com.zzzlew.demo01
 * @version: 1.0
 */
// 用户，租房的人
public class Client {
    public static void main(String[] args) {
        // 房主
        Host host = new Host();
        // 找中介，也就是静态代理
        Proxy proxy = new Proxy(host);
        // 这种不需要通过直接找房主，只通过中介就可以完成事件的就是代理
        // 优点：可以使真实角色的操作更加纯粹，不需要关注其他的事务
        // 公共事务交给代理，分工更明确
        // 公共事务发生扩展时，方便集中管理
        // 缺点就是没有一个事件，都需要创建一个代理，代码量大，开发成本变高
        // 解决办法就是通过动态代理来实现
        proxy.rent();
    }
}
