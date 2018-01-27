package com.example.jokes.controllers;

import com.example.jokes.services.JokeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {
    JokeServiceImpl jokeServiceImpl ;
    @Autowired
    public JokeController() {
        this.jokeServiceImpl = new JokeServiceImpl();
    }
    @RequestMapping({"/",""})
    public String  getControllerJoke(){
        return  jokeServiceImpl.getJoke();
    }
}
