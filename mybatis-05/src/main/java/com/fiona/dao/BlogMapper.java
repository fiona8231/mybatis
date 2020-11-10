package com.fiona.dao;

import com.fiona.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    int addBlog(Blog blog);

    List<Blog> queryIf(Map map);

}
