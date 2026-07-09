package com.cap.hexagonal.config;

import com.cap.hexagonal.adapteres.out.FindCustomerByIdAdapter;
import com.cap.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(
           FindCustomerByIdAdapter findCustomerByIdAdapter

    ) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }

}
