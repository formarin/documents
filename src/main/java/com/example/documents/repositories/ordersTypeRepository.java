package com.example.documents.repositories;

import com.example.documents.models.ordersType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ordersTypeRepository extends JpaRepository<ordersType, Long> {

}
