package com.fran.jokes.service;

import com.fran.jokes.dao.JokeRepository;
import com.fran.jokes.entity.Joke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JokeServiceImpl implements JokeService {

    private JokeRepository jokeRepository;

    @Autowired
    public JokeServiceImpl(JokeRepository jokeRepository) {
        this.jokeRepository = jokeRepository;
    }

    @Override
    public List<Joke> findAll() {
        return jokeRepository.findAll();
    }

    @Override
    public Joke findById(int id) {
        Optional<Joke> result = jokeRepository.findById(id);
        Joke joke = null;

        if (result.isPresent()) {
            joke = result.get();
        } else {
            throw new RuntimeException();
        }

        return joke;
    }

    @Override
    public void save(Joke joke) {
        jokeRepository.save(joke);
    }

    @Override
    public void deleteById(int id) {
        jokeRepository.deleteById(id);
    }
}
