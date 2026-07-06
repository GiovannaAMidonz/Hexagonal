package com.cap.hexagonal.adapteres.out.repository.mapper;

import com.cap.hexagonal.adapteres.out.repository.entity.CustomerEntity;
import com.cap.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);

}
