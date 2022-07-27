package com.artemisa.webfluxpoc.controller;

import com.artemisa.webfluxpoc.model.Repository;
import com.artemisa.webfluxpoc.service.RepoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@Slf4j
@RestController
public class RepoController {

    @Autowired
    private RepoService repoService;

    @GetMapping("/{username}/repos")
    public Mono<List<Repository>> getRepositories(@PathVariable String username) {
        log.info("Getting repositories for {}", username);

        return repoService.getRepositories(username);
    }
}
