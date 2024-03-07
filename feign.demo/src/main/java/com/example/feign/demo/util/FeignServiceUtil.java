package com.example.feign.demo.util;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "name", url = "http://localhost:9000/")
public interface FeignServiceUtil {

    @GetMapping("/save")
    String  saveEmployee();
}
