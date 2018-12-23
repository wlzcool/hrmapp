package com.zhiguogongfang.hrmapp.mapper;

import com.zhiguogongfang.hrmapp.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;
import java.util.Map;

import static com.zhiguogongfang.hrmapp.common.HrmConstants.USERTABLE;

public interface UserMapper {
    @Select("select * from " + USERTABLE + "where loginname=#{loginname} and password=#{password}")
    User selectByLoginnameAndPassword(String loginname, String password);

    @Select("select * from " + USERTABLE + " where id =#{id}")
    User selectById(Integer id);

    @Delete("delete from " + USERTABLE + " where id=#{id}")
    void deleteById(Integer id);

    //动态修改用户
    void update(User user);

    //查询用户总数
    Integer count(Map<String, Object> params);

    //分页查询用户
    List<User> selectByPage(Map<String, Object> params);

    //插入
    void save(User user);
}
