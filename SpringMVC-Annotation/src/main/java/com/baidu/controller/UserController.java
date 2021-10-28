package com.baidu.controller;

import com.baidu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/t1")
    public String test(@RequestParam("name") String NAME, Model model){
        //接收
        System.out.println(NAME);
        //返回
        model.addAttribute("msg", NAME);

        return "test";
    }


    @RequestMapping("/t2")
    public String test(User user, Model model){
        //接收
        System.out.println(user);
        //返回
        model.addAttribute("msg", user);

        return "test";
    }
}
