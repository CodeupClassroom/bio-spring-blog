package com.codeup.blog.controllers;

import com.codeup.blog.models.Ad;
import com.codeup.blog.models.Post;
import com.codeup.blog.repos.AdRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AdController {

    private final AdRepository adDao;

    public AdController(AdRepository adDao){
        this.adDao = adDao;
    }

    @GetMapping("/ads")
    public String index(Model viewModel) {
        viewModel.addAttribute("ads", adDao.findAll());
        return "ads/index";
    }

    @GetMapping("/ads/{id}")
    public String show(@PathVariable long id, Model model){
        Post post = new Post("Post " + id, "Some cool stuff " + id + ".");
        model.addAttribute("post", post);
        return "posts/show";
    }

    @GetMapping("/ads/create")
    public String showCreateForm(){
        return "ads/new";
    }

    @PostMapping("/ads/create")
    @ResponseBody
    public String createAd(
            @RequestParam(name = "title") String title,
            @RequestParam(name = "description") String desc
    ){
        Ad ad = new Ad(title, desc);
        Ad dbAd = adDao.save(ad);
        return "create a new Ad with the id: " + dbAd.getId();
    }
}