package com.attractor.homework;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Artist {
    private UUID id;
    private String name;
    private String information;

    public Artist(@JsonProperty("id") UUID id,
                  @JsonProperty("name") String name,
                  @JsonProperty("information") String information) {
        this.id = id;
        this.name = name;
        this.information = information;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
