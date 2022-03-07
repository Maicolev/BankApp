package com.demo.BankApp.model;

import javax.persistence.*;
import java.util.Date;

//For ORM
@Entity
@Table (name = "customer")
public class CustomerModel
{
    //Attributes
    @Id
    private long id;
    private Date admissionDate;
    private double borrowingCapacity;

    //Foreign keys
    @OneToOne
    @JoinColumn(name = "person_id")
    private PersonModel mPerson;

    //Constructor
    public CustomerModel(){}

    public CustomerModel(long id, Date admissionDate, double borrowingCapacity, PersonModel mPerson)
    {
        this.id = id;
        this.admissionDate = admissionDate;
        this.borrowingCapacity = borrowingCapacity;
        this.mPerson = mPerson;
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

    public Date getAdmissionDate()
    {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate)
    {
        this.admissionDate = admissionDate;
    }

    public double getBorrowingCapacity()
    {
        return borrowingCapacity;
    }

    public void setBorrowingCapacity(double borrowingCapacity)
    {
        this.borrowingCapacity = borrowingCapacity;
    }

    public PersonModel getmPerson()
    {
        return mPerson;
    }

    public void setmPerson(PersonModel mPerson)
    {
        this.mPerson = mPerson;
    }
    //Extra methods
}
