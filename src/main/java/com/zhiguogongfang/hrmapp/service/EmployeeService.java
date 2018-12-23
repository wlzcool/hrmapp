package com.zhiguogongfang.hrmapp.service;

import com.zhiguogongfang.hrmapp.domain.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findEmployee ();
    void removeEmployeeById(Integer id);
    Employee findEmployeeById(Integer id);
    void addEmployee(Employee employee);
    void modifyEmployee(Employee employee);
}
