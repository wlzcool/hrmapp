package com.zhiguogongfang.hrmapp.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Notice implements Serializable {
    private Integer id;
    private String title;
    private String content;
    private LocalDateTime createDate;

    public Notice() {
    }

    public Notice(Integer id, String title, String content, LocalDateTime createDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
}
