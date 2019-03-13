package com.bbc.news.hannah.model;

import lombok.Getter;
import lombok.Builder;
import lombok.Singular;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Builder(toBuilder = true)
@Getter
public class Recipe {

    private Long id;
    private String description;
    private String name;
    private int serves;
    @Singular private List<Food> ingredients;
    @Singular private List<String> instructions;
    @Singular private List<Tool> tools;

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
