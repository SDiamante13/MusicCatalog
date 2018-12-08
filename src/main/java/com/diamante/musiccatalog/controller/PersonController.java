package com.diamante.musiccatalog.controller;

import com.diamante.musiccatalog.entity.Person;
import com.diamante.musiccatalog.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @PostMapping(path="/person")
    public String savePerson(@RequestBody Person person){
        personRepository.save(person);
        return "Saved Person!!!";
    }

    @GetMapping(path="/person/{personId}")
    public Person savePerson(@PathVariable Long personId){
        Optional<Person> foundPerson = personRepository.findById(personId);
        return foundPerson.get();
    }


}
