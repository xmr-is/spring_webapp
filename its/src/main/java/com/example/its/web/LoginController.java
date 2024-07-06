package com.example.its.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String login(){
        return "index";
    }
    @GetMapping("/goLogin")
    public String goLogin(){
        return "login";
    }
}
