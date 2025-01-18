package com.rusticFrontier;

public class Tool extends Item{
    private int hp;

    public Tool(String name, int quantity, int value, int hp) {
        super(name, quantity, value);
        this.hp = hp;
    }
}
