package com.mx.examen.shopping.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "orders")
@Setter
@Getter
public class OrdersModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "order_num")
    private Integer orderNum;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "customer_id")
    private UUID customerId;
}
