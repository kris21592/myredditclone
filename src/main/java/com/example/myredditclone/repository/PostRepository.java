package com.example.myredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myredditclone.dataobject.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
