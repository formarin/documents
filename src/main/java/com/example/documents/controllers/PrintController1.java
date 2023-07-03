package com.example.documents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Controller
public class PrintController1 {
    // Получение данных из сайта
    @PostMapping("/employment")
    public String processPrint2(@RequestParam("fullName") String fullName,
                                @RequestParam("jobTitle") String jobTitle,
                                @RequestParam("dateInput") LocalDate dateInput,
                                @RequestParam("dateEmployment")  LocalDate dateEmployment,
                                Model model) {


        // Форматирование dateInput в требуемый формат
        String formattedDate = formatDate(dateInput);

        // Форматирование dateEmployment в требуемый формат
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formatteddateEmployment = dateEmployment.format(formatter1);

        //Отправка преобразованых данных
        model.addAttribute("fullName", fullName);
        model.addAttribute("jobTitle", jobTitle);
        model.addAttribute("formattedDate", formattedDate);
        model.addAttribute("formatteddateEmployment", formatteddateEmployment);
        return "Dok/employment"; // Вернуть имя представления "panel" для отображения страницы employment.html
    }
    @PostMapping("/holiday")
    public String processPrint1(@RequestParam("fullName") String fullName,
                                @RequestParam("dateInput") LocalDate dateInput,
                                @RequestParam("dateStart")  LocalDate dateStart,
                                @RequestParam("dateEnd")  LocalDate dateEnd,
                                Model model) {
        // Форматирование dateInput в требуемый формат
        String formattedDate = formatDate(dateInput);

        // Форматирование dateEmployment в требуемый формат
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formatteddateStart = dateStart.format(formatter1);

        // Форматирование dateEmployment в требуемый формат
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formatteddateEnd = dateEnd.format(formatter2);

        model.addAttribute("fullName", fullName);
        model.addAttribute("formattedDate", formattedDate);
        model.addAttribute("formatteddateStart", formatteddateStart);
        model.addAttribute("formatteddateEnd", formatteddateEnd);
        return "Dok/holiday"; // Вернуть имя представления "panel" для отображения страницы holiday.html
    }

    @PostMapping("/dismissal")
    public String processPrint3(@RequestParam("fullName") String fullName,
                                @RequestParam("dateInput") LocalDate dateInput,
                                @RequestParam("reasonforDismissal")  String reasonforDismissal,
                                @RequestParam("dateDismissal")  LocalDate dateDismissal,
                                Model model) {

        // Форматирование dateInput в требуемый формат
        String formattedDate = formatDate(dateInput);
        // Форматирование dateEmployment в требуемый формат
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formatteddateDismissal = dateDismissal.format(formatter1);

        model.addAttribute("fullName", fullName);
        model.addAttribute("formattedDate", formattedDate);
        model.addAttribute("reasonforDismissal", reasonforDismissal);
        model.addAttribute("formatteddateDismissal", formatteddateDismissal);
        return "Dok/dismissal"; // Вернуть имя представления "panel" для отображения страницы dismissal.html
    }
    public static String formatDate(LocalDate dateInput) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return dateInput.format(formatter);
    }

}



