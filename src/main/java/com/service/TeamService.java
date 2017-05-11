package com.service;

import com.Entities.Team;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.repository.TeamRepository;


@Service
@Transactional
public class TeamService {

    private TeamRepository TeamRepository;

    public Team createTeam(Team Team){

        return TeamRepository.save(Team);
    }

    public Team updateTeam(Team Team){

        return TeamRepository.findOneById(Team.getId());
    }

    public void deleteTeam(Team Team){

        TeamRepository.delete(Team);
    }
}
