package org.example.entities;

import lombok.Data;

@Data
public class candidate {
    private String name;
    private String surname;

    public candidate(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

}
