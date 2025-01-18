package com.rusticFrontier;

public class Food extends Item {
    private int foodBonus;

    public Food(String name, int quantity, int value, int foodBonus) {
        super(name, quantity, value);
        this.foodBonus = foodBonus;
    }

    public int getFoodBonus() {
        return foodBonus;
    }

    public void setFoodBonus(int foodBonus) {
        this.foodBonus = foodBonus;
    }
}
