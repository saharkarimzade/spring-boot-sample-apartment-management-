package com.springbootsample.springjpahibernate.controller;

import com.springbootsample.springjpahibernate.entity.PersonEntity;
import com.springbootsample.springjpahibernate.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping(value = "save")
    public void save(@RequestParam String name){
        PersonEntity personEntity = new PersonEntity();
        personEntity.setName(name);
        PersonEntity person = personRepository.save(personEntity);
        System.out.println(person.toString());
    }
}
