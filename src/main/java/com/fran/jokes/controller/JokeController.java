package com.fran.jokes.controller;

import com.fran.jokes.entity.Joke;
import com.fran.jokes.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    public String showJokes(Model model) {

        List<Joke> jokes = jokeService.findAll();

        model.addAttribute("joke", jokes);

        return "show-jokes";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model model) {

        Joke joke = new Joke();

        model.addAttribute("joke", joke);

        return "joke-form";
    }

    @PostMapping("/save")
    public String saveJoke(@ModelAttribute("joke") Joke joke) {

        jokeService.save(joke);

        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("jokeId") int id, Model model) {

        Joke joke = jokeService.findById(id);

        model.addAttribute("joke", joke);

        return "/joke-form";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("jokeId") int id, Model model) {

        jokeService.deleteById(id);

        return "redirect:/";
    }


}





















