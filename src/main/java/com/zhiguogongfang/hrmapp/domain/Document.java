package com.zhiguogongfang.hrmapp.domain;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Document implements Serializable {
    private int id;
    private String title;
    private MultipartFile file;
    private String remark;
    private LocalDateTime createDate;
    private User user;

    public Document() {
    }

    public Document(int id, String title, MultipartFile file, String remark, LocalDateTime createDate, User user) {
        this.id = id;
        this.title = title;
        this.file = file;
        this.remark = remark;
        this.createDate = createDate;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
