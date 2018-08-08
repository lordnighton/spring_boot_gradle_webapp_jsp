package com.test.bootstrap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainPageController {

    @GetMapping
    public ModelAndView mainPage() {
        ModelAndView model = new ModelAndView("index");

        model.addObject("phrase", "Hello world!");

        return model;
    }

}