package com.cap.hexagonal.application.core.usecase;

import com.cap.hexagonal.application.core.domain.Customer;
import com.cap.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.cap.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase {

    private  final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;


    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
    }

    public void insert(Customer custumer, String zipCode){

        var address =  findAddressByZipCodeOutputPort.find(zipCode);
        custumer.setAddress(address);
        insertCustomerOutputPort.insert(custumer);

    }
}
