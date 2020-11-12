package com.fiona.dao;

import com.fiona.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    int addBlog(Blog blog);

    List<Blog> queryIf(Map map);

    List<Blog> queryChoose(Map map);

    int updateBlog(Map map);

    List<Blog> forEach(Map map);

}
