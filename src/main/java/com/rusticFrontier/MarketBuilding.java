package com.rusticFrontier;

public class MarketBuilding extends Building {
    private int income;
    public MarketBuilding(String name, int lvlUnlock, Boolean playerIsOwner, int income) {
        super(name, lvlUnlock, playerIsOwner);
        this.income = income;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}
