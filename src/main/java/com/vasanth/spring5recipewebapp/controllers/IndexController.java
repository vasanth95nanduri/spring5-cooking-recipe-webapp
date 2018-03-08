package com.vasanth.spring5recipewebapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        System.out.println("hello World.......555554444..........");
        return "index";
    }

}
