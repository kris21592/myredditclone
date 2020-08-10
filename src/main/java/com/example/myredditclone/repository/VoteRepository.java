package com.example.myredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myredditclone.dataobject.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {

}
