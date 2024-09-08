package org.dbr.customer.application;

import org.dbr.customer.application.port.CustomerRepositoryPort;
import org.dbr.customer.domain.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    private final CustomerRepositoryPort customerRepositoryPort;

    public CustomerService(CustomerRepositoryPort customerRepositoryPort) {
        this.customerRepositoryPort = customerRepositoryPort;
    }

    public Customer createCustomer(Customer customer) {
        return customerRepositoryPort.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepositoryPort.findAll();
    }

    public Optional<Customer> getCustomerById(Long id) {
        return customerRepositoryPort.findById(id);
    }

    public void deleteCustomer(Long id) {
        customerRepositoryPort.deleteById(id);
    }
}