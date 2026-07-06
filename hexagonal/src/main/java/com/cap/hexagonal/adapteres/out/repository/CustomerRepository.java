package com.cap.hexagonal.adapteres.out.repository;

import com.cap.hexagonal.adapteres.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
