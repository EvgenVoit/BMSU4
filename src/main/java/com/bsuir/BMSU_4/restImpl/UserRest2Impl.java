package com.bsuir.BMSU_4.restImpl;

import com.bsuir.BMSU_4.rest.UsersRest2;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserRest2Impl implements UsersRest2 {

    @Override
    public String registration() {
        return "registartion";
    }
}
