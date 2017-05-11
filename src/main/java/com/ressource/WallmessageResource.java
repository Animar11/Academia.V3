package com.ressource;


import com.Entities.Wallmessage;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import com.service.WallmessageService;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/java")
public class WallmessageResource {
    private WallmessageService wallmessageService;

    /**
     * POST  /wallmessage  : Creates a new wallmessage.
     * <p>
     * Creates a new wallmessage
     * </p>
     *
     * @param wallmessage the wallmessage to create
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/wallmessages")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public Wallmessage createWallmessage(@PathVariable Wallmessage wallmessage) throws URISyntaxException {

        return wallmessageService.createWallmessage(wallmessage);

    }

    /**
     * PUT  /wallmessage  : Update a wallmessage.
     * <p>
     * Updates a wallmessage
     * </p>
     *
     * @param wallmessage the wallmessage to update
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/wallmessages")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public ResponseEntity<Wallmessage> updateWallmessage(@PathVariable Wallmessage wallmessage) throws URISyntaxException {
        Wallmessage wallmessageUpdate;
        wallmessageUpdate=wallmessageService.updateWallmessage(wallmessage);
        if(wallmessage==wallmessageUpdate){
            return ResponseEntity.ok().body(wallmessageUpdate);
        }else {
            return ResponseEntity.badRequest().body(null); //A changer, il faut créer divers réponses pas le temps
        }


    }

    /**
     * DELETE /wallmessages/:id : delete the wallmessages with id.
     *
     * @param wallmessage to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/wallmessages")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public ResponseEntity<Void> deleteWallmessage(@PathVariable Wallmessage wallmessage) throws URISyntaxException {
        Wallmessage wallmessageUpdate;
        wallmessageService.deleteWallmessage(wallmessage);
        return ResponseEntity.ok().build();
    }


}
