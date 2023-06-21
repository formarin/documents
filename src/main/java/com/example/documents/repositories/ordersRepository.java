package com.example.documents.repositories;

import com.example.documents.models.orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface ordersRepository extends JpaRepository<orders, Long> {

}
