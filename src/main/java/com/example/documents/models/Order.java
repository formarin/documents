package com.example.documents.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numbOrder;

    @Nullable
    private LocalDate dateEmployment;

    @Nullable
    private LocalDate dateDismissal;

    @Nullable
    private LocalDate dateStart;

    @Nullable
    private LocalDate dateEnd;

    @Nullable
    private LocalDate dateSigning;

    @Enumerated(EnumType.STRING)
    private StatusEnum status;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private OrderType orderType;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
