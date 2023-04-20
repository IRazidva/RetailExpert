package com.example.retailexpert4.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name="actuals")
public class Actuals {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_actuals")
    private Integer idActuals;

    Date date;
    Integer getMaterialNo();

//    Customer customer;

    String chainName;

}
