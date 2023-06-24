package com.example.documents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String processLogin(@RequestParam("login") String login,
                               @RequestParam("psw") String password,
                               Model model) {
        model.addAttribute("login", login);
        model.addAttribute("password", password);

        return "panel"; // Вернул на страницу panel.html
    }
}

