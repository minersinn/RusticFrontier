package com.rusticFrontier;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Inventory playerInventory = new Inventory();
    static int playerOption = 0;
    static int playerLevel;
    static int playerXP;
    static Random random = new Random();
    private static boolean playLoop = true;

    public static void main(String[] args) {

        //Start - Initialization
        Item rock = new Item("Rock", 0, 1);

        //Start - Character creation
        System.out.println("What is your name, adventurer?");
        String username = scanner.nextLine();
        Character mainCharacter = new Character(username);
        System.out.println("Hello there, " + mainCharacter.getName() + ", you have $" + mainCharacter.getMoney());

        //Level 0 - Tutorial
        playerLevel = 0;
        playerXP = 0;
        String welcomeText = """
                Welcome to Rustic Pines. I'd like to help you get started with your adventure.
                Here you can explore, gather resources, craft items, and visit the market.
                Let's start with gathering a few items. Look around for some sticks and rocks
                Use numbers to make choices.
                """;
        System.out.println(welcomeText);
        do {
            toDoList(playerLevel);
        } while (playLoop);

    }

    static void toDoList(int playerLevel) {
        String level0Choices = """
                    1. Search for rocks
                    2. Search for sticks
                """;
        do {
            System.out.println(level0Choices);
            try {
                playerOption = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                String numberErrorText = "You need to use a number to chose an option.\n";
                System.out.println(numberErrorText);
            }
        } while (playerOption != 1 && playerOption != 2);


        if (playerOption == 1) {
            addRock();
        } else {
            addStick();
        }
        playerInventory.displayInventory();
    }


    static void addRock() {
        int qty = random.nextInt(3);
        if (qty == 1) {
            playerInventory.addItem("Rock", qty, 1);
            System.out.println("You found a rock!");
            System.out.println("Added " + qty + " rock to your inventory.");
        } else if (qty > 1) {
            playerInventory.addItem("Rock", qty, 1);
            System.out.println("You found a rock!");
            System.out.println("Added " + qty + " rocks to your inventory.");
        } else {
            System.out.println("You didn't find anything.");
        }
    }

    static void addStick() {
        int qty = random.nextInt(6);
        if (qty == 1) {
            playerInventory.addItem("Stick", qty, 1);
            System.out.println("You found a stick!");
            System.out.println("Added " + qty + " stick to your inventory.");
        } else if (qty > 1) {
            playerInventory.addItem("Stick", qty, 1);
            System.out.println("You found a stick!");
            System.out.println("Added " + qty + " sticks to your inventory.");
        } else {
            System.out.println("You didn't find anything.");
        }
    }
}