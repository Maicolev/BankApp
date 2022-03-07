package com.demo.BankApp.repository;

import com.demo.BankApp.model.CreditCardModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditCardRepository extends JpaRepository<CreditCardModel, Long>
{
}
