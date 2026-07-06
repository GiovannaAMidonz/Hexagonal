package com.cap.hexagonal.application.ports.out;

import com.cap.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);

}
