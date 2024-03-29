package com.bsuir.BMSU_4.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user2")
public interface UsersRest2 {

    @PostMapping("/registration")
    public String registration();



}
