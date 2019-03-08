package com.bbc.news.hannah.controller;

import com.bbc.news.hannah.model.Recipe;

import java.util.List;

public interface RecipeControllerInterface {

    // get recipe by id
    public Recipe getRecipeById(int id);

    // add new recipe
    public Recipe addRecipe(Recipe recipe);

    // get all recipes
    public List<Recipe> allRecipes();

    // add to a recipe
    public Recipe updateRecipe(Recipe recipe, int id);

    // delete recipe
    public boolean removeRecipe(int id);
}
