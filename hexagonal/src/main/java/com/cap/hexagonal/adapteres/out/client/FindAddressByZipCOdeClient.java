package com.cap.hexagonal.adapteres.out.client;

import com.cap.hexagonal.adapteres.out.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindAddressByZipCOdeClient",
        url = "${arantes.client.address.url}"
)
public interface FindAddressByZipCOdeClient {
    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode")String zipCode);

}
