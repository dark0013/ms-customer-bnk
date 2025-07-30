package com.example.ms_customer_bnk.infraestructure.in.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.ms_customer_bnk.application.service",
        includeFilters = {
                @ComponentScan.Filter(type = org.springframework.context.annotation.FilterType.REGEX, pattern = "^.+Service")
        } )
public class BeanConfiguration {
}
