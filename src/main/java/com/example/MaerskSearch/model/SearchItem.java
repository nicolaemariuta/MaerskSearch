package com.example.MaerskSearch.model;

import com.fasterxml.jackson.annotation.JsonProperty;


public class SearchItem {

    private final String id;
    private final String type;
    private final String subject;
    private final String description;
    private final String priority;
    private final String status;


    public SearchItem(@JsonProperty("id") String id,
                      @JsonProperty("type") String type,
                      @JsonProperty("subject") String subject,
                      @JsonProperty("description") String description,
                      @JsonProperty("priority") String priority,
                      @JsonProperty("status") String status) {
        this.id = id;
        this.type = type;
        this.subject = subject;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }
}
