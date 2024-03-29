package com.bsuir.BMSU_4.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/welcome")
public interface WelcomeRest {

    @GetMapping("/")
    public ModelAndView greeting();
}
