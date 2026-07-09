package com.cap.hexagonal.adapteres.in.controller.response;

import com.cap.hexagonal.application.core.domain.Address;
import lombok.Data;

@Data
public class CustomerResponse {

    private String name;

    private Address address;

    private String CPF;

    private Boolean isValidCpf;

}
