package com.example.myredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myredditclone.dataobject.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
