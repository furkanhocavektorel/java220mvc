package com.vektorel.firstboot.controller;

import com.vektorel.firstboot.entity.Customer;
import com.vektorel.firstboot.service.CustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("customer")
// localhost:8081/customer
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    // localhost:8081/customer/getAll
    @GetMapping("getAll")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomers();
    }


}
