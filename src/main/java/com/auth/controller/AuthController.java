package com.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Auther wangchengyang
 * @Date 2022/9/20 16:21
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/hello")
    private String sayHello(){
        return "Hello SpringSecurity";
    }

}
