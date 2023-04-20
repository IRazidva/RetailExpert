package com.example.retailexpert4.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "price")
public class Price {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_price")
    private Integer id_price;

//    @OneToMany(mappedBy = "price")
//    private List<Actuals> actuals;
//
    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id_product", referencedColumnName = "id_product")
    private Integer materialNo();

    @Column(name = "value_regular")
    private Integer valueRegular;

    public Price() {
    }
}
