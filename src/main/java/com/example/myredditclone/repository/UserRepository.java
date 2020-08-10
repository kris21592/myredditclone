package com.example.myredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myredditclone.dataobject.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
