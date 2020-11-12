import com.fiona.dao.UserMapper;
import com.fiona.pojo.User;
import com.fiona.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class myTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        User user =  mapper.searchUserById(1);
        System.out.println(user);

        //update
        // mapper.updateById(new User(2,"AAA", "123"));
        // sqlSession.clearCache();

        System.out.println("+++++++++++++++++++++++++");
        User user2 =  mapper.searchUserById(1);
        System.out.println(user2);

        System.out.println(user == user2);
        sqlSession.close();
    }

    @Test
    public void test2(){
        SqlSession sqlSession1 = MybatisUtils.getSqlSession();

        //mapper
        UserMapper mapper1 = sqlSession1.getMapper(UserMapper.class);

        User user =  mapper1.searchUserById(1);
        System.out.println(user);
        sqlSession1.close();
        //update
        // mapper.updateById(new User(2,"AAA", "123"));
        // sqlSession.clearCache();
        System.out.println("+++++++++++++++++++++++++");

        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user2 =  mapper2.searchUserById(1);
        System.out.println(user2);

        System.out.println(user == user2);
        sqlSession2.close();
    }
}
