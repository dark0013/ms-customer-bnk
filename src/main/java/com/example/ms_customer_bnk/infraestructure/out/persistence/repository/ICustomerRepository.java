package com.example.ms_customer_bnk.infraestructure.out.persistence.repository;

import com.example.ms_customer_bnk.infraestructure.out.persistence.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerRepository extends JpaRepository <CustomerEntity,Integer> {
}
