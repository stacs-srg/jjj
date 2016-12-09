package uk.ac.standrews.cs.jjj.rest;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.logging.LoggingFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import uk.ac.standrews.cs.jjj.jackson.JacksonProvider;

/**
 * @author Simone I. Conte "sic2@st-andrews.ac.uk"
 */
public class RESTConfig extends ResourceConfig {

    private final static String REST_PACKAGE = "uk.ac.standrews.cs.jjj.rest.api";

    public RESTConfig() {
        packages(REST_PACKAGE);
        register(LoggingFeature.class);
        register(JacksonProvider.class);
        register(JacksonFeature.class);

        // NOTE: Disable when not debugging!
        property(ServerProperties.TRACING, "ALL");
        property(ServerProperties.TRACING_THRESHOLD, "VERBOSE");
        property(ServerProperties.WADL_FEATURE_DISABLE, "true");
    }

}