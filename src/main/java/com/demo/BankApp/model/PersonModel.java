package com.demo.BankApp.model;

import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//For ORM
@Entity
@Table (name = "person")
public class PersonModel
{
    //Attributes
    @Id
    @Column(name = "person_id")
    private long id;
    private String name;
    private String lastName;
    private String address;
    private String email;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date birthday;

//    @OneToOne(mappedBy = "mPerson")
//    private CustomerModel customerModels = new CustomerModel();

    //Constructor
    public PersonModel(){}

    public PersonModel(long id, String name, String lastName, String address, String email, Date birthday)
    {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.birthday = birthday;
    }

    //Setter and getter
    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getMailAddress()
    {
        return email;
    }

    public void setMailAddress(String email)
    {
        this.email = email;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

//    public CustomerModel getCustomerModels() {
//        return customerModels;
//    }
//
//    public void setCustomerModels(CustomerModel customerModels) {
//        this.customerModels = customerModels;
//    }

    //Extra methods
}