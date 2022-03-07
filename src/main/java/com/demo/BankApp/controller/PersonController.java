package com.demo.BankApp.controller;

import com.demo.BankApp.model.PersonModel;
import com.demo.BankApp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/person/")
public class PersonController
{
    @Autowired
    private PersonService personService;

    public PersonController()
    {
        personService = new PersonService();
    }

    @GetMapping
    private ResponseEntity<List<PersonModel>> getAllPerson()
    {
        return ResponseEntity.ok(personService.findAll());
    }
}
