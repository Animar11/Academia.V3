package com.ressource;


import com.Entities.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import com.service.SubjectService;

import java.net.URISyntaxException;

@RestController
public class SubjectResource {
    @Autowired
    private SubjectService subjectService;

    /**
     * POST  /subject  : Creates a new subject.
     * <p>
     * Creates a new subject
     * </p>
     *
     * @param subject the subject to create
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/subjects")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public void createSubject(@RequestBody Subject subject) throws URISyntaxException {

        subjectService.createSubject(subject);

    }

    /**
     * PUT  /subject  : Update a subject.
     * <p>
     * Updates a subject
     * </p>
     *
     * @param subject the subject to update
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/subjects")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public ResponseEntity<Subject> updateSubject(@PathVariable Subject subject) throws URISyntaxException {
        Subject subjectUpdate;
        subjectUpdate=subjectService.updateSubject(subject);
        if(subject==subjectUpdate){
            return ResponseEntity.ok().body(subjectUpdate);
        }else {
            return ResponseEntity.badRequest().body(null); //A changer, il faut créer divers réponses pas le temps
        }


    }

    /**
     * DELETE /subjects/:id : delete the subjects with id.
     *
     * @param subject to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/subjects")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public ResponseEntity<Void> deleteSubject(@PathVariable Subject subject) throws URISyntaxException {
        Subject subjectUpdate;
        subjectService.deleteSubject(subject);
        return ResponseEntity.ok().build();
    }


}
