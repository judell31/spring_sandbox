package com.spring.sandbox;

public class SandBoxResponse {
    public Long userId;
    public String firstName;
    public String lastName;
    public String description;

    public SandBoxResponse(Model model) {
        this.userId = model.getUserId();
        this.firstName = model.getFirstName();
        this.lastName = model.getLastName();
        this.description = model.getDescription();
    }
}
