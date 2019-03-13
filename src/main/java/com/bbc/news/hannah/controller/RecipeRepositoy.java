package com.bbc.news.hannah.controller;

import com.bbc.news.hannah.model.Recipe;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.List;

public class RecipeRepositoy implements RecipeControllerInterface {
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private final String recipeByIdQuery = "SELECT recipes.name, recipes.description, recipes.recipe_id FROM recipes WHERE recipes.recipe_id = ";
    private final String instructionsByRecipeIdQuery = "SELECT instructions.instruction FROM recipes" +
            "  INNER JOIN instructions ON recipes.recipe_id=instructions.recipe_id WHERE recipes.recipe_id = ";

    public RecipeRepositoy(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public Recipe getRecipeById(int id) {
        List<Recipe> recipes = namedParameterJdbcTemplate.query(recipeByIdQuery + 1 + ";",
                (rs, rowNum) -> Recipe.builder()
                                .id(rs.getLong("recipe_id"))
                                .description(rs.getString("description"))
                                .name(rs.getString("name")).build()
        );
        List<String> strings = namedParameterJdbcTemplate.query("SELECT * from recipes;",
                (rs, rowNum) -> "Hello"
        );
        System.out.println("🦖🦖🦖🦖🦖🦖🦖🦖🦖🦖🦖🦖");
        System.out.println(strings);
        return recipes.get(0);
    }

    @Override
    public Recipe addRecipe(Recipe recipe) {
        return null;
    }

    @Override
    public List<Recipe> allRecipes() {
        return null;
    }

    @Override
    public Recipe updateRecipe(Recipe recipe, int id) {
        return null;
    }

    @Override
    public boolean removeRecipe(int id) {
        return false;
    }
}
