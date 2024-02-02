package com.example.plan_test_four.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {

    @GetMapping("/")
    public String test(){
        System.out.print("IN_/");
        return "index 페이지 테스트";
    }

    @GetMapping("/showMe")
    public List<String> hello(){
        System.out.println("IN_/showMe");
        return Arrays.asList("첫번째 단어","두번째 단어"); }

    @GetMapping("/testPageApp")
    public String testPageApp(){
        System.out.print("IN_/testPageApp");
        return "/App"; }

    @GetMapping("/testPageIndex")
    public String testPageIndex(){
        System.out.println("IN_/testPageIndex");
        return "/index"; }

    @GetMapping("/testHandler")
    public Map<String, Object> testHandler() {
        Map<String, Object> res = new HashMap<>();
        System.out.print("IN_/test");
        res.put("SUCCESS", true);
        res.put("SUCCESS_TEXT", "Hello SpringBoot/React");
        return res;
    }
    @GetMapping("/testRtnNum")
    public String testRtnNum(){
        System.out.println("IN_/testRtnNum");
        return "7";
    }

    @GetMapping("/testHandler2")
    public String testHandler2() {
        System.out.println("IN_/testHandler2");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("response", "test");
        return "index";
    }



}
