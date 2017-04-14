package uk.ac.standrews.cs.jjj.rest.api;

import uk.ac.standrews.cs.jjj.jackson.models.MessageModel;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author Simone I. Conte "sic2@st-andrews.ac.uk"
 */
@Path("/message")
public class Message {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postMessage(MessageModel messageModel) {

        String output = "Body received: " + messageModel.getMessage();
        return Response.status(200).entity(output).build();
    }
}
