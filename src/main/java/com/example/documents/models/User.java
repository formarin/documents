package com.example.documents.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployees;
    private String jobTitle;
    private String subdivision;
    private String fullName;
    private String login;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Order> orders;
}
