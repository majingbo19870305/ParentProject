package com.iotek.controller;

import com.iotek.pojo.User;
import com.iotek.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        System.out.println("==连接成功==");
        return "success";
    }
    @RequestMapping("/register")
    @ResponseBody
    public String register(User user){
        System.out.println("user===>"+user);
        int num = userService.register(user);
        if(num>0){
            return "success";
        }else{
            return "fail";
        }

    }
}
