package com.pan.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestController {

    @Autowired
    private HttpServletRequest request;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello");
        request.setAttribute("name", "panjie");
        return "hello";
    }
}
