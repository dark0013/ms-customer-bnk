package com.example.ms_customer_bnk.infraestructure.in.controller;

import com.example.ms_customer_bnk.infraestructure.in.dto.CustomerDto;
import com.example.ms_customer_bnk.infraestructure.in.handler.CustomerHandler;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")

public class CustomerController {
    private final CustomerHandler customerHandler;

    public CustomerController(CustomerHandler customerHandler) {
        this.customerHandler = customerHandler;
    }

    @GetMapping
    public List<CustomerDto> finAllCustomer(){
        return customerHandler.findAllCustomers();
    }

    @GetMapping("/{id}")
    public CustomerDto findCustomerById(@PathVariable Integer id){
    return customerHandler.findCustomerById(id);
    }

    @PostMapping
    public CustomerDto saveCustomer(@RequestBody CustomerDto customer){
        return customerHandler.saveCustomer(customer);
    }

    @PutMapping
    public CustomerDto updateCustomer(@RequestBody CustomerDto customer){
        return customerHandler.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable Integer id){
         customerHandler.deleteCustomer(id);
    }
}
