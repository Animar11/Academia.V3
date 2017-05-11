package com.repository;

import com.Entities.Notecard;
import org.springframework.data.repository.CrudRepository;

public interface NotecardRepository extends CrudRepository<Notecard,Long> {

    Notecard findOneById(int id);
}
