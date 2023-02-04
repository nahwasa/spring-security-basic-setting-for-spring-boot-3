package com.nahwasa.springsecuritybasicsettingforspringboot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/dashboard")
    public String dashboardPage(Model model) {
        model.addAttribute("loginId", "dev");
        model.addAttribute("loginRoles", "ROLE_USER");
        return "dashboard";
    }
}