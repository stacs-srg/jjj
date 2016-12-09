package uk.ac.standrews.cs.jjj.jetty;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;
import uk.ac.standrews.cs.jjj.rest.RESTConfig;

/**
 * @author Simone I. Conte "sic2@st-andrews.ac.uk"
 */
public class JettyApp {

    private static final int PORT = 8082;

    private static Server startServer() throws Exception {

        final RESTConfig restConfig = new RESTConfig();

        ServletHolder servlet = new ServletHolder(new ServletContainer(restConfig));
        Server server = new Server(PORT);
        ServletContextHandler context = new ServletContextHandler(server, "/*");
        context.addServlet(servlet, "/*");

        return server;
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
