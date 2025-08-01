package com.example.ms_customer_bnk.infraestructure.out.persistence.adapter;

import com.example.ms_customer_bnk.domain.model.Customer;
import com.example.ms_customer_bnk.domain.port.out.ICustomerRepositoryPort;
import com.example.ms_customer_bnk.infraestructure.out.persistence.entity.CustomerEntity;
import com.example.ms_customer_bnk.infraestructure.out.persistence.mapper.ICustomerRepositoryMapper;
import com.example.ms_customer_bnk.infraestructure.out.persistence.repository.ICustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CustomerRepositoryAdapter implements ICustomerRepositoryPort {

    private final ICustomerRepository customerRepository;
    private final ICustomerRepositoryMapper customerMapper;

    public CustomerRepositoryAdapter(ICustomerRepository customerRepository, ICustomerRepositoryMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll()
                .stream()
                .map(customerMapper::toDomain)
                .toList();
    }

    @Override
    public Optional<Customer> findCustomerById(Integer id) {
        return customerRepository.findById(id).map(customerMapper::toDomain);
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        CustomerEntity customerEntity = this.customerRepository.save(customerMapper.toEntity(customer));
        return customerMapper.toDomain(customerEntity);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        CustomerEntity customerEntity = this.customerRepository.save(customerMapper.toEntity(customer));
        return customerMapper.toDomain(customerEntity);
    }

    @Override
    public void deleteCustomer(Integer id) {
        this.customerRepository.deleteById(id);
    }
}
