package br.com.ecommerce.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fabio on 01/04/17.
 */
@RestController
public class GreetController {

    @RequestMapping(path= "/greet/{name}",method= RequestMethod.GET)
    public String greet(@PathVariable String name, ModelMap model){
        String greet =" Hello !!!" + name + " How are You?";
        model.addAttribute("greet", greet);
        System.out.println(greet);

        return "greet";
    }
}
