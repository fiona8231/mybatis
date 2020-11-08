package com.fiona.dao;

import com.fiona.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface IUserMapper {

    @Select("select * from user")
    List<User> getUsers();



}
