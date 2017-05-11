package com.ressource;


import com.Entities.Document;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import com.service.DocumentService;

import java.net.URISyntaxException;

@RestController
@RequestMapping("/java")
public class DocumentResource {
    private DocumentService documentService;

    /**
     * POST  /document  : Creates a new document.
     * <p>
     * Creates a new document
     * </p>
     *
     * @param document the document to create
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/documents")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public Document createDocument(@PathVariable Document document) throws URISyntaxException {

        return documentService.createDocument(document);

    }

    /**
     * PUT  /document  : Update a document.
     * <p>
     * Updates a document
     * </p>
     *
     * @param document the document to update
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/documents")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public ResponseEntity<Document> updateDocument(@PathVariable Document document) throws URISyntaxException {
        Document documentUpdate;
        documentUpdate=documentService.updateDocument(document);
        if(document==documentUpdate){
            return ResponseEntity.ok().body(documentUpdate);
        }else {
            return ResponseEntity.badRequest().body(null); //A changer, il faut créer divers réponses pas le temps
        }


    }

    /**
     * DELETE /documents/:id : delete the documents with id.
     *
     * @param document to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/documents")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public ResponseEntity<Void> deleteDocument(@PathVariable Document document) throws URISyntaxException {
        Document documentUpdate;
        documentService.deleteDocument(document);
        return ResponseEntity.ok().build();
    }


}
