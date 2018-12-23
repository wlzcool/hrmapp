package com.zhiguogongfang.hrmapp.service;

import com.zhiguogongfang.hrmapp.domain.Dept;
import com.zhiguogongfang.hrmapp.domain.Employee;

import java.util.List;

public interface DeptService {
    List<Dept> findDept();
    void removeDeptById(Integer id);
    Dept findDeptById(Integer id);
    void addDept(Dept dept);
    void modifyDept(Dept dept);
}
