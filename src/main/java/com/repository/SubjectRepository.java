package com.repository;

import com.Entities.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject,Integer> {

    Subject findOneById(int id);
}
