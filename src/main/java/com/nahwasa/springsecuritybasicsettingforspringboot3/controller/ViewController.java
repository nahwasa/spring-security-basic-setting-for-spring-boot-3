package com.nahwasa.springsecuritybasicsettingforspringboot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/join")
    public String joinPage() {
        return "join";
    }

    @GetMapping("/dashboard")
    public String dashboardPage(Model model) {
        return "dashboard";
    }

    @GetMapping("/setting/admin")
    public String adminSettingPage() {
        return "admin_setting";
    }

    @GetMapping("/setting/user")
    public String userSettingPage() {
        return "user_setting";
    }
}