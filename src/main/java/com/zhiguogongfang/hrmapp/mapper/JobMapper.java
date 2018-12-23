package com.zhiguogongfang.hrmapp.mapper;

import com.zhiguogongfang.hrmapp.domain.Dept;
import com.zhiguogongfang.hrmapp.domain.Job;
import com.zhiguogongfang.hrmapp.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


import static com.zhiguogongfang.hrmapp.common.HrmConstants.JOBTABLE;

public interface JobMapper {
    @Select("select * from " + JOBTABLE + " where id =#{id}")
    Job selectById(Integer id);

    @Delete("delete from " + JOBTABLE + " where id=#{id}")
    void deleteById(Integer id);

    //动态修改职业
    void update(Job job);

    //查询职业总数
    Integer count(Map<String, Object> params);

    //分页查询职业
    List<User> selectByPage(Map<String, Object> params);

    //插入
    void save(Job job);
}
