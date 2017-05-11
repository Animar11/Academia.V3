package com.service;

import com.Entities.Wallcom;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.repository.WallcomRepository;


@Service
@Transactional
public class WallcomService {

    private WallcomRepository WallcomRepository;

    public Wallcom createWallcom(Wallcom Wallcom){

        return WallcomRepository.save(Wallcom);
    }

    public Wallcom updateWallcom(Wallcom Wallcom){

        return WallcomRepository.findOneById(Wallcom.getId());
    }

    public void deleteWallcom(Wallcom Wallcom){

        WallcomRepository.delete(Wallcom);
    }
}
