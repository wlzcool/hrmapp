package com.zhiguogongfang.hrmapp.mapper;

import com.zhiguogongfang.hrmapp.domain.Dept;
import com.zhiguogongfang.hrmapp.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

import static com.zhiguogongfang.hrmapp.common.HrmConstants.DEPTTABLE;
import static com.zhiguogongfang.hrmapp.common.HrmConstants.USERTABLE;

public interface DeptMapper {

    @Select("select * from " + DEPTTABLE + " where id =#{id}")
    Dept selectById(Integer id);

    @Delete("delete from " + DEPTTABLE + " where id=#{id}")
    void deleteById(Integer id);

    //动态修改部门
    void update(Dept dept);

    //查询部门总数
    Integer count(Map<String, Object> params);

    //分页查询部门
    List<Dept> selectByPage(Map<String, Object> params);

    //插入
    void save(Dept dept);
}
