package com.fran.jokes.entity;

import javax.persistence.*;


@Entity
@Table(name="joke")
public class Joke {

    //fields

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="joke_category")
    private String jokeCategory;

    @Column(name="joke_content")
    private String jokeContent;


    //constructors

    public Joke() {
    }

    public Joke(String jokeCategory, String jokeContent) {
        this.jokeCategory = jokeCategory;
        this.jokeContent = jokeContent;
    }

    public Joke(int id, String jokeCategory, String jokeContent) {
        this.id = id;
        this.jokeCategory = jokeCategory;
        this.jokeContent = jokeContent;
    }

    //getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJokeCategory() {
        return jokeCategory;
    }

    public void setJokeCategory(String jokeCategory) {
        this.jokeCategory = jokeCategory;
    }

    public String getJokeContent() {
        return jokeContent;
    }

    public void setJokeContent(String jokeContent) {
        this.jokeContent = jokeContent;
    }

    //toString method

    @Override
    public String toString() {
        return "Joke{" +
                "id=" + id +
                ", jokeCategory='" + jokeCategory + '\'' +
                ", jokeContent='" + jokeContent + '\'' +
                '}';
    }
}
