package com.rusticFrontier;

public class Character {
    private String name;
    private int money = 100;
    private int health = 0;

    public Character(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}
