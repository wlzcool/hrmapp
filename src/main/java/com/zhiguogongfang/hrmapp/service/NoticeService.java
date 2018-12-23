package com.zhiguogongfang.hrmapp.service;

import com.zhiguogongfang.hrmapp.domain.Dept;
import com.zhiguogongfang.hrmapp.domain.Notice;

import java.util.List;

public interface NoticeService {
    List<Notice> findNotice();
    void removeNoticeById(Integer id);
    Notice findNoticeById(Integer id);
    void addNotice(Notice notice);
    void modifyNotice(Notice notice);
}
