package com.service;

import com.Entities.Depositbox;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.repository.DepositboxRepository;


@Service
@Transactional
public class DepositboxService {

    private DepositboxRepository DepositboxRepository;

    public Depositbox createDepositbox(Depositbox Depositbox){

        return DepositboxRepository.save(Depositbox);
    }

    public Depositbox updateDepositbox(Depositbox Depositbox){

        return DepositboxRepository.findOneById(Depositbox.getId());
    }

    public void deleteDepositbox(Depositbox Depositbox){

        DepositboxRepository.delete(Depositbox);
    }
}
