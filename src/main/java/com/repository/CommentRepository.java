package com.repository;

import com.Entities.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment,Integer> {

    Comment findOneById(int id);
}
