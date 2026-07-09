package com.cap.hexagonal.adapteres.in.controller.mapper;

import com.cap.hexagonal.adapteres.in.controller.request.CustomerRequest;
import com.cap.hexagonal.adapteres.in.controller.response.CustomerResponse;
import com.cap.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "isValidCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);

}
