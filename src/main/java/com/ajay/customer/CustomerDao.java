package com.ajay.customer;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomerById(Long id);

    void insertCustomer(Customer customer);
    boolean exitsPersonWithEmail(String email);

    boolean existsPersonWithId(Long id);
    void deleteCustomerById(Long customerId);

    void updateCustomer(Customer update);


}
