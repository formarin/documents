//package com.example.documents.controllers;
//
//import com.example.documents.services.OrderService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//
//@Controller
//public class OrderTypeController {
//    private final OrderService orderService;
//
//    @Autowired
//
//    public OrderTypeController(OrderService orderService) {
//        this.orderService = orderService;
//    }
//
//    @PostMapping("/orderTypes")
//       public ModelAndView getAllOrders(Model model) {
//        OrderService orderService = null;
//        model.addAttribute("orderList", orderService.getAllSignedOrders());
//        return new ModelAndView("orderTypes");
//    }
//}
