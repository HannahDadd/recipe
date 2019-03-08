package com.bbc.news.hannah.controller;

import com.bbc.news.hannah.model.Recipe;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.hamcrest.core.IsEqual;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecipeControllerInMemoryImplTest {
    private RecipeControllerInMemoryImpl controller;

    @Before
    public void setup() {
        // regenerates all the values in the recipes map before each test
        controller = new RecipeControllerInMemoryImpl();
    }

    @Test
    public void fiveRecipesAutomaticallyGenerated() {
        MatcherAssert.assertThat(controller.getRecipes().size(), IsEqual.equalTo(5));
        MatcherAssert.assertThat(controller.getId(), IsEqual.equalTo(4));
    }

    /**
     * Get
     */
    @Test
    public void getRecipeWithValidId() {
        MatcherAssert.assertThat(controller.getRecipeById(0).getName(), IsEqual.equalTo("advocado on toast"));
        MatcherAssert.assertThat(controller.getRecipeById(0), IsInstanceOf.instanceOf(Recipe.class));
    }

    @Test
    public void getRecipeWithInvalidID() {
        MatcherAssert.assertThat(controller.getRecipeById(10), IsEqual.equalTo(null));
    }

    @Test
    public void getAllRecipesReturnsCorrectly() {
        MatcherAssert.assertThat(controller.allRecipes().size(), IsEqual.equalTo(5));
        MatcherAssert.assertThat(controller.allRecipes(), IsInstanceOf.instanceOf(ArrayList.class));
        MatcherAssert.assertThat(controller.allRecipes().get(0), IsInstanceOf.instanceOf(Recipe.class));
    }

    /**
     * Add
     */
    @Test
    public void addRecipeWithValidRecipe() {
        Recipe testRecipe = Recipe.builder()
                .description("Test")
                .serves(1)
                .name("Test")
                .instructions(new ArrayList(Arrays.asList("Test")))
                .build();
        MatcherAssert.assertThat(controller.addRecipe(testRecipe).getName(), IsEqual.equalTo("Test"));
        MatcherAssert.assertThat(controller.getRecipes().size(), IsEqual.equalTo(6));
    }

    @Test
    public void addRecipeWithInvalidRecipe() {
        MatcherAssert.assertThat(controller.getRecipes().size(), IsEqual.equalTo(5));
        MatcherAssert.assertThat(controller.addRecipe(null), IsEqual.equalTo(null));
    }

    /**
     * Delete
     */
    @Test
    public void deleteRecipeWithValidId() {
        MatcherAssert.assertThat(controller.removeRecipe(0), IsEqual.equalTo(true));
        MatcherAssert.assertThat(controller.getRecipes().size(), IsEqual.equalTo(4));
    }

    @Test
    public void deleteRecipeWithInvalidId() {
        MatcherAssert.assertThat(controller.removeRecipe(10), IsEqual.equalTo(false));
        MatcherAssert.assertThat(controller.getRecipes().size(), IsEqual.equalTo(5));
    }

    /**
     * Update
     */
    @Test
    public void updateRecipeWithValidParams() {
        Recipe testRecipe = Recipe.builder()
                .description("Test")
                .serves(1)
                .name("Test")
                .instructions(new ArrayList(Arrays.asList("Test")))
                .build();
        MatcherAssert.assertThat(controller.updateRecipe(testRecipe, 0), IsInstanceOf.instanceOf(Recipe.class));
        MatcherAssert.assertThat(controller.updateRecipe(testRecipe, 0).getName(), IsEqual.equalTo("Test"));
        MatcherAssert.assertThat(controller.getRecipes().size(), IsEqual.equalTo(5));
    }

    @Test
    public void updateRecipeWithInvalidRecipe() {
        MatcherAssert.assertThat(controller.updateRecipe(null, 0), IsEqual.equalTo(null));
        MatcherAssert.assertThat(controller.getRecipes().size(), IsEqual.equalTo(5));
    }

    @Test
    public void updateRecipeWithInvalidId() {
        Recipe testRecipe = Recipe.builder()
                .description("Test")
                .serves(1)
                .name("Test")
                .instructions(new ArrayList(Arrays.asList("Test")))
                .build();
        MatcherAssert.assertThat(controller.updateRecipe(testRecipe, 10), IsEqual.equalTo(null));
        MatcherAssert.assertThat(controller.getRecipes().size(), IsEqual.equalTo(5));
    }
}
