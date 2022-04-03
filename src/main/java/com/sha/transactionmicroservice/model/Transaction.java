package com.sha.transactionmicroservice.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "Transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "userId", nullable = false)
    private Long userId;

    @Column(name="productId", nullable = false)
    private Long productId;

    @Column(name="transactionTime")
    private LocalDateTime transactionTime;

}
