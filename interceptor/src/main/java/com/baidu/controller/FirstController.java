package com.baidu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class FirstController {

    @RequestMapping("/t1")
    @ResponseBody
    public String test(){
        System.out.println("完成");
        return "ok";
    }
    @RequestMapping("/main")
    public String test3(){
        return "main";
    }
    @RequestMapping("/login")
    public String test2(HttpSession httpSession,String username,String password){
        httpSession.setAttribute("userLoginInfo", username);
        return "main";
    }
    @RequestMapping("/b")
    public String test4(){
        return "login";
    }
}
