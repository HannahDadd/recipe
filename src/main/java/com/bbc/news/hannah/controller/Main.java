package com.bbc.news.hannah.controller;

import com.bbc.news.hannah.model.Book;
import com.bbc.news.hannah.model.Food;
import com.bbc.news.hannah.model.Recipe;
import com.bbc.news.hannah.model.Tool;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;

@Slf4j
public class Main {


    public static void main(String[] args) {


        int foodId = 0;
        Food advocado = Food.builder().id(foodId).name("advocado").isLiquid(false).quantityUnit("avocados").quantity(1).build();
        Food bread = Food.builder().id(foodId++).name("bread").isLiquid(false).quantityUnit("slice").quantity(1).build();
        Tool toaster = Tool.builder().id(1).name("toaster").build();

        Recipe recipe = Recipe.builder()
                .id(1)
                .description("A pompsy brunch")
                .serves(1)
                .name("advocado on toast")
                .tool(toaster)
                .ingredient(bread)
                .ingredient(advocado)
                .instructions(new ArrayList(Arrays.asList("Toast bread", "Chop advocado", "Place advocado on toast")))
                .build();

        Book book = Book.builder().id(1).authorName("Hannah").title("Book the First").recipe(recipe).build();
        log.info(book.getRecipes().get(0).getRecipe());
    }
}
