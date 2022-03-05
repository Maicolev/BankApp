package com.demo.BankApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "customer")
public class MCustomer
{
    @Id
    private long id;
}
