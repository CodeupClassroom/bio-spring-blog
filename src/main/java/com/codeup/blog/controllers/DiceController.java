package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.concurrent.ThreadLocalRandom;

@Controller
public class DiceController {
    @GetMapping("/roll-dice/{guess}")
    public String rollDice(@PathVariable int guess, Model model) {
        //Find a random number between 1 and 6.
        int randomNum = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        //Compare the guess to the random number.
        //Store if the number was guessed correctly in a model attribute.
        model.addAttribute("randomNumber", randomNum);
        model.addAttribute("myGuess", guess);
        model.addAttribute("isCorrectGuess", guess == randomNum);

        return "/roll-dice";
    }

    @GetMapping("/roll-dice")
    public String displayRollDice() {
        return "/roll-dice";
    }
}
