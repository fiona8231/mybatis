import com.fiona.dao.IUserMapper;
import com.fiona.dao.StudentMapper;
import com.fiona.dao.TeacherMapper;
import com.fiona.pojo.Student;
import com.fiona.pojo.Teacher;
import com.fiona.pojo.User;
import com.fiona.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;


public class UserMapperTest {
    static Logger logger =  Logger.getLogger(UserMapperTest.class);

    @Test
    public void testlog4j(){
        logger.info("INFO进入log4j");
        logger.debug("DEBUG进入log4j");
        logger.error("ERROR进入log4j");
    }


    @Test
    public void testTeacher(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher t  = mapper.getTeacher(1);

        System.out.println(t);

        sqlSession.close();
    }


    @Test
    public void testGetStudent(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list = mapper.getStudentList();
        for(Student s : list){
            System.out.println(s);
        }
        sqlSession.close();
    }

    @Test
    public void testGetStudent2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> list = mapper.getStudentList();
        for(Student s : list){
            System.out.println(s);
        }
        sqlSession.close();
    }
}
