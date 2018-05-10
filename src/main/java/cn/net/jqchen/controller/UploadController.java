package cn.net.jqchen.controller;

import cn.net.jqchen.service.UploadService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/upload")
public class UploadController {
 @Resource
 private UploadService uploadService;
    @RequestMapping("/uploadDynamic")
    public String upload(HttpServletRequest request,String message, MultipartFile file1)throws Exception{
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSS");
        String res=sdf.format(new Date());
        String originalFilename=file1.getOriginalFilename();
        String newFilename= UUID.randomUUID().toString()+res+originalFilename.substring(originalFilename.lastIndexOf("."));
        File uploadPic=new java.io.File("D:/Graduationdesign/img/"+newFilename);
        if(!uploadPic.exists()){
            uploadPic.mkdirs();
        }
        file1.transferTo(uploadPic);
        String account=(String )request.getSession().getAttribute("account");
        int photoId=uploadService.addPhoto(account,newFilename,message);
        int videoId=0;
        uploadService.addDynamic(account,message,photoId,videoId);
        request.getSession().setAttribute("account",account);
        return "redirect:../login/menu";
    }

    @RequestMapping("/uploadVideo")
    public String uploadVideo(String note,MultipartFile video1,HttpServletRequest request) throws IOException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSS");
        String res=sdf.format(new Date());
        String originalFilename=video1.getOriginalFilename();
        String newFilename= UUID.randomUUID().toString()+res+originalFilename.substring(originalFilename.lastIndexOf("."));
        File uploadPic=new java.io.File("D:/Graduationdesign/video/"+newFilename);
        if(!uploadPic.exists()){
            uploadPic.mkdirs();
        }
        video1.transferTo(uploadPic);
        String account=(String )request.getSession().getAttribute("account");
        int id=uploadService.addVideo(account,newFilename,note);
        request.getSession().setAttribute("account",account);
        return "redirect:../login/myvideo";
    }

}
