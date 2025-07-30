package com.example.ms_customer_bnk.domain.port.out;

import com.example.ms_customer_bnk.domain.model.Customer;

import java.util.List;

public interface ICustomerRepositoryPort {
    List<Customer> getFindAllCustomers();

    Customer findCustomerById(Integer id);

    Customer saveCustomer(Customer customer);

    Customer updateCustomer(Customer customer);

    void deleteCustomer(Integer id);
}
