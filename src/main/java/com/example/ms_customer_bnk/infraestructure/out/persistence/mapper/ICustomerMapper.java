package com.example.ms_customer_bnk.infraestructure.out.persistence.mapper;

import com.example.ms_customer_bnk.domain.model.Customer;
import com.example.ms_customer_bnk.infraestructure.out.persistence.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ICustomerMapper {
    Customer toDomain(CustomerEntity customerEntity);

    CustomerEntity toEntity(Customer customer);
}
