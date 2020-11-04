package com.fiona.dao;

import com.fiona.pojo.User;
import com.fiona.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {
    @Test
    public void getUserList(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
        List<User> list = mapper.getUserList();

        for(User u : list){
            System.out.println(u);
        }

        //close session
        sqlSession.close();

    }

    @Test
    public void testgetUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserMapper map = sqlSession.getMapper(IUserMapper.class);
        User user1 =  map.getUserById(1);
        System.out.println(user1);
        sqlSession.close();
    }

    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);

        mapper.addUser(new User(3, "fangfang", "7788"));

        //commit transaction
        sqlSession.commit();
        //close session
        sqlSession.close();
    }


    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);

        mapper.updateUser(new User(3, "yueyue", "7788"));

        //commit transaction
        sqlSession.commit();
        //close session
        sqlSession.close();
    }

    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);

        mapper.deleteUser(3);

        //commit transaction
        sqlSession.commit();
        //close session
        sqlSession.close();
    }

    @Test
    public void addUserById2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

       IUserMapper mapper =  sqlSession.getMapper(IUserMapper.class);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userid",  3);
        map.put("username",  "feifei");
        map.put("userpwd",  "suibian");

        mapper.addUserById2(map);


        sqlSession.commit();
        //close session
        sqlSession.close();
    }

    @Test
    public void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        IUserMapper mapper =  sqlSession.getMapper(IUserMapper.class);

        List<User> list  = mapper.getUserLike("fei");

        for( User u : list){
            System.out.println(u);
        }


        sqlSession.commit();
        //close session
        sqlSession.close();
    }
}
