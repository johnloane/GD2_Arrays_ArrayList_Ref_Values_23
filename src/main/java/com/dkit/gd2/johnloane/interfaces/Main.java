package com.dkit.gd2.johnloane.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //testITelphone();
        /* Write a method that takes an object that implements ISaveable as parameters and saves the values
        You method should just print the values to the screen
        Also in main. Write a method that restores the values to a saveable object
        Use read() method to simulate file IO
         */
        /* Add a Monster class - name, hitpoints, strength and should be saved and loaded, add toString(), test the Monster class in main....
         */
        //testISaveable();
        testScreen();

    }

    private static void testScreen()
    {
        Screen screenOne = new Screen("Screen One", 8, 15 );

        if(screenOne.reserveSeat("D12"))
        {
            System.out.println("Please pay for D12");
        }
        else
        {
            System.out.println("The seat is already reserved");
        }

        if(screenOne.reserveSeat("D12"))
        {
            System.out.println("Please pay for D12");
        }
        else
        {
            System.out.println("The seat is already reserved");
        }

        if(screenOne.reserveSeat("Z12"))
        {
            System.out.println("Please pay for Z12");
        }
        else
        {
            System.out.println("The seat is already reserved");
        }

        printList(screenOne.getSeats());

        List<Seat> reverseSeats = new ArrayList<>(screenOne.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);

        List<Seat> priceSeats = new ArrayList<>(screenOne.getSeats());
        Collections.sort(priceSeats, new SeatPriceComparator());
        printList(priceSeats);

    }

    private static void printList(List<Seat> seats)
    {
        for(Seat seat : seats)
        {
            System.out.print(" " + seat.getSeatNumber() + " €" + seat.getPrice());
        }
        System.out.println();
        System.out.println("=================================");
    }

    private static void testISaveable()
    {
        Player daniel = new Player("Daniel", 10, 15);
        System.out.println(daniel.toString());
        saveObject(daniel);
        loadObject(daniel);
        System.out.println(daniel);

        ISaveable goblin = new Monster("Goblin", 10, 10);
        System.out.println("Strength = " + ((Monster)goblin).getStrength());
    }

    private static void saveObject(ISaveable objectToSave)
    {
        for(String currentString : objectToSave.write())
        {
            System.out.println("Saving " + currentString + " to storage device");
        }
    }

    private static void loadObject(ISaveable objectToLoad)
    {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

    private static ArrayList<String> readValues()
    {
        ArrayList<String> values = new ArrayList<>();

        Scanner keyboard = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" + "1 to enter a string\n" + "0 to quit");

        while(!quit)
        {
            System.out.println("Choose an option: ");
            int choice = keyboard.nextInt();
            keyboard.nextLine();
            switch (choice)
            {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = keyboard.nextLine();
                    values.add(stringInput);
                    break;
            }
        }
        return values;
    }

    private static void testITelphone()
    {
        ITelephone johnsPhone = new Landline("042-932400");
        johnsPhone.dial("1234");
        johnsPhone.answer();

        ITelephone craigsPhone = new MobilePhone("083-1234345");
        craigsPhone.powerOn();
        craigsPhone.callPhone("123");
        craigsPhone.answer();
    }
}
