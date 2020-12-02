package com.springbootsample.springjpahibernate.controller;

import com.springbootsample.springjpahibernate.entity.NeighborEntity;
import com.springbootsample.springjpahibernate.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping(value = "save")
    public void save(@RequestParam String name){
        NeighborEntity personEntity = new NeighborEntity();
        personEntity.setName(name);
        NeighborEntity person = personRepository.save(personEntity);
        System.out.println(person.toString());
    }
}
