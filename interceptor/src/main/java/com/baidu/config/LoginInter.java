package com.baidu.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //放行
        HttpSession session = request.getSession();

        //登录页也放行
        if(request.getRequestURI().contains("b")){
            return true;
        }
        if(request.getRequestURI().contains("login")){
            return true;
        }
        if (session.getAttribute("userLoginInfo")!=null){
            return true;
        }

        //判断没有登录的情况
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;

    }
}
