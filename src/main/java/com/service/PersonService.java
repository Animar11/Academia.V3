package com.service;

import com.Entities.Person;
import com.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service("Person")
public class PersonService {
  @Autowired
    private PersonRepository personRepository;

    public List<Person> getAllPersons(){
        List<Person> personsList = new ArrayList<>();
        personRepository.findAll().forEach(personsList::add);
        return personsList;
    }

    public Person createPerson(Person person){
        return personRepository.save(person);
    }

    public Person updateOnePerson(Person person){

            return personRepository.save(person);
    }

    public void updatePersons(ArrayList<Person> personList){

        for (Person onePerson : personList) {
            personRepository.save(onePerson);
        }
    }
    public Person getOnePerson(Integer id){

        return personRepository.findOneById(id);
    }

    public void deletePerson(Integer id){

        personRepository.delete(id);
    }
}
