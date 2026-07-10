package com.cap.hexagonal.application.core.usecase;

import com.cap.hexagonal.application.core.domain.Customer;
import com.cap.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.cap.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.cap.hexagonal.application.ports.out.InsertCustomerOutputPort;
import com.cap.hexagonal.application.ports.out.SendCpfValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private  final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final InsertCustomerOutputPort insertCustomerOutputPort;

    private final SendCpfValidationOutputPort sendCpfValidationOutputPort;

    public InsertCustomerUseCase(
            FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
            InsertCustomerOutputPort insertCustomerOutputPort,
            SendCpfValidationOutputPort sendCpfValidationOutputPort

    ) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfValidationOutputPort = sendCpfValidationOutputPort;

    }
    @Override
    public void insert(Customer custumer, String zipCode){

        var address =  findAddressByZipCodeOutputPort.find(zipCode);
        custumer.setAddress(address);
        insertCustomerOutputPort.insert(custumer);
        sendCpfValidationOutputPort.send(custumer.getCPF());
    }


}
