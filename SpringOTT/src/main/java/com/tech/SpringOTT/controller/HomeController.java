package com.tech.SpringOTT.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {

    @GetMapping("/index")
    public String index(Principal principal, Model model){
        model.addAttribute("user",principal.getName());
        return "index";
    }
}
