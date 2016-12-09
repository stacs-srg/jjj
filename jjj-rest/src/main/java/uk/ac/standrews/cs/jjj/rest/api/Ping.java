package uk.ac.standrews.cs.jjj.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * This is a test end-point.
 */
@Path("/ping")
public class Ping {

    @GET
    public Response ping() {

        String output = "Pong";
        return Response.status(200).entity(output).build();
    }

    @GET
    @Path("/{param}")
    public Response pingWithMessage(@PathParam("param") String msg) {

        if (msg == null || msg.isEmpty()) {
            msg = "What? Please give me a message.";
        }

        String output = "Pong : " + msg;
        return Response.status(200).entity(output).build();
    }

}
