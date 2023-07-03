package com.example.documents.services;

import com.example.documents.models.Order;
import com.example.documents.models.StatusEnum;
import com.example.documents.modelsDTO.OrderDto;
import com.example.documents.modelsDTO.OrderDtoForJournal;
import com.example.documents.repositories.OrderRepository;
import com.example.documents.repositories.OrderTypeRepository;
import com.example.documents.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<OrderDtoForJournal> getAllSignedOrders() {
        List<Order> orders = orderRepository.findByStatus(StatusEnum.PROCESSED);
        return orders.stream()
                .map(this::mapToOrderGetDto)
                .sorted(Comparator.comparing(OrderDtoForJournal::numbOrder))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersByUserId(Long id) {
        return orderRepository.findByUserId(id);
    }

    public OrderDtoForJournal getOrder(Long id) {
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
        order.setStatus(StatusEnum.PROCESSED);

        order.setOrderType(orderTypeRepository.findById(orderDto.orderTypeId()).get());
        order.setUser(userRepository.findById(orderDto.userId()).get());

        return order;
    }

    private OrderDtoForJournal mapToOrderGetDto(Order order) {
        String orderType = order.getOrderType() != null ? order.getOrderType().getType() : "";
        String userFullName = order.getUser() != null ? order.getUser().getFullName() : "";

        return new OrderDtoForJournal(
                order.getNumbOrder(),
                order.getDateEmployment(),
                order.getDateDismissal(),
                order.getDateStart(),
                order.getDateEnd(),
                order.getDateSigning(),
                orderType,
                userFullName
        );
    }
}
