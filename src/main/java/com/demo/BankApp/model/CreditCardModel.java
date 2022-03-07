package com.demo.BankApp.model;

import javax.persistence.*;

@Entity
@Table (name = "credit_card")
public class CreditCardModel
{
    //Attributes
    @Id
    private long id;
    private double quota;

    //Foreign key
    @ManyToOne
    @JoinColumn(name = "m_customer_id")
    private CustomerModel mCustomer;

    //Constructor
    public CreditCardModel(){}

    public CreditCardModel(long id, double quota, CustomerModel mCustomer) {
        this.id = id;
        this.quota = quota;
        this.mCustomer = mCustomer;
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

    public double getQuota()
    {
        return quota;
    }

    public void setQuota(double quota)
    {
        this.quota = quota;
    }

    public CustomerModel getmCustomer()
    {
        return mCustomer;
    }

    public void setmCustomer(CustomerModel mCustomer)
    {
        this.mCustomer = mCustomer;
    }
    //Extra methods
}
