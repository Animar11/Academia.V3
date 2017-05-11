package com.service;

import com.Entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.repository.SubjectRepository;


@Service
@Transactional
public class SubjectService {
    @Autowired
    private SubjectRepository SubjectRepository;

    public void createSubject(Subject subject){

        SubjectRepository.save(subject);
    }

    public Subject updateSubject(Subject Subject){

        return SubjectRepository.findOneById(Subject.getId());
    }

    public void deleteSubject(Subject Subject){

        SubjectRepository.delete(Subject);
    }
}
