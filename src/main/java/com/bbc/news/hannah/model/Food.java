package com.bbc.news.hannah.model;

public class Food {
    int id;
    int quantity;
    String name;
    String quantityUnit;
    boolean isLiquid;

    public Food(int id, String name, boolean isLiquid, String quantityUnit, int quantity) {
        this.id = id;
        this.name = name;
        this.isLiquid = isLiquid;
        this.quantityUnit = quantityUnit;
        this.quantity = quantity;
    }

    public String getIngredient() {
        return quantity + " " + quantityUnit + " of " + name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLiquid() {
        return isLiquid;
    }

    public void setLiquid(boolean liquid) {
        isLiquid = liquid;
    }

    public String getQuantityUnit() {
        return quantityUnit;
    }

    public void setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
