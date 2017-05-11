package com.service;

import com.Entities.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.repository.CommentRepository;


@Service
@Transactional
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment createComment(Comment comment){

        return commentRepository.save(comment);
    }

    public Comment updateComment(Comment Comment){

        return commentRepository.findOneById(Comment.getId());
    }

    public void deleteComment(Comment Comment){

        commentRepository.delete(Comment);
    }
}
