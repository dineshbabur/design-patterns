package org.dbr.customer.application.port;

import org.dbr.customer.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepositoryPort {
    Customer save(Customer customer);

    List<Customer> findAll();

    Optional<Customer> findById(Long id);

    void deleteById(Long id);
}