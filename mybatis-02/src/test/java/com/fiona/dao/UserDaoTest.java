package com.fiona.dao;

import com.fiona.pojo.User;
import com.fiona.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;


public class UserDaoTest {

   static Logger logger =  Logger.getLogger(UserDaoTest.class);


    @Test
    public void getUserList(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();

        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);
        User u = mapper.getUserById(1);


            System.out.println(u);

        //close session
        sqlSession.close();

    }

   @Test
    public void testlog4j(){
       logger.info("INFO进入log4j");
       logger.debug("DEBUG进入log4j");
       logger.error("ERROR进入log4j");
   }
    @Test

    public void getUserByLimit(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserMapper mapper = sqlSession.getMapper(IUserMapper.class);

        HashMap<String, Integer> map = new HashMap();
        map.put("startIndex", 0 );
        map.put("pageSize", 2);
        List<User> list  = mapper.getUserByLimit(map);

        for(User u : list){
            System.out.println(u);
        }
        sqlSession.close();
    }

}
