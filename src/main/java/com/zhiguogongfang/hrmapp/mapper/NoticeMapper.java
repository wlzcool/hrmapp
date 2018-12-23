package com.zhiguogongfang.hrmapp.mapper;

import com.zhiguogongfang.hrmapp.domain.Employee;
import com.zhiguogongfang.hrmapp.domain.Notice;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

import static com.zhiguogongfang.hrmapp.common.HrmConstants.EMPLOYEETABLE;
import static com.zhiguogongfang.hrmapp.common.HrmConstants.JOBTABLE;
import static com.zhiguogongfang.hrmapp.common.HrmConstants.NOTICETABLE;

public interface NoticeMapper {
    @Select("select * from " +  NOTICETABLE + " where id =#{id}")
    Notice selectById(Integer id);
    @Delete("delete from " + NOTICETABLE + " where id=#{id}")
    void deleteById(Integer id);

    //动态修改部门
    void update(Notice notice);

    //查询部门总数
    Integer count(Map<String, Object> params);

    //分页查询部门
    List<Notice> selectByPage(Map<String, Object> params);

    //插入
    void save(Notice notice);
}


