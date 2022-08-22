package com.blog.service.Impl;

import com.blog.mapper.UploadMapper;
import com.blog.po.Upload;
import com.blog.po.User;
import com.blog.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@Service
public class UploadServiceImpl implements UploadService {
    @Autowired
    private UploadMapper uploadMapper;

    @Override
    public User user(String username,String password){
        return  uploadMapper.user(username,password);
        }

        @Override
        public Upload<String> upload(MultipartFile file){
        if (file.isEmpty()){
            return Upload.fail("400","文件为空");
        }
        String OriginalFilename= file.getOriginalFilename();
        String fileName=System.currentTimeMillis()+"."+OriginalFilename.substring(OriginalFilename.lastIndexOf("."+1));
        String filePath="D:\\shangchuan";
        File dest=new File(filePath+fileName);
        if (!dest.getParentFile().exists())
            dest.getParentFile().mkdir();
        try {
            file.transferTo(dest);
        }catch (Exception e){
            e.printStackTrace();
            Upload.fail("500","上传失败！");
        }
        return Upload.success(fileName);
    }
}
