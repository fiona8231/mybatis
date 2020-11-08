package com.fiona.dao;

import com.fiona.pojo.User;

import java.util.List;
import java.util.Map;

public interface IUserMapper {

    //search by id
    User getUserById(int id);

     //分页参数需要两个，可以用map
    List<User> getUserByLimit(Map<String, Integer> map);


}
