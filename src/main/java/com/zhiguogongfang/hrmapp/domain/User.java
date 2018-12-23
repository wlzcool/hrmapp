package com.zhiguogongfang.hrmapp.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class User implements Serializable {
    private Integer id;
    private String username;
    private String loginname;
    private String password;
    private String status;
    private LocalDate createtime;

    public User() {
    }

    public User(Integer id, String username, String loginname, String password, String status, LocalDate createtime) {
        this.id = id;
        this.username = username;
        this.loginname = loginname;
        this.password = password;
        this.status = status;
        this.createtime = createtime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDate createtime) {
        this.createtime = createtime;
    }
}
