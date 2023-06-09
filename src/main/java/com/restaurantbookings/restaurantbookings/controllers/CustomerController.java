package com.restaurantbookings.restaurantbookings.controllers;

import com.restaurantbookings.restaurantbookings.models.Customer;
import com.restaurantbookings.restaurantbookings.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value="/name/{name}")
    public List<Customer> getCustomerByName(@PathVariable String name){
        return customerRepository.findCustomerByName(name);
    }

    @GetMapping(value="/{id}")
    public List<Customer> getCustomerById(@PathVariable Long id){
        return customerRepository.findCustomerById(id);
    }

    @GetMapping(value="/frequency")
    public List<Customer> getAllCustomersOrderByCountBookings(){
        return customerRepository.findAllByBookings();
    }

}
