package com.vektorel.firstboot.service;

import com.vektorel.firstboot.entity.Admin;
import com.vektorel.firstboot.entity.Customer;
import com.vektorel.firstboot.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void saveCustomer(String name,String surname,String email,String password,String username){

        Customer customer= new Customer();
        customer.setName(name);
        customer.setUsername(surname);
        customer.setUsername(username);
        customer.setEmail(email);
        customer.setPassword(password);

        customerRepository.save(customer);

    }


    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }


}
