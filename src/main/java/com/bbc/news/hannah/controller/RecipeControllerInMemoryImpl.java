package com.bbc.news.hannah.controller;

import com.bbc.news.hannah.model.RecipeGenerator;
import com.bbc.news.hannah.model.Recipe;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
public class RecipeControllerInMemoryImpl implements RecipeControllerInterface {
    private Map<Integer, Recipe> recipes;
    private int id;

    public RecipeControllerInMemoryImpl() {
        RecipeGenerator generator = new RecipeGenerator();
        recipes = generator.generateRecipes();
        id = 4;
    }

    public Recipe getRecipeById(int id) {
        return recipes.get(id);
    }

    public Recipe addRecipe(Recipe recipe) {
        if(recipe == null) {
            return null;
        }
        id = id + 1;
        Recipe recipeAdded = recipe.toBuilder().id(id).build();
        recipes.put(id, recipeAdded);
        return recipeAdded;
    }

    public List<Recipe> allRecipes() {
        return new ArrayList<Recipe>(recipes.values());
    }

    public Recipe updateRecipe(Recipe recipe, int id) {
        if(recipes.get(id) == null) {
            return null;
        }
        id = id + 1;
        recipes.remove(id);
        recipes.put(id, recipe);
        return recipe;
    }

    public boolean removeRecipe(int id) {
        if(recipes.get(id) == null) {
            return false;
        }
        recipes.remove(id);
        return true;
    }
}
