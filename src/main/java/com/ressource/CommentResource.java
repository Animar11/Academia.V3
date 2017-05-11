package com.ressource;


import com.Entities.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import com.service.CommentService;

import java.net.URISyntaxException;

@RestController
public class CommentResource {
    @Autowired
    private CommentService commentService;

    /**
     * POST  /comment  : Creates a new comment.
     * <p>
     * Creates a new comment
     * </p>
     *
     * @param comment the comment to create
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/comments")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public Comment createComment(@RequestBody Comment comment) throws URISyntaxException {

        return commentService.createComment(comment);

    }

    /**
     * PUT  /comment  : Update a comment.
     * <p>
     * Updates a comment
     * </p>
     *
     * @param comment the comment to update
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/comments")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public ResponseEntity<Comment> updateComment(@PathVariable Comment comment) throws URISyntaxException {
        Comment commentUpdate;
        commentUpdate=commentService.updateComment(comment);
        if(comment==commentUpdate){
            return ResponseEntity.ok().body(commentUpdate);
        }else {
            return ResponseEntity.badRequest().body(null); //A changer, il faut créer divers réponses pas le temps
        }


    }

    /**
     * DELETE /comments/:id : delete the comments with id.
     *
     * @param comment to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/comments")
    //@Secured(AuthoritiesConstants.ADMIN) /*Qui on veut*/
    public ResponseEntity<Void> deleteComment(@PathVariable Comment comment) throws URISyntaxException {
        Comment commentUpdate;
        commentService.deleteComment(comment);
        return ResponseEntity.ok().build();
    }


}
