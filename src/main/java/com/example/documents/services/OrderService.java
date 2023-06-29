package com.example.documents.services;

import com.example.documents.models.Order;
import com.example.documents.models.StatusEnum;
import com.example.documents.modelsDTO.OrderDto;
import com.example.documents.modelsDTO.OrderDtoGet;
import com.example.documents.repositories.OrderRepository;
import com.example.documents.repositories.OrderTypeRepository;
import com.example.documents.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderTypeRepository orderTypeRepository;
    private final UserRepository userRepository;

    @Autowired
    public OrderService(
            OrderRepository orderRepository,
            OrderTypeRepository orderTypeRepository,
            UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.orderTypeRepository = orderTypeRepository;
        this.userRepository = userRepository;
    }

    public List<Order> getAllSignedOrders() {
        return orderRepository.findByStatus(StatusEnum.PROCESSED);
    }

    public List<Order> getOrdersByUserId(Long id) {
        return orderRepository.findByUserId(id);
    }

    public OrderDtoGet getOrder(Long id) {
        Order order = orderRepository.findById(id).get();

        return mapToOrderGetDto(order);
    }

    public Long updateOrder(Order order) {
        return orderRepository.save(order).getId();
    }

    public Long addOrder(OrderDto orderDto) {
        return orderRepository.save(mapToOrder(orderDto)).getId();
    }

    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }

    private Order mapToOrder(OrderDto orderDto) {
        Order order = new Order();
        order.setNumbOrder(orderDto.numbOrder());

        //TODO: добавить проверку на заполненность полей
        order.setDateEmployment(orderDto.dateEmployment());
        order.setDateDismissal(orderDto.dateDismissal());
        order.setDateStart(orderDto.dateStart());
        order.setDateEnd(orderDto.dateEnd());
        //order.setDateSigning(orderDto.dateSigning());

        order.setOrderType(orderTypeRepository.findById(orderDto.orderTypeId()).get());
        order.setUser(userRepository.findById(orderDto.userId()).get());

        return order;
    }

    private OrderDtoGet mapToOrderGetDto(Order order) {
        return new OrderDtoGet(
                order.getNumbOrder(),
                order.getDateEmployment(),
                order.getDateDismissal(),
                order.getDateStart(),
                order.getDateEnd(),
                order.getDateSigning(),
                order.getOrderType().getType(),
                order.getUser().getFullName()
        );
    }
}
