package com.zhiguogongfang.hrmapp.service;

import com.zhiguogongfang.hrmapp.domain.Dept;
import com.zhiguogongfang.hrmapp.domain.Job;

import java.util.List;

public interface JobService {
    List<Job> findJob();
    void removeJobById(Integer id);
    Job findJobById(Integer id);
    void addJob(Job job);
    void modifyJob(Job job);
}
