package com.bsuir.BMSU_4.restImpl;

import com.bsuir.BMSU_4.rest.WelcomeRest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class WelcomeRestImpl implements WelcomeRest {
    @Override
    public ModelAndView greeting() {
        return new ModelAndView(new RedirectView("/hello.html"));
    }
}
