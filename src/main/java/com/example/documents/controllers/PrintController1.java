package com.example.documents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PrintController1 {

    @PostMapping("/employment")
    public String processPrint(@RequestParam("fio") String fio,
                               Model model) {
        model.addAttribute("fio", fio);
        return "Dok/employment"; // Вернуть имя представления "panel" для отображения страницы employment.html
    }
    @PostMapping("/holiday")
    public String processPrint2(@RequestParam("fio") String fio,
                               Model model) {
        model.addAttribute("fio", fio);
        return "Dok/holiday"; // Вернуть имя представления "panel" для отображения страницы holiday.html
    }
    @PostMapping("/dismissal")
    public String processPrint3(@RequestParam("fio") String fio,
                                Model model) {
        model.addAttribute("fio", fio);
        return "Dok/dismissal"; // Вернуть имя представления "panel" для отображения страницы dismissal.html
    }
}


