package com.cap.hexagonal.adapteres.in.consumer.message;

import com.cap.hexagonal.application.core.domain.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerMessage {

    private String ID;
    private String name;
    private Address address;
    private String CPF;
    private Boolean isValidCpf;

}
