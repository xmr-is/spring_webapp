package com.example.its.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.its.web.entity.Employee;
import com.example.its.web.form.LoginForm;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes(names = "loginForm")
@Controller
public class LoginController {

    @GetMapping("/")
    public String login(Model model){
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }

    @PostMapping("/goMenu")
    public String goMenu(LoginForm loginForm, Model model){
        return "menu";
    }
}
