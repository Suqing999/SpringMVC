package com.baidu.controller;

import com.sun.deploy.net.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class FileController {
    @RequestMapping("/upfile")
    public String upfile(@RequestParam("file") CommonsMultipartFile file, HttpServletRequest request) throws IOException {
        if (file.isEmpty()) {
            System.out.println("文件未上传!");
        } else {
            // 得到上传的文件名
            String fileName = file.getOriginalFilename();
            // 得到服务器项目发布运行所在地址
            String path1 = request.getSession().getServletContext().getRealPath("image") + File.separator;
            // 此处未使用UUID来生成唯一标识,用日期做为标识
            String path = path1 + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + fileName;
            // 查看文件上传路径,方便查找
            System.out.println(path);
            // 把文件上传至path的路径
            File localFile = new File(path);
            file.transferTo(localFile);
        }
        return "redirect:/index.jsp";
    }
}
