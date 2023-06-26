package com.example.documents.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
@Data

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer numbOrder;
    private Long idEmployees;
    private String typeOrder;
    private String fullName;
    private LocalDate dateEmployment;
    private LocalDate dateDismissal;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private String status;
}
