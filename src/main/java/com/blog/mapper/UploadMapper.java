package com.blog.mapper;

import com.blog.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
public interface UploadMapper {

        User user(@Param("username") String username, @Param("password") String password);

}
