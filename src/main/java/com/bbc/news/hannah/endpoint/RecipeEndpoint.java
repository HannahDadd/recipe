package com.bbc.news.hannah.endpoint;

import com.bbc.news.hannah.controller.RecipeControllerInterface;
import com.bbc.news.hannah.controller.RecipeRepositoy;
import com.bbc.news.hannah.model.Recipe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

@Component
@Slf4j
@Path("/recipes")
@Produces("application/json")
public class RecipeEndpoint {
    private RecipeControllerInterface controller;
    private RecipeRepositoy recipeRepositoy;

    public RecipeEndpoint(RecipeRepositoy recipeRepositoy) {
        //this.controller = new RecipeControllerInterface();
        this.recipeRepositoy = recipeRepositoy;
    }

    @GET
    @Path("/{id}")
    public Response getRecipeById(@PathParam("id") int id) {
        //Recipe recipe = controller.getRecipeById(id);
        Recipe recipe = recipeRepositoy.getRecipeById(1);
        if(recipe == null) {
            return Response.status(404).build();
        }
        return Response.status(200).entity(recipe).build();
    }

    @GET
    public Response allRecipe() {
        List<Recipe> recipes = controller.allRecipes();
        if(recipes == null) {
            return Response.status(404).build();
        }
        return Response.status(200).entity(recipes).build();
    }

    @POST
    @Consumes("application/json")
    public Response createRecipe(Recipe recipe) {
        Recipe newRecipe = controller.addRecipe(recipe);
        if(newRecipe == null) {
            return Response.status(404).build();
        }
        return Response.status(200).entity(newRecipe).build();
    }

    @DELETE
    @Path("/{id}")
    public Response createRecipe(@PathParam("id") int id) {
        boolean result = controller.removeRecipe(id);
        return Response.status(result ? 200 : 404).build();
    }

    @PUT
    @Consumes("application/json")
    @Path("/{id}")
    public Response changeRecipe(Recipe recipe, @PathParam("id") int id) {
        Recipe newRecipe = controller.updateRecipe(recipe, id);
        if(newRecipe == null) {
            return Response.status(404).build();
        }
        return Response.status(200).entity(newRecipe).build();
    }
}
