package com.zhiguogongfang.hrmapp.service.Impl;

import com.zhiguogongfang.hrmapp.domain.Employee;
import com.zhiguogongfang.hrmapp.mapper.EmployeeMapper;
import com.zhiguogongfang.hrmapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> findEmployee() {
        return null;
    }

    @Override
    public void removeEmployeeById(Integer id) {
        employeeMapper.deleteById(id);
    }

    @Override
    public Employee findEmployeeById(Integer id) {
        return employeeMapper.selectById(id);
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeMapper.save(employee);
    }

    @Override
    public void modifyEmployee(Employee employee) {
        employeeMapper.update(employee);
    }
}
