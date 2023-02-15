package com.vdaproject.templatebespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
    //gets html from a default 'resources/public' or 'resources/static' folder
    // TODO: check apakah routing di react bisa tabrakan dengan ini
    @RequestMapping(path="/")
    public String loadWebApp(){
        return "web-app/index.html";
    }

//    //gets html from a default 'resources/public' or 'resources/static' folder
//    @RequestMapping("/welcome1")
//    public ModelAndView getWelcomePageAsModel() {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("login.html");
//        return modelAndView;
//    }
//
//    //  fails with 404 resource not found by default
//    //  NO fail, if spring mvc view suffix is set in properties e.g.: spring.mvc.view.suffix=.html
//    //  NO fail, if thymeleaf is added, and there is a file login.html in a resources/templates folder
//    @RequestMapping(path="/welcome2")
//    public String thisFails(){
//        return "login";
//    }
}
