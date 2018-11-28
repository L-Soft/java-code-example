package com.catssoft.fileUpload.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
    @RequestMapping(value = "/")
    public String helloWorld(ModelMap modelMap) {
        return "index";
    }
}
