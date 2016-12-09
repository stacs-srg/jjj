package uk.ac.standrews.cs.jjj.rest;

import org.glassfish.jersey.server.ResourceConfig;
import uk.ac.standrews.cs.jjj.jackson.JacksonProvider;

/**
 * @author Simone I. Conte "sic2@st-andrews.ac.uk"
 */
public class RESTConfig {

    private final static String REST_PACKAGE = "uk.ac.standrews.cs.jjj.rest.api";

    public ResourceConfig build() {

        return new ResourceConfig()
                .packages(REST_PACKAGE)
                .register(new JacksonProvider()); // TODO - filter examples
    }
}