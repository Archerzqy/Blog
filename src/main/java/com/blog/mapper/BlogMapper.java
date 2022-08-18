package com.blog.mapper;

import com.blog.po.Blog;

import java.util.List;

public interface BlogMapper {
    List<Blog> getAllBlog();

    Blog getBlogByBlogid(Integer blogid);
    Blog getTitleByBlogid(String title);
    Blog getContentByBlogid(String content);

    void postBlog(Blog blog);

    void deleteBlog(Integer blogid);

    void updateBlog(Blog blog);

    List<Blog> getAllBlogByid();

    void save(Blog blog);
}
