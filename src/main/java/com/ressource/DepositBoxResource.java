package com.ressource;


import com.Entities.Depositbox;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import com.service.DepositboxService;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/java")
public class DepositBoxResource {
    private DepositboxService depositboxService;

    /**
     * POST  /depositbox  : Creates a new depositbox.
     * <p>
     * Creates a new depositbox
     * </p>
     *
     * @param depositbox the depositbox to create
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/depositboxs")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public Depositbox createDepositbox(@PathVariable Depositbox depositbox) throws URISyntaxException {

        return depositboxService.createDepositbox(depositbox);

    }

    /**
     * PUT  /depositbox  : Update a depositbox.
     * <p>
     * Updates a depositbox
     * </p>
     *
     * @param depositbox the depositbox to update
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/depositboxs")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public ResponseEntity<Depositbox> updateDepositbox(@PathVariable Depositbox depositbox) throws URISyntaxException {
        Depositbox depositboxUpdate;
        depositboxUpdate=depositboxService.updateDepositbox(depositbox);
        if(depositbox==depositboxUpdate){
            return ResponseEntity.ok().body(depositboxUpdate);
        }else {
            return ResponseEntity.badRequest().body(null); //A changer, il faut créer divers réponses pas le temps
        }


    }

    /**
     * DELETE /depositboxs/:id : delete the depositboxs with id.
     *
     * @param depositbox to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/depositboxs")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public ResponseEntity<Void> deleteDepositbox(@PathVariable Depositbox depositbox) throws URISyntaxException {
        Depositbox depositboxUpdate;
        depositboxService.deleteDepositbox(depositbox);
        return ResponseEntity.ok().build();
    }


}
