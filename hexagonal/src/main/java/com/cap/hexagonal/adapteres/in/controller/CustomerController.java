package com.cap.hexagonal.adapteres.in.controller;


import com.cap.hexagonal.adapteres.in.controller.mapper.CustomerMapper;
import com.cap.hexagonal.adapteres.in.controller.request.CustomerRequest;
import com.cap.hexagonal.adapteres.in.controller.response.CustomerResponse;
import com.cap.hexagonal.application.core.domain.Customer;
import com.cap.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.cap.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.cap.hexagonal.application.ports.in.InsertCustomerInputPort;
import com.cap.hexagonal.application.ports.in.UpdateCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api;v1/customers")
public class CustomerController {

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private DeleteCustomerByIdInputPort  deleteCustomerByIdInputPort;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer,customerRequest.getZipCode());
        return ResponseEntity.ok().build();

    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> getById(@PathVariable String id) {
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable String id, @Valid @RequestBody CustomerRequest customerRequest) {
        Customer customer = customerMapper.toCustomer(customerRequest);
        customer.setID(id);
        updateCustomerInputPort.update(customer,customerRequest.getZipCode());

        return  ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        deleteCustomerByIdInputPort.delete(id);
        return  ResponseEntity.noContent().build();
    }
}
