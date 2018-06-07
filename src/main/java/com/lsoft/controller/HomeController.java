package com.lsoft.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@EnableWebMvc
@Controller
public class HomeController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index (@RequestParam(value = "name", required = false) String name) throws JsonProcessingException {
        Map map = new HashMap();
        map.put("name", "json");
        map.put("bool", Boolean.TRUE);
        map.put("int", new Integer(1));
        map.put("arr", new String[]{"a","b"});
        map.put("func", "function(i){ return this.arr[i]; }");

        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(map);

        ModelAndView mv = new ModelAndView("index");
        mv.addObject("name", name);
        mv.addObject("message", "Hello world!");
        mv.addObject("jsonArray", jsonArray);

        // http://www.baeldung.com/jackson-collection-array
        // 정리
        List<MyDto> listOfDtos = new ArrayList();
        listOfDtos.add(new MyDto("catsSoft-a", "up", true));
        listOfDtos.add(new MyDto("catsSoft-b", "up", true));
        listOfDtos.add(new MyDto("catsSoft-c", "up", true));
        return mv;
    }

    @RequestMapping(value = "/todoList", method = RequestMethod.GET)
    public String todoList (Model model) {
        return "todolist";
    }

    @RequestMapping(value = "/tabs", method = RequestMethod.GET)
    public ModelAndView tabs (@RequestParam(value = "tabs", required = false) String tab) {
        return new ModelAndView("tabs");
    }
}
