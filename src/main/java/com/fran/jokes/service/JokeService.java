package com.fran.jokes.service;

import com.fran.jokes.entity.Joke;


import java.util.List;

public interface JokeService {

    public List<Joke> findAll();

    public Joke findById(int id);

    public void save(Joke joke);

    public void deleteById(int id);

}
