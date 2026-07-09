package com.cap.hexagonal.application.core.usecase;

import com.cap.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.cap.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;

    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort
    ) {
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    @Override
    public void delete(String id){
    findCustomerByIdUseCase.find(id);
    deleteCustomerByIdOutputPort.delete(id);
    }


}
