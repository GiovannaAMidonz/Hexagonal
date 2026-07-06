package com.cap.hexagonal.application.ports.out;

import com.cap.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);


}
