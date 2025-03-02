package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;
import java.util.Set;  // ✅ Import Set from java.util

public class GameAuthorizer implements Authorizer<GameUser> {
    @Override
    public boolean authorize(GameUser user, String role) {
        //  Fix: Check if the user's roles contain the required role
        Set<String> userRoles = user.getRoles();
        return userRoles != null && userRoles.contains(role);
    }
}
