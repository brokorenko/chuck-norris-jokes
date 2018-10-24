package com.andy.chucknorrisjokes.controller;

import com.andy.chucknorrisjokes.service.ChuckJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ChuckController {

    private ChuckJokeService chuck;

    @Autowired
    public ChuckController(ChuckJokeService chuckJokeService) {
        this.chuck = chuckJokeService;
    }

    @RequestMapping({"", "/"})
    public String getJoke(Model model) {

        model.addAttribute("joke", chuck.getJoke());

        return "jokes";
    }
}
