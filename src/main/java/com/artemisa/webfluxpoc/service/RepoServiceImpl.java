package com.artemisa.webfluxpoc.service;

import com.artemisa.webfluxpoc.model.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@Service
public class RepoServiceImpl implements RepoService {

    @Autowired
    private WebClient githubWebClient;

    @Override
    public Mono<List<Repository>> getRepositories(String username) {
        return githubWebClient.get()
                .uri("/users/{username}/repos", username)
                .retrieve()
                .bodyToMono(Repository[].class) // <-- convert to Mono<Repository[]>
                .map(Arrays::asList) // <-- convert to Mono<List<Repository>>
                .log(); // <-- log the result
    }
}
