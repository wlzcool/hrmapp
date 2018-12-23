package com.zhiguogongfang.hrmapp.mapper;

import com.zhiguogongfang.hrmapp.domain.Dept;
import com.zhiguogongfang.hrmapp.domain.Document;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;


import static com.zhiguogongfang.hrmapp.common.HrmConstants.DOCUMENTTABLE;

public interface DocumentMapper {
    @Select("select * from " + DOCUMENTTABLE + " where id =#{id}")
    Document selectById(Integer id);

    @Delete("delete from " + DOCUMENTTABLE + " where id=#{id}")
    void deleteById(Integer id);

    //动态修改部门
    void update(Document document);

    //查询部门总数
    Integer count(Map<String, Object> params);

    //分页查询部门
    List<Document> selectByPage(Map<String, Object> params);

    //插入
    void save(Document document);
}

