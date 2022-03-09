package com.fersoft.peopledatalabs;

import com.fersoft.peopledatalabs.person.Person;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import org.glassfish.jersey.logging.LoggingFeature;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PDLClient {
    private final Person person;
    private final Logger logger = Logger.getLogger(PDLClient.class.getName());

    public PDLClient(String basePath, String version, String apiKey) {
        WebTarget webTarget = ClientBuilder.newClient().target(basePath + "/" + version).register(new LoggingFeature(
                logger,
                Level.FINE,
                LoggingFeature.Verbosity.PAYLOAD_ANY,
                8192));

        this.person = new Person(webTarget, apiKey);
    }

    public Person person() {
        return this.person;
    }
}
