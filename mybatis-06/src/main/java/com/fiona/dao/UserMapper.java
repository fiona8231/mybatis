package com.fiona.dao;


import com.fiona.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    User searchUserById(@Param("id") int id);

    int updateById(User user);
}
