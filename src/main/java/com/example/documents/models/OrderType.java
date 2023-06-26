package com.example.documents.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orderType")
@Data
public class OrderType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTypeOrder;
    private String nameOrder;
    private String samples;

    //private Logicname???
}
