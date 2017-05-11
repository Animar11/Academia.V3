package com.ressource;

import com.Entities.Person;
import com.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonResource {
    @Autowired
    private PersonService personService;

    @GetMapping("/allPersons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping("/person/{id}")
    public Person getAllPersons(@PathVariable Integer id) {
        return personService.getOnePerson(id);
    }

    @PostMapping("/person")
    public Person createPerson(@RequestBody Person person) throws URISyntaxException {
        return personService.createPerson(person);
    }

    @PutMapping("/updatePerson")
    public Person updateOnePerson(@RequestBody Person person) throws URISyntaxException {
        return personService.updateOnePerson(person);
    }

    @PutMapping("/updatePersons")
    public void updatePersons(@RequestBody ArrayList<Person> personList) throws URISyntaxException {
        personService.updatePersons(personList);
    }

    @DeleteMapping("/deleteOnePerson/{id}")
    public void deletePerson(@PathVariable Integer id) throws URISyntaxException {
        personService.deletePerson(id);
    }


}
