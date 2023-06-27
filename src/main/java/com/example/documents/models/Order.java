package com.example.documents.models;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Optional;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numbOrder;
    @Column(name = "id_employees")
    private Long idEmployees;
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
    @JoinColumn(name = "type", referencedColumnName = "type")
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private OrderType orderType;
@Column(name = "employee_id")
private Long userId;
    @ManyToOne
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private User user;
    @Setter(AccessLevel.NONE)
    @Transient
    private String fullName;
    @Column(name="type")
    @Transient
    private String type;
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    @PostLoad
    private void initializeFields() {
        fullName = user != null ? user.getFullName() : null;
        type = orderType != null ? orderType.getType() : null;
    }
}
