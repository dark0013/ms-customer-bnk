package com.example.ms_customer_bnk.application.service;

import com.example.ms_customer_bnk.application.exception.CustomerNotFoundException;
import com.example.ms_customer_bnk.domain.model.Customer;
import com.example.ms_customer_bnk.domain.port.in.ICustomerServicePort;
import com.example.ms_customer_bnk.domain.port.out.ICustomerRepositoryPort;

import java.util.List;

public class CustomerService implements ICustomerServicePort {
    private final ICustomerRepositoryPort customerRepositoryPort;

    public CustomerService(ICustomerRepositoryPort customerRepositoryPort) {
        this.customerRepositoryPort = customerRepositoryPort;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return this.customerRepositoryPort.findAllCustomers();
    }

    @Override
    public Customer findCustomerById(Integer id) {
        return this.customerRepositoryPort.findCustomerById(id).orElseThrow(()->new CustomerNotFoundException("NO CUSTOMERS FOUND"));
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return this.customerRepositoryPort.saveCustomer(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return this.customerRepositoryPort.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Integer id) {
        this.customerRepositoryPort.deleteCustomer(id);
    }
}
