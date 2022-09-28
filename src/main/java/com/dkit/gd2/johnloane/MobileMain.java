package com.dkit.gd2.johnloane;

import java.util.Scanner;

public class MobileMain
{
    private static Scanner keyboard = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("087-7799234", "Three");
    public static void main(String[] args)
    {
        boolean quit = false;
        turnOnPhone();
        printActions();

        while(!quit)
        {
            System.out.println("Enter action: (6 to show available actions");
            int action = keyboard.nextInt();
            keyboard.nextLine();

            switch(action)
            {
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void updateContact()
    {

    }

    private static void addNewContact()
    {
        System.out.println("Enter the new contact name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter the phone number: ");
        String phoneNumber = keyboard.nextLine();
        System.out.println("Enter relationship: ");
        String relationship = keyboard.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber, relationship);
        if(mobilePhone.addNewContact(newContact))
        {
            System.out.println("New contact added: name =" + name + " ,phone = " + phoneNumber);
        }
        else
        {
            System.out.println("Cannot add " + name + " already exists");
        }
    }

}
