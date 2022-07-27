package com.artemisa.webfluxpoc.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class RepoController {

    @GetMapping("/{username}/repos")
    public void getRepositories(@PathVariable String username) {
        log.info("Getting repositories for {}", username);
    }

}
