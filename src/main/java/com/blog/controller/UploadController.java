package com.blog.controller;

import com.blog.po.Upload;
import com.blog.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/upload")
public class UploadController {
    @Autowired
    private UploadService uploadService;

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    private  Upload<String> upload(@RequestParam("file")MultipartFile file){
        return uploadService.upload(file);
    }
}
