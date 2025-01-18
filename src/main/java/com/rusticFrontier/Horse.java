package com.rusticFrontier;

public class Horse extends Animal{
    private String name;
    public Horse(String type, int quantity, int value, String name) {
        super(type, quantity, value);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
