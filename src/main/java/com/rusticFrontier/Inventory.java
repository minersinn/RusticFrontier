package com.rusticFrontier;

import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory(){
        items = new ArrayList<>();
    }

    public void addItem(String name, int quantity, int value) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new Item(name, quantity, value)); // Add new item if it doesn't exist
    }

    public void displayInventory(){
        for (Item item : items){
            System.out.println(item.toString());
        }
    }
}
