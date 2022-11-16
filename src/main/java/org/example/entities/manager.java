package org.example.entities;

import lombok.Data;

@Data
public class manager {
    private String name;
    private String surname;
    private String company_name;

    public manager(String name, String surname, String company_name) {
        this.name = name;
        this.surname = surname;
        this.company_name = company_name;
    }
}
