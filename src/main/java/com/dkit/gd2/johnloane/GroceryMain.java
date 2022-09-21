package com.dkit.gd2.johnloane;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GroceryMain
{
    private static Scanner keyboard = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args)
    {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while(!quit)
        {
            System.out.println("Enter your choice: ");
            try
            {
                choice = keyboard.nextInt();
            }
            catch(InputMismatchException ime)
            {
                choice = -1;
            }
            keyboard.nextLine();

            switch(choice)
            {
                //Homework use an enum for the options instead of 0->6 case PRINT_INSTRUCTIONS, case ADD etc
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
                default:
                    System.out.println("Not a valid input. Enter a number between 0 and 6");
            }
        }
    }

    private static void searchForItem()
    {
        System.out.println("Enter item to search for: ");
        String searchItem = keyboard.nextLine();
        if(groceryList.onFile(searchItem))
        {
            System.out.println("Found " + searchItem);
        }
        else
        {
            System.out.println(searchItem + ", was not found");
        }
    }

    private static void removeItem()
    {
        System.out.println("Enter item to remove: ");
        String itemToRemove = keyboard.nextLine();
        groceryList.removeGroceryItem(itemToRemove);
    }

    private static void modifyItem()
    {
        System.out.println("Please enter item to modify: ");
        String itemToModify = keyboard.nextLine();
        System.out.println("Please enter new value: ");
        String newValue = keyboard.nextLine();
        groceryList.modifyGroceryItem(itemToModify, newValue);
    }

    private static void addItem()
    {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(keyboard.nextLine());
    }

    private static void printInstructions()
    {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove and item from the list");
        System.out.println("\t 5 - To search am item in the list");
        System.out.println("\t 6 - To quit the application");
    }
}
