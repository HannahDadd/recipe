package com.bbc.news.hannah.ioc;

import com.bbc.news.hannah.controller.RecipeControllerInMemoryImpl;
import com.bbc.news.hannah.controller.RecipeControllerInterface;
import com.bbc.news.hannah.endpoint.RecipeEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EndpointConfig {

    @Bean
    public RecipeControllerInMemoryImpl recipeControllerInMemoryImpl() {
        return new RecipeControllerInMemoryImpl();
    }

    @Bean
    public RecipeEndpoint recipeEndpoint(RecipeControllerInterface recipeControllerInMemoryImpl) {
        return new RecipeEndpoint(recipeControllerInMemoryImpl);
    }
}
