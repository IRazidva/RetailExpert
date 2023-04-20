package com.example.retailexpert4.service;

import com.example.retailexpert4.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    Customer add(Customer customer);
    Customer getCustomerByAddress(String address);
    Customer edit(Customer customer);
    void deleteCustomerByAddress(String address);
    void  deleteCustomerById(Integer idCustomer);
}
