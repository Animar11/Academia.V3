package com.ressource;


import com.Entities.Notecard;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import com.service.NotecardService;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/java")
public class NotecardResource {
    private NotecardService notecardService;

    /**
     * POST  /notecard  : Creates a new notecard.
     * <p>
     * Creates a new notecard
     * </p>
     *
     * @param notecard the notecard to create
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/notecards")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public Notecard createNotecard(@PathVariable Notecard notecard) throws URISyntaxException {

        return notecardService.createNotecard(notecard);

    }

    /**
     * PUT  /notecard  : Update a notecard.
     * <p>
     * Updates a notecard
     * </p>
     *
     * @param notecard the notecard to update
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/notecards")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public ResponseEntity<Notecard> updateNotecard(@PathVariable Notecard notecard) throws URISyntaxException {
        Notecard notecardUpdate;
        notecardUpdate=notecardService.updateNotecard(notecard);
        if(notecard==notecardUpdate){
            return ResponseEntity.ok().body(notecardUpdate);
        }else {
            return ResponseEntity.badRequest().body(null); //A changer, il faut créer divers réponses pas le temps
        }


    }

    /**
     * DELETE /notecards/:id : delete the notecards with id.
     *
     * @param notecard to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/notecards")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public ResponseEntity<Void> deleteNotecard(@PathVariable Notecard notecard) throws URISyntaxException {
        Notecard notecardUpdate;
        notecardService.deleteNotecard(notecard);
        return ResponseEntity.ok().build();
    }


}
