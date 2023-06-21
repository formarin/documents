package com.example.documents.repositories;

import com.example.documents.models.users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface usersRepository extends JpaRepository<users, Long> {

}
