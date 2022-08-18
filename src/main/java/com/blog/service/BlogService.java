package com.blog.service;

import com.blog.po.Blog;

import java.util.List;

public interface BlogService {


    public List<Blog> getAllBlog();


    public Blog getBlogByBlogid(Integer blogid);


    public void createBlog(Blog blog);

    public void deleteBlog(Integer blogid);

    public void updateBlog(Blog blog);

    public List<Blog> getAllBlogByid();
}