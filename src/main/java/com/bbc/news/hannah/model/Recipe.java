package com.bbc.news.hannah.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
public class Recipe {

    private @NonNull @Getter Integer id;
    @Singular private @Getter @Setter List<Food> ingredients;
    @Singular private @Getter @Setter List<String> instructions;
    @Singular private @Getter @Setter List<Tool> tools;
    private @Getter @Setter String description;
    private @Getter @Setter String name;
    private @Getter @Setter int serves;

    /**
     * Print a recipe
     */
    public String getRecipe() {
        String recipe = "You will need: \n";
        for(Food f : ingredients) {
            recipe = recipe + f.getQuantity() + " " + f.getQuantityUnit() + " of " + f.getName() + "\n";
        }
        recipe = recipe + "Method: \n";
        for (String s : instructions) {
            recipe = recipe + s + "\n";
        }
        return recipe;
    }

    /**
     * Remove tool from recipe
     */
    public void removeTool(Tool tool) {
        List<Tool> newTools = new ArrayList();
        for(Tool t : tools) {
            if(!t.equals(tool)) {
                newTools.add(t);
            }
        }
        tools = newTools;
    }
}
