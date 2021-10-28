package com.baidu.controller;

import com.baidu.pojo.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {

    @RequestMapping("/t1")
    public String test1(){
        return "ajax";
    }

    @RequestMapping("/a1")
    public String test2(String name, Model model){
        System.out.println("a1:"+name);
        if("kk".equals(name)){
            return "true";
        }else{
            return "false";
        }
    }

    @RequestMapping("/a2")
    public List<User> test3(){
        List<User>  list = new ArrayList<>();
        list.add(new User("江南", 12, "难"));
        list.add(new User("江南2", 13, "难2"));
        list.add(new User("江南3", 14, "难3"));
        list.add(new User("江南4", 15, "难4"));

        return list;
    }

    @RequestMapping("/a3")
    public String test4(String name){
        System.out.println(name);
        if("user".equals(name)){
            return "ok";
        }else{
            return "密码有误";
        }
    }
}
