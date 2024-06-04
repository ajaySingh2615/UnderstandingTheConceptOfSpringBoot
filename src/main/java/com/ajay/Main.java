package com.ajay;

import com.ajay.customer.Customer;
import com.ajay.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository) {
        return args -> {
            Customer mike = new Customer("mike", "mike@gmail.com", 23);
            Customer eleven = new Customer("Eleven", "eleven@gmail.com", 21);

            List<Customer> customers = List.of(mike, eleven);
//            customerRepository.saveAll(customers);
        };

    }
}
