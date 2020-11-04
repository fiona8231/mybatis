package com.fiona.dao;

import com.fiona.pojo.User;
import com.fiona.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;


public class UserDaoTest {
    @Test
    public void getUserList(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
        User u = mapper.getUserById(1);


            System.out.println(u);

        //close session
        sqlSession.close();

    }


}
