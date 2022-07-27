package com.artemisa.webfluxpoc.service;

import com.artemisa.webfluxpoc.model.Repository;
import reactor.core.publisher.Mono;

import java.util.List;

public interface RepoService {
    Mono<List<Repository>> getRepositories(String username);
}
