package com.example.documents.controllers;

import com.example.documents.models.Order;
import com.example.documents.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class ControllerOrder {
    @Autowired
    private OrderRepository orderRepository;
    @GetMapping("/employment")
    public Optional<Order> getOrderByDateEmployment(@RequestParam("dateEmployment") LocalDate dateEmployment) {
        return orderRepository.findByDateEmployment(dateEmployment);
    }
    @GetMapping("/dismissal")
    public Optional<Order> getOrderByDateDismissal(@RequestParam("dateDismissal") LocalDate dateDismissal) {
        return orderRepository.findByDateDismissal(dateDismissal);
    }
    @GetMapping("/")
    public Optional<Order> getOrderByDateStart(@RequestParam("dateStart") LocalDate dateStart) {
        return orderRepository.findByDateStart(dateStart);
    }
    @GetMapping("/")
    public Optional<Order> getOrderByDateEnd(@RequestParam("dateEnd") LocalDate dateEnd) {
        return orderRepository.findByDateEnd(dateEnd);
    }
}
