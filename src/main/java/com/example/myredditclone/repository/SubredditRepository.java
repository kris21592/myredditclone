package com.example.myredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myredditclone.dataobject.Subreddit;

@Repository
public interface SubredditRepository extends JpaRepository<Subreddit, Long> {

}
