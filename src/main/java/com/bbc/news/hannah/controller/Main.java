package com.bbc.news.hannah.controller;

import com.bbc.news.hannah.model.Book;
import com.bbc.news.hannah.model.Food;
import com.bbc.news.hannah.model.Recipe;
import com.bbc.news.hannah.model.Tool;

public class Main {
    public static void main(String[] args) {

        Food advocado = new Food(1,"advocado", false, "advocados", 1);
        Food bread = new Food(2, "bread", false, "slice", 1);
        Tool toaster = new Tool(1, "toaster");

        Recipe recipe = new Recipe(1, "A pompsy brunch", 1, "advocado on toast");
        recipe.addIngredient(advocado);
        recipe.addIngredient(bread);
        recipe.addTool(toaster);
        recipe.addInstruction("Toast bread");
        recipe.addInstruction("Chop advocado");
        recipe.addInstruction("Place advocado on toast");

        Book book = new Book(1, "Hannah", "Book the First");
        book.addRecipe(recipe);

        System.out.println(book.getRecipes().get(0).getRecipe());
    }
}
