package com.artemisa.webfluxpoc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RepoController {

    @GetMapping("/{username}/repos")
    public void getRepositories(@PathVariable String username) {
        System.out.println("Getting repositories for " + username);
    }

}
