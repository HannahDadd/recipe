package com.bbc.news.hannah.model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {

    int id;
    List<Food> ingredients;
    List<String> instructions;
    List<Tool> toolsNeeded;
    String description;
    String name;
    int serves;


    public Recipe(int id, String description, int serves, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.serves = serves;
        this.instructions = new ArrayList();
        this.toolsNeeded = new ArrayList();
        this.ingredients = new ArrayList();
    }

    /**
     * Print a recipe
     */
    public String getRecipe() {
        String recipe = "You will need: \n";
        for(Food f : ingredients) {
            recipe = recipe + f.getIngredient() + "\n";
        }
        recipe = recipe + "Method: \n";
        for (String s : instructions) {
            recipe = recipe + s + "\n";
        }
        return recipe;
    }

    /**
     * Add instruction to recipe
     */
    public void addInstruction(String instruction) {
        instructions.add(instruction);
    }

    /**
     * Add ingredient to recipe
     */
    public void addIngredient(Food food) {
        ingredients.add(food);
    }

    /**
     * Add Tool to recipe
     */
    public void addTool(Tool tool) {
        toolsNeeded.add(tool);
    }

    /**
     * Remove tool from recipe
     */
    public void removeTool(Tool tool) {
        List<Tool> newTools = new ArrayList();
        for(Tool t : toolsNeeded) {
            if(!t.equals(tool)) {
                newTools.add(t);
            }
        }
        toolsNeeded = newTools;
    }

    public List<Tool> getToolsNeeded() {
        return toolsNeeded;
    }

    public void setToolsNeeded(List<Tool> toolsNeeded) {
        this.toolsNeeded = toolsNeeded;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Food> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Food> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getServes() {
        return serves;
    }

    public void setServes(int serves) {
        this.serves = serves;
    }
}
