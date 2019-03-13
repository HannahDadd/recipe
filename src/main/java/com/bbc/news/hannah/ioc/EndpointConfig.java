package com.bbc.news.hannah.ioc;

import com.bbc.news.hannah.controller.RecipeRepositoy;
import com.bbc.news.hannah.endpoint.RecipeEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class EndpointConfig {

    @Bean
    public RecipeRepositoy recipeRepositoy(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        return new RecipeRepositoy(namedParameterJdbcTemplate);
    }

    @Bean
    public RecipeEndpoint recipeEndpoint(RecipeRepositoy recipeRepositoy) {
        return new RecipeEndpoint(recipeRepositoy);
    }
}
