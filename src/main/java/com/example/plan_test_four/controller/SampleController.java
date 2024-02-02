package com.example.plan_test_four.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/page")
public class SampleController {
    @GetMapping("/")
    public String test(){
        System.out.println("IN_/");
        return "index";
    }

    @GetMapping("/actions")
    public String actions(){
        System.out.println("IN_/actions");
        return "actions/index";
    }

    @GetMapping("/store")
    public String store(){
        System.out.println("IN_/store");
        return "store/index";
    }

    @GetMapping("/index")
    public String index(){
        System.out.println("IN_/index");
        return "/index.html";
    }


}
