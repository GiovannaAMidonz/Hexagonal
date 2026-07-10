package com.cap.hexagonal.adapteres.in.consumer.mapper;

import com.cap.hexagonal.adapteres.in.consumer.message.CustomerMessage;
import com.cap.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
