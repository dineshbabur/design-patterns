package org.dbr.customer.adapter;

import org.dbr.customer.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataCustomerRepository extends JpaRepository<Customer, Long> {
}
