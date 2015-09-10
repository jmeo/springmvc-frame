package com.jmeo.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by jmeo on 15/9/10.
 */
@Controller
public class UploadController {

    @RequestMapping("/upload")
    @ResponseBody
    public String uploadFile(@RequestParam(required = false,name = "file") MultipartFile file,HttpServletRequest request,HttpServletResponse response,Model model){
        String str = "";
        if(file !=null){
            str = "file info -->  name : " + file.getOriginalFilename() +" size : " + file.getSize();
        }else{
            str = " file is empty !";
        }
        return str;
    }

}
