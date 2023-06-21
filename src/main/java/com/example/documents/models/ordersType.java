package com.example.documents.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
@Data
public class ordersType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTypeOrder;
    private String nameOrder;
    //private shablon???
    //private Logicname???
}
