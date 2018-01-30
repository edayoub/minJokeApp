package com.example.jokes.controllers;

import com.example.jokes.services.JokeServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {
    JokeServiceImpl jokeServiceImpl ;

    public JokeController(JokeServiceImpl jokeServiceImpl) {
        this.jokeServiceImpl = jokeServiceImpl;
    }

    @RequestMapping({"/",""})
    public String  getControllerJoke(){
        return  jokeServiceImpl.getJoke();
    }
}
