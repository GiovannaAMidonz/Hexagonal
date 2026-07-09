package com.cap.hexagonal.config;

import com.cap.hexagonal.adapteres.out.FindAddressByZipCodeAdapter;
import com.cap.hexagonal.adapteres.out.FindCustomerByIdAdapter;
import com.cap.hexagonal.adapteres.out.UpdateCustomerAdapter;
import com.cap.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.cap.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase,findAddressByZipCodeAdapter,updateCustomerAdapter);
    }
}
