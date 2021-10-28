package com.baidu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RestFulController {

    @RequestMapping("/add")
    public String test(Integer a, Integer b, Model model){
        Integer res = a + b;
        model.addAttribute("msg", "结果为:"+res);
        return "test";
    }

    @RequestMapping("/add2/{c}/{b}/{a}")
    public String test2(@PathVariable("c") Integer a,@PathVariable("c") Integer b, Model model){
        Integer res = a + b;
        model.addAttribute("msg", "结果为:"+res);
        return "test";
    }



}
