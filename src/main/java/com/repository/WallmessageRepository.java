package com.repository;

import com.Entities.Wallmessage;
import org.springframework.data.repository.CrudRepository;

public interface WallmessageRepository extends CrudRepository<Wallmessage,Long> {

    Wallmessage findOneById(int id);
}
