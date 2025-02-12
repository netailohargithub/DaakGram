package com.daakgram.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daakgram.entities.Post;

public interface PostRepository 
          extends 
                 JpaRepository<Post, Long>{

}
