package com.gamingroom.gameauth.auth;

import java.security.Principal;
import java.util.Set;

public class GameUser implements Principal {
    private String name;
    private Set<String> roles;

    public GameUser(String name, Set<String> roles) {
        this.name = name;
        this.roles = roles;
    }

    @Override
    public String getName() {
        return name;
    }

    //  Add getRole() method to return user roles
    public Set<String> getRoles() {
        return roles;
    }
}
