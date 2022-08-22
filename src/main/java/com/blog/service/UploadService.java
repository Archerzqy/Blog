package com.blog.service;

import com.blog.po.Upload;
import com.blog.po.User;
import org.springframework.web.multipart.MultipartFile;

public interface UploadService {
    User user(String username,String password);
    Upload<String> upload(MultipartFile file);
}
