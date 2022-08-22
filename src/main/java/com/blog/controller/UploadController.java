package com.blog.controller;

import com.blog.po.Upload;
import com.blog.po.User;
import com.blog.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
@CrossOrigin
@RestController
@RequestMapping(value = "/upload")
public class UploadController {
    @Autowired
    private UploadService uploadService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    private User user(@RequestParam String username, @RequestParam String password){
        return uploadService.user(username, password);
    }

    @RequestMapping(value = "/login2", method = RequestMethod.POST)
    private User user2(@RequestBody User user){
        return uploadService.user(user.getUsername(), user.getPassword());
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    private  Upload<String> upload(@RequestParam("file")MultipartFile file){
        return uploadService.upload(file);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    private String hello() {
        return "hello GET";
    }
}
