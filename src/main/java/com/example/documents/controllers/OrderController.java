package com.example.documents.controllers;

import com.example.documents.models.Order;
import com.example.documents.modelsDTO.OrderCardDto;
import com.example.documents.modelsDTO.OrderDto;
import com.example.documents.modelsDTO.OrderDtoForJournal;
import com.example.documents.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ModelAndView getAllOrders(Model model) {
        model.addAttribute("orderList", orderService.getAllSignedOrders());
        return new ModelAndView("orderTypes");
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderDtoForJournal> getOrder(@PathVariable Long id) {
        return new ResponseEntity<>(orderService.getOrder(id), HttpStatus.OK);
    }

    @GetMapping("/user{id}")
    public ModelAndView getOrdersByUserId(@PathVariable Long id, Model model) {
        model.addAttribute("cardList",orderService.getOrdersByUserId(id));
        return new ModelAndView("orderCards");
    }

    @PostMapping
    public ResponseEntity<Long> addOrder(@ModelAttribute OrderDto orderDto) {
        // Ваш код обработки и сохранения данных в базу
        Long orderId = orderService.addOrder(orderDto);
        return new ResponseEntity<>(orderId, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Long> updateOrder(@RequestBody Order order) {
        return new ResponseEntity<>(orderService.updateOrder(order), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteOrder(@PathVariable Long id) {
        orderService.deleteOrder(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
