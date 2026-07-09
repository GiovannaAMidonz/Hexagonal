package com.cap.hexagonal.config;

import com.cap.hexagonal.adapteres.out.DeleteCustomerByIdAdapter;
import com.cap.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.cap.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
        FindCustomerByIdUseCase findCustomerByIdUseCase,
        DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ){
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
