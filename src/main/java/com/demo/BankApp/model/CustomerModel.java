package com.demo.BankApp.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

//For ORM
@Entity
@Table (name = "customer")
public class CustomerModel
{
    //Attributes
    @Id
    @Column(name = "customer_id")
    private long id;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date admissionDate;
    private double borrowingCapacity;

    @OneToOne
    //@ForeignKey(name = "FK_PERS_CUST")
    @JoinColumn(name = "person_id")
    private PersonModel mPerson;

    //Constructor
    public CustomerModel(){}

    public CustomerModel(Long id, Date admissionDate, double borrowingCapacity, PersonModel mPerson)
    {
        this.id = id;
        this.admissionDate = admissionDate;
        this.borrowingCapacity = borrowingCapacity;
        this.mPerson = mPerson;
    }

    //Setter and getter
    public Long getId()
    {
        return id;
    }

    public void setId(long id) {
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
