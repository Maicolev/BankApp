package com.demo.BankApp.repository;

import com.demo.BankApp.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonModel, Long>
{
}
