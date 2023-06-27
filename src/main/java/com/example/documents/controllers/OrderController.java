package com.example.documents.controllers;

import com.example.documents.models.Order;
import com.example.documents.models.User;
import com.example.documents.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<List<Order>> getAllOrders() {
        return new ResponseEntity<>(orderService.getAllOrders(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable Long id) {
        return new ResponseEntity<>(orderService.getOrder(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Long> addOrder(@RequestBody Order order) {
        return new ResponseEntity<>(orderService.addOrder(order), HttpStatus.OK);
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
