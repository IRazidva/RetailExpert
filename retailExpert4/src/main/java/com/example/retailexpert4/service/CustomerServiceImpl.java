package com.example.retailexpert4.service;

import com.example.retailexpert4.model.Customer;
import com.example.retailexpert4.repo.CustomerRepo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepo customerRepo;

    public CustomerServiceImpl(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }
    @Override
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }

    @Override
    public Customer add(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Customer getCustomerByAddress(String address) {
        return customerRepo.findCustomerByAddress(address);
    }

    @Override
    public Customer edit(Customer customer) {return customerRepo.save(customer);
    }

    @Override
    public  void  deleteCustomerById(Integer id_customer) {
        customerRepo.deleteById(id_customer);
    }
    //    @Modifying
//    @Query(value = "DELETE FROM Customer c WHERE c.address = :address")
    @Override
    @Transactional
    public void deleteCustomerByAddress(String address) {
        customerRepo.deleteCustomersByAddress(address);
    }
}
