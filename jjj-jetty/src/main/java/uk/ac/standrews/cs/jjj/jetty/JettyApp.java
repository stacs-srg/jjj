package uk.ac.standrews.cs.jjj.jetty;


import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import uk.ac.standrews.cs.jjj.rest.RESTConfig;

import javax.ws.rs.core.UriBuilder;
import java.net.URI;

/**
 * @author Simone I. Conte "sic2@st-andrews.ac.uk"
 */
public class JettyApp {

    private static final int PORT = 8082;
    private static UriBuilder uriBuilder = UriBuilder.fromUri("http://0.0.0.0/");

    private static Server startServer() throws Exception {

        RESTConfig restConfig = new RESTConfig();
        final ResourceConfig rc = restConfig.build();

        URI baseUri = uriBuilder.port(PORT).build();
        System.out.println("Starting REST Service on port: " + PORT + " -- URI: " + baseUri.toString());

        return JettyHttpContainerFactory.createServer(baseUri, rc);
    }

    public static void RUN() throws Exception  {
        Server server = startServer();

        try {
            server.start();
            server.join();
        } finally {
            server.destroy();
        }
    }

    public static void RUN(Object state) throws Exception  { // FIXME - provide examples
        Server server = startServer();

        try {
            server.start();
            server.join();
        } finally {
            server.destroy();
        }
    }
}
