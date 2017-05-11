package com.repository;

import com.Entities.Depositbox;
import org.springframework.data.repository.CrudRepository;

public interface DepositboxRepository extends CrudRepository<Depositbox,Long> {

    Depositbox findOneById(int id);
}
