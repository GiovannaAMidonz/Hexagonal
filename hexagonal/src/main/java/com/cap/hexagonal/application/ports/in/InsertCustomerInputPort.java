package com.cap.hexagonal.application.ports.in;

import com.cap.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
