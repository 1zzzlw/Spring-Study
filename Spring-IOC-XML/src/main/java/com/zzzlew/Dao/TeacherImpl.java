package com.zzzlew.Dao;

/**
 * @Auther: zzzlew
 * @Date: 2026/4/27 - 04 - 27 - 21:52
 * @Description: com.zzzlew.Dao
 * @version: 1.0
 */
public class TeacherImpl implements UserDao{

    private String username;

    private String job;

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
        return "老师";
    }
}
