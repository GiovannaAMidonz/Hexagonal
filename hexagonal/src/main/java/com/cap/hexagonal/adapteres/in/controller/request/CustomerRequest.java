package com.cap.hexagonal.adapteres.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomerRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String CPF;
    @NotBlank
    private String zipCode;
}
