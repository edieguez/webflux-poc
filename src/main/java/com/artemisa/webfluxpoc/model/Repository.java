package com.artemisa.webfluxpoc.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Repository {

    private String name;
    private String full_name;
    private String html_url;

    @JsonProperty("private")
    private boolean private_;

    private boolean fork;
}
