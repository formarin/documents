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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numbOrder;
    private Long idEmployees;
    @ManyToOne
    @JoinColumn(name = "typeOrder", referencedColumnName = "typeOrder")
    private OrderType orderType;
    private LocalDate dateEmployment;
    private LocalDate dateDismissal;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private LocalDate dateSigning;
    @Enumerated(EnumType.STRING)
    private StatusEnum status;
    @ManyToOne
    @JoinColumn(name = "idEmployees")
    private User user;
}
