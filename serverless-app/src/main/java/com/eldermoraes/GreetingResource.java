package com.eldermoraes;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/confraria")
public class GreetingResource {

    private static int count = 0;

    @ConfigProperty(name = "msg", defaultValue = "Olá, ")
    private String msg;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return msg + count++ + "\n";
    }
}
