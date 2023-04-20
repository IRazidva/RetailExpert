package com.example.retailexpert4.controller;

import com.example.retailexpert4.model.Customer;
import com.example.retailexpert4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/finance")
public class FinanceController {
    private final CustomerService customerService;

    @Autowired
    public FinanceController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/ret")
    public String sey(){
        return "Hello";
    }

    @GetMapping("/allCustomers")
    private List<Customer> allCustomer(){
        return customerService.getAllCustomers();
    }

    //    @GetMapping("/{address}")
    @GetMapping
//    private Customer getCustomerByAddress(@PathVariable("address") String address){
    private Customer getCustomerByAddress(@RequestParam String address){
        return  customerService.getCustomerByAddress(address);
    }

    @PostMapping
    public Customer add(@RequestBody Customer customer){
        return customerService.add(customer);
    }
    @PutMapping
    public Customer edit(@RequestBody Customer customer){
        return customerService.edit(customer);
    }

    //    @DeleteMapping("/{id_customer}")
//    private void deleteCustomerById_customer (@PathVariable("id_customer") Integer id_customer){
    @DeleteMapping("/id")
    private void deleteCustomerById_customer (@RequestParam Integer id_customer){
        customerService.deleteCustomerById(id_customer);
    }

    //    @DeleteMapping("/{address}")
//    private void deleteCustomerByAddress (@PathVariable("address") String address){
    @DeleteMapping("/address")
    private void deleteCustomerByAddress (@RequestParam String address){
        customerService.deleteCustomerByAddress(address);
    }
}
