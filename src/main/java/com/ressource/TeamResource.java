package com.ressource;


import com.Entities.Team;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import com.service.TeamService;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/java")
public class TeamResource {
    private TeamService teamService;

    /**
     * POST  /team  : Creates a new team.
     * <p>
     * Creates a new team
     * </p>
     *
     * @param team the team to create
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/teams")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public Team createTeam(@PathVariable Team team) throws URISyntaxException {

        return teamService.createTeam(team);

    }

    /**
     * PUT  /team  : Update a team.
     * <p>
     * Updates a team
     * </p>
     *
     * @param team the team to update
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/teams")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public ResponseEntity<Team> updateTeam(@PathVariable Team team) throws URISyntaxException {
        Team teamUpdate;
        teamUpdate=teamService.updateTeam(team);
        if(team==teamUpdate){
            return ResponseEntity.ok().body(teamUpdate);
        }else {
            return ResponseEntity.badRequest().body(null); //A changer, il faut créer divers réponses pas le temps
        }


    }

    /**
     * DELETE /teams/:id : delete the teams with id.
     *
     * @param team to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/teams")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public ResponseEntity<Void> deleteTeam(@PathVariable Team team) throws URISyntaxException {
        Team teamUpdate;
        teamService.deleteTeam(team);
        return ResponseEntity.ok().build();
    }


}
