package com.example.retailexpert4.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.*;

@Data
@Getter
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_product")
    private Integer idProduct;
    private Integer materialNo;
    private String  materialDescRus;
    private Integer L3ProductCategoryCode;
    private String  L3ProductCategoryName;
}
