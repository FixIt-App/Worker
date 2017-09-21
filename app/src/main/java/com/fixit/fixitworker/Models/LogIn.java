package com.fixit.fixitworker.Models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Created by Fabi on 19/09/2017.
 */
@JsonPropertyOrder({ "username", "password" })
public class LogIn {

    private String username;
    private String password;

    public LogIn(String email, String password) {
        this.username = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String email) {
        this.username = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
