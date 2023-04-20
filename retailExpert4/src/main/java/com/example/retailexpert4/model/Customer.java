package com.example.retailexpert4.model;

import javax.persistence.*;

@Entity
@Table(name ="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_customer")
    private Integer id;

    @Column(name = "address")
    private String address;

    @Column(name = "network_name")
    private String networkName;

    public Customer() {
    }

    public Customer(Integer id, String address, String networkName) {
        this.id = id;
        this.address = address;
        this.networkName = networkName;
    }
    public Integer getId_customer() {
        return id;
    }

    public void setId_customer(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }
}
