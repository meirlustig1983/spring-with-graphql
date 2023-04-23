package com.ml.springwithgraphql.data.dto;

import jakarta.persistence.*;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Data
@Accessors(chain = true)
@Entity
@Table(name = "PRODUCTS")
public class Product {
    @Id
    @Column(name = "PRODUCT_ID")
    private String id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SIZE")
    private int size;
    @Column(name = "VARIETY")
    private String variety;
    @Column(name = "PRICE")
    private BigDecimal price;
    @Column(name = "STATUS")
    private String status;
}