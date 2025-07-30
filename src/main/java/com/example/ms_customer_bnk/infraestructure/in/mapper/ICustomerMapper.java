package com.example.ms_customer_bnk.infraestructure.in.mapper;

import com.example.ms_customer_bnk.domain.model.Customer;
import com.example.ms_customer_bnk.infraestructure.in.dto.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICustomerMapper {
    CustomerDto toDto(Customer customer);

    Customer toDomain(CustomerDto customer);
}
