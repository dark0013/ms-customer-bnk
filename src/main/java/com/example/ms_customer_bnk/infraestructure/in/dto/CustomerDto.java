package com.example.ms_customer_bnk.infraestructure.in.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {
    private Integer id;
    private String name;
    private String gender;
    private Integer age;
    private String identification;
    private String address;
    private String telephone;

}
