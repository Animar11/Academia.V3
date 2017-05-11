package com.repository;

import com.Entities.Document;
import org.springframework.data.repository.CrudRepository;

public interface DocumentRepository extends CrudRepository<Document,Long> {

    Document findOneById(int id);
}
