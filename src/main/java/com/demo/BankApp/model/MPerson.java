package com.demo.BankApp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

//For ORM
@Entity
@Table (name = "person")
public class MPerson
{
    //Attributes
    @Id
    private long id;
    private String name;
    private String lastName;
    private String address;
    private String mailAddress;
    private Date birthday;

    //Constructor
    public MPerson(){}

    public MPerson(long id, String name, String lastName, String address, String mailAddress, Date birthday)
    {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.mailAddress = mailAddress;
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
        return mailAddress;
    }

    public void setMailAddress(String mailAddress)
    {
        this.mailAddress = mailAddress;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday(Date birthday)
    {
        this.birthday = birthday;
    }

    //Extra methods
}