package com.example.rediscaching.domain;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.cache.annotation.EnableCaching;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EnableCaching
@Table(name = "orders")
public class Order {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Integer id;

    private String orderCode;
    private String orderObject;
    private String orderStatus;
    private Integer orderPrice;

}
