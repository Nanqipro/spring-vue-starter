package com.goodlab.controller;


import com.goodlab.pojo.Result;
import com.goodlab.utils.AliOssUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class FileUploadController {

    @PostMapping("/upload")
    public Result<String> upload(MultipartFile file) throws Exception {

        // 把文件的内容存储到本地磁盘上
        String originalFilename = file.getOriginalFilename();
        // 保证文件的名字唯一 防止文件覆盖
        String newFileName = UUID.randomUUID().toString() + originalFilename.substring(originalFilename.lastIndexOf("."));
        // file.transferTo(new File("C:/Users/nanqipro/Desktop/"+newFileName));

        // 调用aliOssUtil上传文件
        String url = AliOssUtil.uploadFile(newFileName, file.getInputStream());
        return Result.success(url);
    }
}
