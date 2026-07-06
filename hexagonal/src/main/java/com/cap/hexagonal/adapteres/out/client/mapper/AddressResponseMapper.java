package com.cap.hexagonal.adapteres.out.client.mapper;

import com.cap.hexagonal.adapteres.out.client.response.AddressResponse;
import com.cap.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
