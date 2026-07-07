package com.cap.hexagonal.application.ports.out;

import com.cap.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

        Optional<Customer> find(String id);

}
