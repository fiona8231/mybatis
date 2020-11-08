package com.fiona.dao;

import com.fiona.pojo.Student;
import com.fiona.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    @Select("select * from teacher")
    List<Student> getAllTeacher();

    //获取指定老师下的所有学生以及老师的信息
    Teacher getTeacher(@Param("tid") int id);

    Teacher getTeacher2(@Param("tid") int id);
}
