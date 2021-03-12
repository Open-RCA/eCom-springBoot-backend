package com.openrca.ecommerce.controller;

import com.openrca.ecommerce.model.Customer;
import com.openrca.ecommerce.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Optional;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/customer")
    public Customer addCustomerDetails(@RequestBody Customer admin){
        return customerRepository.save(admin);
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerById(@PathVariable Long id){
        return customerRepository.findById(id).
                orElseThrow(()-> new HttpClientErrorException(HttpStatus.NOT_FOUND));
    }


    @PutMapping("/customer/{id}")
    public ResponseEntity<Customer> updateCustomerById(@PathVariable Long id, @RequestBody Customer customer){

        Optional<Customer> customerData = customerRepository.findById(id);

        if( customerData.isPresent() ){
            Customer _customer = customerData.get();
            _customer.setCustomerId(customer.getCustomerId());
            _customer.setFirstName(customer.getFirstName());
            _customer.setSecondName(customer.getSecondName());
            _customer.setUsername(customer.getUsername());
            _customer.setPassword(customer.getPassword());
            _customer.setBillingAddress(customer.getBillingAddress());
            _customer.setDefaultShippingAddress(customer.getDefaultShippingAddress());
            _customer.setCountry(customer.getCountry());
            _customer.setPhone(customer.getPhone());

            return new ResponseEntity<>(customerRepository.save(_customer), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/customer/{id}")
    public void deleteCustomerById(@PathVariable Long id){
        customerRepository.deleteById(id);
    }


}
