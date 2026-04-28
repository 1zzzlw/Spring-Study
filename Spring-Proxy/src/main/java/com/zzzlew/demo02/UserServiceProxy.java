package com.zzzlew.demo02;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/28 - 04 - 28 - 15:13
 * @Description: com.zzzlew.demo02
 * @version: 1.0
 */
// 可以看到静态代理的缺点，就是需要重新实现一遍需要代理的方法
public class UserServiceProxy {

    private UserServiceImpl userService;

    public UserServiceProxy() {
    }

    public UserServiceProxy(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        log("add");
        this.userService.add();
    }

    public void delete() {
        log("delete");
        this.userService.delete();
    }

    public void update() {
        log("update");
        this.userService.update();
    }

    public void select() {
        log("select");
        this.userService.select();
    }

    public void log(String msg) {
        System.out.println("[debug] 进行了" + msg + "操作");
    }
}
