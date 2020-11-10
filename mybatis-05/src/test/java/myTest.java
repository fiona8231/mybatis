import com.fiona.dao.BlogMapper;
import com.fiona.pojo.Blog;
import com.fiona.utils.IDutils;
import com.fiona.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class myTest {

    @Test
   public void addInitBlog(){

        SqlSession sqlSession = MybatisUtils.getSqlSession();
       BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

       Blog blog = new Blog();

       blog.setId(IDutils.getId());
       blog.setTitle("JAVA BLOG");
       blog.setAuthor("xiao A");
       blog.setCreateTime(new Date());
       blog.setViews(1234);
       mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Spring BLOG");
        blog.setAuthor("xiao B");
        blog.setCreateTime(new Date());
        blog.setViews(8888);
        mapper.addBlog(blog);

        blog.setId(IDutils.getId());
        blog.setTitle("Mybatis BLOG");
        blog.setAuthor("xiao C");
        blog.setCreateTime(new Date());
        blog.setViews(76);
        mapper.addBlog(blog);

       sqlSession.commit();

       sqlSession.close();
   }


    @Test
    public void queryIf(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map  = new HashMap();
       List<Blog> blogs = mapper.queryIf(map);

        //search with title
        //map.put("title", "JAVA BLOG");
        //List<Blog> blogs = mapper.queryIf(map);

        for(Blog b : blogs){
            System.out.println(b);
        }

        sqlSession.close();
    }

    @Test
    public void queryChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map  = new HashMap();
        //List<Blog> blogs = mapper.queryIf(map);

        //search with title
        map.put("title", "JAVA BLOG");
        map.put("views", 76);
        List<Blog> blogs = mapper.queryIf(map);

        mapper.queryChoose(map);
        for(Blog b : blogs){
            System.out.println(b);
        }

        sqlSession.close();
    }

    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map  = new HashMap();

        //search with title
        map.put("title", "MY JAVA BLOG");
        map.put("author", "YUE");
        //map.put("views", 76);
        map.put("id", "b9b0b3a5dd6e47bd8f27c35a04067765");

        mapper.updateBlog(map);
        sqlSession.commit();
        sqlSession.close();

    }

}
