package com.zhiguogongfang.hrmapp.service.Impl;

import com.zhiguogongfang.hrmapp.domain.Dept;
import com.zhiguogongfang.hrmapp.mapper.DeptMapper;
import com.zhiguogongfang.hrmapp.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> findDept() {
        return null;
    }

    @Override
    public void removeDeptById(Integer id) {
        deptMapper.deleteById(id);
    }

    @Override
    public Dept findDeptById(Integer id) {
        return deptMapper.selectById(id);
    }

    @Override
    public void addDept(Dept dept) {
        deptMapper.save(dept);
    }

    @Override
    public void modifyDept(Dept dept) {
        deptMapper.update(dept);
    }
}
