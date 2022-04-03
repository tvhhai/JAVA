package com.example.training.ss2customannotaion;

import java.time.LocalDateTime;

@JsonName(value = "super_man")
public class SuperMan {

    private String name;

    @JsonName("date_of_birth")
    private LocalDateTime dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
