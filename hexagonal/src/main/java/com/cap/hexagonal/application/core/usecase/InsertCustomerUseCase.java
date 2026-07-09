package com.cap.hexagonal.application.core.usecase;

import com.cap.hexagonal.application.core.domain.Customer;
import com.cap.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.cap.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.cap.hexagonal.application.ports.out.InsertCustomerOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

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

    public void insertCustomer(Customer customer, String zipCode) {
        var address =  findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
    }
}
