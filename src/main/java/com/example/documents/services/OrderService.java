package com.example.documents.services;

import com.example.documents.exceptions.UserAlreadyExistsException;
import com.example.documents.models.Order;
import com.example.documents.models.User;
import com.example.documents.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
private final OrderRepository orderRepository;
@Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
public List<Order> getAllOrders() {
    return orderRepository.findAll();
}
public Order getOrder(Long id) {
    return orderRepository.findById(id).get();
}
    public Long updateOrder(Order order) {
        return orderRepository.save(order).getId();
    }
    public Long addOrder(Order order) {
        return orderRepository.save(order).getId();
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}
