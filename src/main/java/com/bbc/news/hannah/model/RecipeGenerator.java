package com.bbc.news.hannah.model;

import com.bbc.news.hannah.model.Food;
import com.bbc.news.hannah.model.Recipe;
import com.bbc.news.hannah.model.Tool;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Getter
public class RecipeGenerator {

    public RecipeGenerator() {
    }

    public Map<Integer, Recipe> generateRecipes() {
        Map<Integer, Recipe> recipes = new HashMap();

        int foodId = 0;
        Food advocado = Food.builder().id(foodId).name("advocado").isLiquid(false).quantityUnit("").quantity(1).build();
        Food bread = Food.builder().id(foodId++).name("bread").isLiquid(false).quantityUnit("slice").quantity(1).build();
        Food banana = Food.builder().id(foodId++).name("banana").isLiquid(false).quantityUnit("").quantity(3).build();
        Food pizzaBase = Food.builder().id(foodId++).name("Pizza Base").isLiquid(false).quantityUnit("").quantity(1).build();
        Food tomatoSauce = Food.builder().id(foodId++).name("Tomatoe Sauce").isLiquid(false).quantityUnit("ml").quantity(500).build();
        Food pasta = Food.builder().id(foodId++).name("Pasta").isLiquid(false).quantityUnit("g").quantity(100).build();
        Food cheese = Food.builder().id(foodId++).name("Cheese").isLiquid(false).quantityUnit("g").quantity(10).build();

        int toolId = 0;
        Tool toaster = Tool.builder().id(toolId).name("toaster").build();
        Tool oven = Tool.builder().id(toolId++).name("oven").build();
        Tool saucepan = Tool.builder().id(toolId++).name("saucepan").build();
        Tool hob = Tool.builder().id(toolId++).name("hob").build();
        Tool spoon = Tool.builder().id(toolId++).name("spoon").build();

        long lastRecipeId = 0;
        Recipe advocadosOnToast = Recipe.builder()
                .id(lastRecipeId)
                .description("A pompsy brunch")
                .serves(1)
                .name("advocado on toast")
                .tool(toaster)
                .ingredient(bread)
                .ingredient(advocado)
                .instructions(new ArrayList(Arrays.asList("Toast bread", "Chop advocado", "Place advocado on toast")))
                .build();

        Recipe pizza = Recipe.builder()
                .id(lastRecipeId+1)
                .description("A simple magherritta pizza")
                .serves(1)
                .name("Magherritta Pizza")
                .tool(spoon)
                .tool(oven)
                .ingredient(pizzaBase)
                .ingredient(tomatoSauce)
                .ingredient(cheese)
                .instructions(new ArrayList(Arrays.asList("Spread sauce over pizza base", "Put cheese on sauce", "Cook in oven for 20 minutes")))
                .build();

        Recipe bananaBread = Recipe.builder()
                .id(lastRecipeId+2)
                .description("Some bread and banana")
                .serves(1)
                .name("Banana Bread")
                .ingredient(bread)
                .ingredient(banana)
                .instructions(new ArrayList(Arrays.asList("Add Banana to bread")))
                .build();

        Recipe cheesyPasta = Recipe.builder()
                .id(lastRecipeId+3)
                .description("Pasta and Cheese")
                .serves(1)
                .name("cheesy pasta")
                .tool(spoon)
                .tool(hob)
                .tool(saucepan)
                .ingredient(cheese)
                .ingredient(pasta)
                .instructions(new ArrayList(Arrays.asList("Toast bread", "Chop advocado", "Place advocado on toast")))
                .build();

        Recipe tomatoPasta = Recipe.builder()
                .id(lastRecipeId+4)
                .description("Tomatoey pasta")
                .serves(1)
                .name("Tomato Pasta")
                .tool(spoon)
                .tool(hob)
                .tool(saucepan)
                .ingredient(tomatoSauce)
                .ingredient(pasta)
                .instructions(new ArrayList(Arrays.asList("Boil Pasta on hob for 10 minutes", "Stir in Tomoato Sauce with spoon")))
                .build();
        recipes.put(advocadosOnToast.getId().intValue(), advocadosOnToast);
        recipes.put(pizza.getId().intValue(), pizza);
        recipes.put(bananaBread.getId().intValue(), bananaBread);
        recipes.put(cheesyPasta.getId().intValue(), cheesyPasta);
        recipes.put(tomatoPasta.getId().intValue(), tomatoPasta);
        return recipes;
    }
}
