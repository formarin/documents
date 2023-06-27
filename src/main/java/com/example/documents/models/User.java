package com.example.documents.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jobTitle;
    private String subdivision;
    private String fullName;
    @Column(unique = true)
    private String email;
    private String password;
    /*@OneToMany(mappedBy = "user")
    private List<Order> orders;*/
}
