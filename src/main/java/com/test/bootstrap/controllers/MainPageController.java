package com.test.bootstrap.controllers;

import com.test.bootstrap.services.StringService;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MainPageController {

    @Autowired
    private StringService stringService;

    @GetMapping
    public ModelAndView mainPage() {
        ModelAndView model = new ModelAndView("index");

        model.addObject("phrase", StringUtils.trim("  Hello world!  ") + " " + stringService.returnString());

        return model;
    }

}