package com.gamingroom.gameauth.controller;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.gamingroom.gameauth.representations.GameUserInfo;

@Produces(MediaType.TEXT_PLAIN)
@Path("/client") // Base path for the client controller
public class RESTClientController {
    private Client client;

    public RESTClientController(Client client) {
        this.client = client;
    }

    // Add GET annotation and define the path for fetching all game users
    @GET
    @Path("/gameusers")
    public String getGameUsers() {
        // Do not hard-code URLs in production applications
        WebTarget webTarget = client.target("http://localhost:8080/gameusers");
        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.get();

        if (response.getStatus() != 200) {
            return "Error: Unable to fetch game users. Status: " + response.getStatus();
        }

        @SuppressWarnings("rawtypes")
        ArrayList gameusers = response.readEntity(ArrayList.class);
        return gameusers.toString();
    }

    @GET
    @Path("/gameusers/{id}")
    public String getGameUserById(@PathParam("id") int id) {
        // Do not hard-code URLs in production applications
        WebTarget webTarget = client.target("http://localhost:8080/gameusers/" + id);
        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder.get();

        if (response.getStatus() != 200) {
            return "Error: Unable to fetch game user with ID " + id + ". Status: " + response.getStatus();
        }

        GameUserInfo gameUserInfo = response.readEntity(GameUserInfo.class);
        return gameUserInfo.toString();
    }
}
