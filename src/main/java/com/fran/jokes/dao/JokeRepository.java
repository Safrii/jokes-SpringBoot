package com.fran.jokes.dao;

import com.fran.jokes.entity.Joke;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JokeRepository extends JpaRepository<Joke,Integer>{


}
