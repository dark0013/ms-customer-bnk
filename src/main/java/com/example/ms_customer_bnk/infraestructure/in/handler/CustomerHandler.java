package com.example.ms_customer_bnk.infraestructure.in.handler;

import com.example.ms_customer_bnk.domain.port.in.ICustomerServicePort;
import com.example.ms_customer_bnk.infraestructure.in.dto.CustomerDto;
import com.example.ms_customer_bnk.infraestructure.in.mapper.ICustomerMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerHandler {
    private final ICustomerServicePort customerService;
    private final ICustomerMapper customerMapper;

    public CustomerHandler(ICustomerServicePort customerService, ICustomerMapper customerMapper) {
        this.customerService = customerService;
        this.customerMapper = customerMapper;
    }


    public List<CustomerDto> findAllCustomers() {
        return customerService.findAllCustomers()
                .stream()
                .map(customerMapper::toDto)
                .toList();
    }


    public CustomerDto findCustomerById(Integer id) {
        return customerMapper.toDto(customerService.findCustomerById(id)) ;
    }


    public CustomerDto saveCustomer(CustomerDto customer) {
        return customerMapper.toDto(customerService.saveCustomer(customerMapper.toDomain(customer)));
    }


    public CustomerDto updateCustomer(CustomerDto customer) {
        return customerMapper.toDto(customerService.saveCustomer(customerMapper.toDomain(customer)));
    }

    public void deleteCustomer(Integer id) {
        customerService.deleteCustomer(id);
    }
}
