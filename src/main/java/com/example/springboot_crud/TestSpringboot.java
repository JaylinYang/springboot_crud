package com.example.springboot_crud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSpringboot {
    @RequestMapping("/Hello")
    @ResponseBody
    public String Hello() {
        return "hello world";
    }
}
