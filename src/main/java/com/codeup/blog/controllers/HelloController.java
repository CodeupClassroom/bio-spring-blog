package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("/hello/{name}") //request
    public String showAHelloMessage(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "/hello";
    }

    @GetMapping("/hello")
    public String showGenericHelloMessage() {
        return "/hello";
    }

    @GetMapping("/create-a-hello")
    @ResponseBody
    public String showCreatePage(){
        return "this would be the create form";
    }

    @PostMapping("/hello")
    @ResponseBody
    public String submitCreateForm(){
        //... saving an ad
        return "ad has been saved!";
    }

    @GetMapping("/get-zip/{zipcode}")
    @ResponseBody
    public int getZipCode(@PathVariable int zipcode){
        return zipcode;
    }

    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
    }

}