package com.rusticFrontier;

public class Building {
    private String name;
    private int lvlUnlock;
    private Boolean playerIsOwner;


    public Building(String name, int lvlUnlock, Boolean playerIsOwner) {
        this.name = name;
        this.lvlUnlock = lvlUnlock;
        this.playerIsOwner = playerIsOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvlUnlock() {
        return lvlUnlock;
    }

    public void setLvlUnlock(int lvlUnlock) {
        this.lvlUnlock = lvlUnlock;
    }
}
