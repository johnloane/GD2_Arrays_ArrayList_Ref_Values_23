package com.dkit.gd2.johnloane.enums;

import java.awt.*;
import java.util.Scanner;

public class Main
{
    private static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println(Colours.BLUE + "Welcome to the banking application" + Colours.RESET);

        MenuOptions selectedOption = MenuOptions.CONTINUE;

        while(selectedOption != MenuOptions.QUIT)
        {
            try
            {
                //print the menu, get user input, act on the input, exit loop on quit
                printMenu();
                selectedOption = MenuOptions.values()[Integer.parseInt(keyboard.nextLine().trim())];

                switch(selectedOption)
                {
                    case CREATE_BANK:
                        createBank();
                        break;
                    case ADD_BRANCH:
                        //addBranch();
                        break;
                    case ADD_CUSTOMER:
                        //addCustomer();
                        break;
                    case QUIT:
                        break;
                    default:
                        System.out.println("Not a valid option. Please try again");
                }
            }
            catch(IllegalArgumentException e)
            {
                System.out.println(Colours.RED + "Selection out of range" + Colours.RESET);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(Colours.RED + "Selection out of range" + Colours.RESET);
            }
        }

    }

    private static void createBank()
    {
        System.out.println("Creating a bank");
    }

    private static void printMenu()
    {
        System.out.println("\nEnter: ");
        System.out.println("\t 1. Create bank");
        System.out.println("\t 2. Add a branch to a bank ");
        System.out.println("\t 3. Add a customer to a branch ");
        System.out.println("\t 4. Customer transaction: ");
        System.out.println("\t 5. Display banks, branches, customers, transactions ");
        System.out.println("\t 6. Quit ");
    }
}
