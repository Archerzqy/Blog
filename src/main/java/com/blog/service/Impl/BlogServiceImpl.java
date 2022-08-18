package com.blog.service.Impl;

import com.blog.mapper.BlogMapper;
import com.blog.po.Blog;
import com.blog.service.BlogService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BlogServiceImpl implements BlogService {
    @Autowired
    BlogMapper blogMapper;

    //添加博客
    public String publish(Blog blog) {
        try {
            Blog tle = blogMapper.getTitleByBlogid(blog.getTitle());
            Blog neirong = blogMapper.getContentByBlogid(blog.getContent());
            int st= blog.getStatus();

            if (tle == null&&neirong==null) {
                return "标题和内容不能为空";
            }else if (st==0){
                blogMapper.save(blog);
                return "存为草稿";
            }else {
                blogMapper.save(blog);
                return "发表成功";
            }
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }

    }


    //更新博客
    public String update(Blog blog){
        try {
            Blog blog1=blogMapper.getBlogByBlogid(blog.getBlog());
            BeanUtils.copyProperties(blog,blog1);
            if (blog1==null){
                return "没有相关博客";
            }
            blogMapper.save(blog1);
            return "更新成功";
        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }



    //删除博客
    public String delete(Blog blog){
        try {
            Blog tle2 = blogMapper.getTitleByBlogid(blog.getTitle());
            Blog neirong2 = blogMapper.getContentByBlogid(blog.getContent());
            if (tle2==null&&neirong2==null){
                blogMapper.save(blog);
                return "删除成功";
            }else {
                blogMapper.save(blog);
                return "删除失败";}

        }catch (Exception e){
            e.printStackTrace();
            return e.getMessage();
        }
    }


    //查找博客
    public  void view(int id) {
        blogMapper.deleteBlog(id);


    }
    @Override
    public List<Blog> getAllBlog() {
        return null;
    }

    @Override
    public Blog getBlogByBlogid(Integer blogid) {
        return null;
    }

    @Override
    public void createBlog(Blog blog) {

    }

    @Override
    public void deleteBlog(Integer blogid) {

    }

    @Override
    public void updateBlog(Blog blog) {

    }

    @Override
    public List<Blog> getAllBlogByid() {
        return null;
    }
}
