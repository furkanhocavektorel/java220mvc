package com.vektorel.firstboot.service;

import com.vektorel.firstboot.entity.Admin;
import com.vektorel.firstboot.entity.Customer;
import com.vektorel.firstboot.models.RegisterModel;
import com.vektorel.firstboot.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void saveCustomer(RegisterModel model){

        Customer customer= new Customer();
        customer.setName(model.getName());
        customer.setSurname(model.getSurname());
        customer.setEmail(model.getMail());
        customer.setPassword(model.getPass());
        customerRepository.save(customer);

    }


    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }


}
