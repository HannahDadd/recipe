package com.bbc.news.hannah.ioc;

import com.bbc.news.hannah.endpoint.RecipeEndpoint;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(RecipeEndpoint recipeEndpoint) {
        register(recipeEndpoint);
    }
}