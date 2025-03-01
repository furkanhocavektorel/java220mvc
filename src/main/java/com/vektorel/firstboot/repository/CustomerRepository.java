package com.vektorel.firstboot.repository;

import com.vektorel.firstboot.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    Customer findByEmailAndPassword(String x,String y);

}
