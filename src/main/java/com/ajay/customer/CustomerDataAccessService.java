package com.ajay.customer;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDataAccessService implements CustomerDao {

    // db
    private static List<Customer> customers;

    static {
        customers = new ArrayList<>();

        Customer mike = new Customer(1L, "mike", "mike@gmail.com", 23);
        customers.add(mike);
        Customer eleven = new Customer(2L, "Eleven", "eleven@gmail.com", 21);
        customers.add(eleven);
    }

    @Override
    public List<Customer> selectAllCustomers() {
        return customers;
    }

    @Override
    public Optional<Customer> selectCustomerById(Long id) {
        return customers.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst();
    }
}
