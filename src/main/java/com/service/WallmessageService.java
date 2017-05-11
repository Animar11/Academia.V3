package com.service;

import com.Entities.Wallmessage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.repository.WallmessageRepository;


@Service
@Transactional
public class WallmessageService {

    private WallmessageRepository WallmessageRepository;

    public Wallmessage createWallmessage(Wallmessage Wallmessage){

        return WallmessageRepository.save(Wallmessage);
    }

    public Wallmessage updateWallmessage(Wallmessage Wallmessage){

        return WallmessageRepository.findOneById(Wallmessage.getId());
    }

    public void deleteWallmessage(Wallmessage Wallmessage){

        WallmessageRepository.delete(Wallmessage);
    }
}
