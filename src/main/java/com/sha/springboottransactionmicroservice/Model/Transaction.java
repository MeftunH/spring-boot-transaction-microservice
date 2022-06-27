package com.sha.springboottransactionmicroservice.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id",nullable = false)
    private Long userId;

    @Column(name = "product_Id",nullable = false)
    private Long productId;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
