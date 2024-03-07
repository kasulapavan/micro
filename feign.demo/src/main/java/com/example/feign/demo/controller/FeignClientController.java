package com.example.feign.demo.controller;

import com.example.feign.demo.util.FeignServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class FeignClientController {


    @Autowired
    private FeignServiceUtil feignServiceUtil;


    @GetMapping("/data")
    public String getData(){
        return feignServiceUtil.saveEmployee();
    }
}
