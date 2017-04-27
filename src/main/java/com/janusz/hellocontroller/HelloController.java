package com.janusz.hellocontroller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloController extends AbstractController{

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("welcomeMessage","Wiadomosc z kontrolera powitalnego");

        return modelAndView;
    }
}
