package uk.ac.standrews.cs.jjj.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Simone I. Conte "sic2@st-andrews.ac.uk"
 */
@Path("/")
public class Root {

    @GET
    public Response helloWorld() {

        String output = "Hello World";
        return Response.status(200).entity(output).build();
    }

}