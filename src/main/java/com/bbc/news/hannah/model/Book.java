package com.bbc.news.hannah.model;

import java.util.ArrayList;
import java.util.List;

public class Book {
    int id;
    String authorName;
    String name;
    List<Recipe> recipes;

    public Book(int id, String authorName, String title) {
        this.id = id;
        this.authorName = authorName;
        this.name = title;
        recipes = new ArrayList();
    }

    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public List<Recipe> getRecipes() {
        return recipes;
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
