package com.demo.BankApp.repository;

import com.demo.BankApp.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerModel, Long>
{
}
