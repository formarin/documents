package com.example.documents.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface ordersRepository extends JpaRepository<orders, Long> {

}
