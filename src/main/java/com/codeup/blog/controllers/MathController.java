package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public int add(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }

    @GetMapping("/subtract/{num1}/from/{num2}")
    @ResponseBody
    public int subtract(@PathVariable int num1, @PathVariable int num2) {
        return num2 - num1;
    }

    // Overloading subtract
    @GetMapping("/subtract/{num1}/from/{num2}/and/{num3}")
    @ResponseBody
    public int subtract(@PathVariable int num1, @PathVariable int num2, @PathVariable int num3) {
        return num2 - num1 - num3;
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public int multiply(@PathVariable int num1, @PathVariable int num2) {
        return num2 * num1;
    }

    @GetMapping("/divide/{num1}/by/{num2}")
    @ResponseBody
    public double multiply(@PathVariable double num1, @PathVariable double num2) {
        return num1 / num2;
    }

}
