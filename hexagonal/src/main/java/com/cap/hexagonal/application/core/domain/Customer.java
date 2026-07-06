package com.cap.hexagonal.application.core.domain;

public class Customer {
    private String ID;
    private String name;
    private Address address;
    private String CPF;
    private Boolean isValidCpf;

    public Customer() {
        this.isValidCpf = false;
    }

    public Customer(String ID, String name, Address address, String CPF, Boolean isValidCpf) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.CPF = CPF;
        this.isValidCpf = isValidCpf;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
}
