package uk.ac.standrews.cs.jjj.jackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

/**
 * The JacksonProvider is used to manage JSON inputs and outputs
 */
@Provider
public class JacksonProvider implements ContextResolver<ObjectMapper> {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    static {
        MAPPER.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        MAPPER.enable(SerializationFeature.INDENT_OUTPUT);
        MAPPER.disable(MapperFeature.USE_GETTERS_AS_SETTERS);
        MAPPER.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
    }

    public JacksonProvider() {
        System.out.println("Instantiate JacksonProvider");
    }

    @Override
    public ObjectMapper getContext(Class<?> type) {
        return MAPPER;
    }
}
