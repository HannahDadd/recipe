package com.bbc.news.hannah.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Builder
public class Book {
    private @NonNull @Getter Integer id;
    private @Getter @Setter String authorName;
    private @Getter @Setter String title;
    private @Getter @Setter List<Recipe> recipes;

    /**
     * Add recipe to books
     */
    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }
}
