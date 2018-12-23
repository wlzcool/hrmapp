package com.zhiguogongfang.hrmapp.service.Impl;

import com.zhiguogongfang.hrmapp.domain.Notice;
import com.zhiguogongfang.hrmapp.mapper.NoticeMapper;
import com.zhiguogongfang.hrmapp.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> findNotice() {
        return null;
    }

    @Override
    public void removeNoticeById(Integer id) {
        noticeMapper.deleteById(id);
    }

    @Override
    public Notice findNoticeById(Integer id) {
        return noticeMapper.selectById(id);
    }

    @Override
    public void addNotice(Notice notice) {
        noticeMapper.save(notice);
    }

    @Override
    public void modifyNotice(Notice notice) {
        noticeMapper.update(notice);
    }
}
