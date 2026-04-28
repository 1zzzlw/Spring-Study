package com.zzzlew.demo01;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/28 - 04 - 28 - 14:56
 * @Description: com.zzzlew.demo01
 * @version: 1.0
 */
// 代理，中介
public class Proxy {

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    // 中介帮房主租房
    public void rent() {
        contract();
        this.host.rent();
        agencyFee();
    }

    // 中介提供签合同的服务
    private void contract() {
        System.out.println("中介签合同");
    }

    // 中介会收中介费
    private void agencyFee() {
        System.out.println("中介收中介费");
    }
}
