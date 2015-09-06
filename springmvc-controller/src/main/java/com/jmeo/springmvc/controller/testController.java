package com.jmeo.springmvc.controller;

import com.jmeo.springmvc.entities.User;
import com.jmeo.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by JmeoM on 2015/9/5.
 *
 */
@Controller
@RequestMapping("/controller")
public class testController {

    @Autowired
    UserService userService;

    @RequestMapping("/action")
    @ResponseBody
    public List<User> action(@RequestParam String id){
        System.out.println(id);
        List<User> users = userService.getAllUsers();
        if(users!=null){
            System.out.println(" users length is : " + users.size());
        }else{
            System.out.println(" users length is : 0 --->");
        }
        return users;
    }

    @RequestMapping("/ht1")
    @ResponseBody
    public String ht1(){

        return "helloworld";
    }

}
