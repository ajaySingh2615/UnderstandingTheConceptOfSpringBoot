package com.ajay.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/api/v1/customers")
    public List<Customer> getCustomers() {
        return customerService.getAllCustomer();
    }

    @GetMapping("/api/v1/customers/{customerId}")
    public Customer getCustomer(@PathVariable(value = "customerId", required = false) Long id) {
        return customerService.getCustomerId(id);
    }
}
