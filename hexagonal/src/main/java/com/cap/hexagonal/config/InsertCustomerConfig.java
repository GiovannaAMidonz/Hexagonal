package com.cap.hexagonal.config;

import com.cap.hexagonal.adapteres.out.FindAddressByZipCodeAdapter;
import com.cap.hexagonal.adapteres.out.InsertCustomerAdapter;
import com.cap.hexagonal.adapteres.out.SendCpfValidationAdapter;
import com.cap.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendcpfvalidationadapter

    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter,sendcpfvalidationadapter);
    }

}
