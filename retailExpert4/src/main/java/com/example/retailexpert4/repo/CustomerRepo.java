package com.example.retailexpert4.repo;

import com.example.retailexpert4.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    Customer findCustomerByAddress(String address);
    void deleteCustomersByAddress(String address);
}
