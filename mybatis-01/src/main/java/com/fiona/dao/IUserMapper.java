package com.fiona.dao;

import com.fiona.pojo.User;

import java.util.List;
import java.util.Map;

public interface IUserMapper {
    List<User> getUserList();

    //search by id
    User getUserById(int id);

    //insert user
    int addUser(User user);

    //updateUser
     int updateUser(User user);

     //delete
    int deleteUser(int i);


    //用万能的map
    int addUserById2(Map<String, Object> map);

    //mohu search
    List<User> getUserLike(String v);



}
