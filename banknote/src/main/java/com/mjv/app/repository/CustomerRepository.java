package com.mjv.app.repository;

import com.mjv.app.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
