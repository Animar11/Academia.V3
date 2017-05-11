package com.service;

import com.Entities.Notecard;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.repository.NotecardRepository;


@Service
@Transactional
public class NotecardService {

    private NotecardRepository NotecardRepository;

    public Notecard createNotecard(Notecard Notecard){

        return NotecardRepository.save(Notecard);
    }

    public Notecard updateNotecard(Notecard Notecard){

        return NotecardRepository.findOneById(Notecard.getId());
    }

    public void deleteNotecard(Notecard Notecard){

        NotecardRepository.delete(Notecard);
    }
}
