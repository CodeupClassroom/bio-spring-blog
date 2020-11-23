package com.codeup.adlister.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("/hello/{name}") //request
    @ResponseBody // response
    public String showAHelloMessage(@PathVariable String name) {
        return "Hello from " + name; // what I respond with
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