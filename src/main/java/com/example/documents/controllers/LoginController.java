package com.example.documents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLoginForm(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("errorMessage", "Вы ввели не верный логин или пароль,повторите попытку или обратитесь к сис.админу!");
        }
        return "index";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam("login") String login,
                               @RequestParam("psw") String password,
                                Model model) {
        if (isValidLogin(login, password)) {
            model.addAttribute("login", login);
            return "panel";
        } else {
            return "redirect:/login?error=1";
        }
    }


    // Пример метода для проверки логина и пароля
    private boolean isValidLogin(String login, String password) {
        // Ваша логика проверки логина и пароля здесь
        // Например, проверка в базе данных или сравнение с предопределенными значениями
        // Возвращаем true, если логин и пароль действительны, и false в противном случае
        return login.equals("admin") && password.equals("admin1");
    }
}
