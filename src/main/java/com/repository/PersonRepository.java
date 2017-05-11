package com.repository;

import com.Entities.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person,Integer> {

  Person findOneById(int id);
  Person findOneByLogin(String login);
}
