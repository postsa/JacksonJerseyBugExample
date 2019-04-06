package com.spost.jjbug;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.message.filtering.SecurityEntityFilteringFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
  public JerseyConfig() {
    packages("com.spost.jjbug");
    register(SecurityEntityFilteringFeature.class);
    register(JacksonFeature.class);
  }
}
