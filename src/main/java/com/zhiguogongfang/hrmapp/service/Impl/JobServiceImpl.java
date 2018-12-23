package com.zhiguogongfang.hrmapp.service.Impl;

import com.zhiguogongfang.hrmapp.domain.Job;
import com.zhiguogongfang.hrmapp.mapper.JobMapper;
import com.zhiguogongfang.hrmapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    private JobMapper jobMapper;

    @Override
    public List<Job> findJob() {
        return null;
    }

    @Override
    public void removeJobById(Integer id) {
jobMapper.deleteById(id);
    }

    @Override
    public Job findJobById(Integer id) {
        return jobMapper.selectById(id);
    }

    @Override
    public void addJob(Job job) {
        jobMapper.save(job);
    }

    @Override
    public void modifyJob(Job job) {
jobMapper.update(job);
    }
}
