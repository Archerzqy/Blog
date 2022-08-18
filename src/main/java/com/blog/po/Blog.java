package com.blog.po;

import java.security.Timestamp;

public class Blog {
    public int blogid;
    public String title;
    public String content;
    public Timestamp createtime;
    public int userid;


    public int getBlogid() {
        return blogid;
    }

    public void setBlogid(int blogid) {
        this.blogid = blogid;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getUserid() {
        return userid;
    }

    public int getStatus() {
        return 0;
    }

    public Integer getBlog() {
        return 0;
    }
}

