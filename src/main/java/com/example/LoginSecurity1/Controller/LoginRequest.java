package com.example.LoginSecurity1.Controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginRequest {
    private String usernameOrEmail;

    private String password;

    public String getUsernameOrEmail() {
        return usernameOrEmail;
    }

    public void setUsernameOrEmail(String usernameOrEmail) {
        this.usernameOrEmail = usernameOrEmail;
    }

    @JsonIgnore
    public String getPassword() {
        return password;
    }
    
    @JsonProperty
    public void setPassword(String password) {
        this.password = password;
    }
}
