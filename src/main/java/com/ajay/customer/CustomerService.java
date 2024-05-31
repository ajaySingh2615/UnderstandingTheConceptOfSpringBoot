package com.ajay.customer;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerDao customerDao;

    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> getAllCustomer(){
        return customerDao.selectAllCustomers();
    }

    public Customer getCustomerId(Long id){
        return customerDao.selectCustomerById(id)
                .orElseThrow(() -> new IllegalArgumentException("Customer with id [%s]".formatted(id)));
    }
}
