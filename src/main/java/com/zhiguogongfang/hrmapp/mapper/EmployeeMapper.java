package com.zhiguogongfang.hrmapp.mapper;

import com.zhiguogongfang.hrmapp.domain.Dept;
import com.zhiguogongfang.hrmapp.domain.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


import static com.zhiguogongfang.hrmapp.common.HrmConstants.EMPLOYEETABLE;
import static com.zhiguogongfang.hrmapp.common.HrmConstants.JOBTABLE;

public interface EmployeeMapper {
    @Select("select * from " + EMPLOYEETABLE + " where id =#{id}")
    Employee selectById(Integer id);
    @Delete("delete from " + EMPLOYEETABLE + " where id=#{id}")
    void deleteById(Integer id);

    //动态修改部门
    void update(Employee employee);

    //查询部门总数
    Integer count(Map<String, Object> params);

    //分页查询部门
    List<Employee> selectByPage(Map<String, Object> params);

    //插入
    void save(Employee employee);
}


