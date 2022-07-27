package com.artemisa.webfluxpoc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class BeanConfiguration {

    public static final String API_GITHUB = "https://api.github.com";

    @Bean
    public WebClient githubWebClient() {
        return WebClient.builder()
                .baseUrl(API_GITHUB)
                .build();
    }
}
