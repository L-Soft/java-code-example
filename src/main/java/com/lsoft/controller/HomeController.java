package com.lsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Controller
public class HomeController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index (@RequestParam(value = "name", required = false) String name) {
        ModelAndView mv = new ModelAndView("index");

        mv.addObject("name", name);
        mv.addObject("message", "Hello world!");

        return mv;
    }

    @RequestMapping(value = "/todoList", method = RequestMethod.GET)
    public String todoList (Model model) {
        return "todolist";
    }
}
