package com.example.documents.repositories;

import com.example.documents.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findByDateEmployment(LocalDate dateEmployment);
    Optional<Order> findByDateDismissal(LocalDate dateDismissal);
    Optional<Order> findByDateStart(LocalDate dateStart);
//    Optional<Order> findByDateEnd(LocalDate dateEnd);
}
