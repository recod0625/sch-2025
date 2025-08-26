package com.sch.sprintboot.dto;

public class User {
    //Field
    private String id;
    private String pass;
    private String name;
    private String email;

    //Constructor
    public User() {};

    //Method
    //Alt+Insert -> setter and getter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
