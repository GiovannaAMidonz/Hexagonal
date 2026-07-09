package com.cap.hexagonal.application.ports.in;

import com.cap.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}
