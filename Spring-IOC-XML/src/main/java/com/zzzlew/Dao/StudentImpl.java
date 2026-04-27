package com.zzzlew.Dao;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/27 - 04 - 27 - 21:50
 * @Description: com.zzzlew.Dao
 * @version: 1.0
 */
public class StudentImpl implements UserDao {

    private String username;
    private String job;

    public StudentImpl() {
        System.out.println("student的无参构造");
    }

    // IDE的错误提示，不会影响运行
    public StudentImpl(String username, String job) {
        this.username = username;
        this.job = job;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getJob() {
        return this.job;
    }

    @Override
    public String toString() {
        return "学生";
    }
}
