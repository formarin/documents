package com.example.documents.models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface usersRepository extends JpaRepository<users, Long> {
    
}
