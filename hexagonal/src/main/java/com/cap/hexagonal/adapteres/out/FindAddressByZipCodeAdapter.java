package com.cap.hexagonal.adapteres.out;

import com.cap.hexagonal.adapteres.out.client.FindAddressByZipCOdeClient;
import com.cap.hexagonal.adapteres.out.client.mapper.AddressResponseMapper;
import com.cap.hexagonal.adapteres.out.client.response.AddressResponse;
import com.cap.hexagonal.application.core.domain.Address;
import com.cap.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCOdeClient findAddressByZipCOdeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findAddressByZipCOdeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
