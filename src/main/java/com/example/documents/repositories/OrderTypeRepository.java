package com.example.documents.repositories;

import com.example.documents.models.OrderType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderTypeRepository extends JpaRepository<OrderType, Long> {

}
