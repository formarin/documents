package com.example.documents.controllers;

import com.example.documents.models.Order;
import com.example.documents.repositories.OrderRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PrintController1 {
   /* private final OrderRepository orderRepository;
    public PrintController1(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    @GetMapping("/??")
    public String saveOrderEmploy(@RequestParam("fullName") String fullName) {
        // Создание и сохранение объекта Order в базу данных
        Order order = new Order();
        order.setFullName(fullName);
        orderRepository.save(order);

        return "???"; // Редирект на страницу успешного сохранения
    }
    @GetMapping("/??")
    public String saveOrderDismiss(@RequestParam("fullName") String fullName) {
        // Создание и сохранение объекта Order в базу данных
        Order order = new Order();
        order.setFullName(fullName);
        orderRepository.save(order);

        return "???"; // Редирект на страницу успешного сохранения
    }
    @GetMapping("/??")
    public String saveOrderStart(@RequestParam("fullName") String fullName) {
        // Создание и сохранение объекта Order в базу данных
        Order order = new Order();
        order.setFullName(fullName);
        orderRepository.save(order);

        return "???"; // Редирект на страницу успешного сохранения
    }
    @PostMapping("/employment")
    public String processPrint(@RequestParam("fullName") String fullName,
                               Model model) {
        model.addAttribute("fullName", fullName);
        return "Dok/employment"; // Вернуть имя представления "panel" для отображения страницы employment.html
    }
    @PostMapping("/holiday")
    public String processPrint2(@RequestParam("fullName") String fullName,
                               Model model) {
        model.addAttribute("fullName", fullName);
        return "Dok/holiday"; // Вернуть имя представления "panel" для отображения страницы holiday.html
    }
    @PostMapping("/dismissal")
    public String processPrint3(@RequestParam("fullName") String fullName,
                                Model model) {
        model.addAttribute("fullName", fullName);
        return "Dok/dismissal"; // Вернуть имя представления "panel" для отображения страницы dismissal.html
    }*/
}


