package com.dkit.gd2.johnloane.mobileapp;

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

    private static void turnOnPhone()
    {
        System.out.println("Turning on the phone");
    }

    private static void printActions()
    {
        System.out.println("Available actions : \n press");
        System.out.println("0 - to shutdown\n" +
                            "1 - to print contacts\n"+
                            "2 - to add new contacts\n"+
                            "3 - to update existing contact\n"+
                            "4 - to remove contacts\n"+
                            "5 - to query if contact exists\n"+
                            "6 - to print options\n"
        );
        System.out.println("Choose your action: ");
    }



    private static void queryContact()
    {
        System.out.println("Enter existing contact name: ");
        String name = keyboard.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null)
        {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
    }

    private static void removeContact()
    {
        System.out.println("Enter existing contact name: ");
        String name = keyboard.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null)
        {
            System.out.println("Contact not found");
            return;
        }
        if(mobilePhone.removeContact(existingContactRecord))
        {
            System.out.println("Successfully deleted");
        }
        else
        {
            System.out.println("Error deleting the contact");
        }
    }

    private static void updateContact()
    {
        System.out.println("Enter existing contact name: ");
        String name = keyboard.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if(existingContact == null)
        {
            System.out.println("Contact was not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = keyboard.nextLine();
        System.out.println("Enter the new contact phone number: ");
        String newNumber = keyboard.nextLine();
        System.out.println("Enter relationship with new contact: ");
        String newRelationship = keyboard.nextLine();
        Contact newContact = Contact.createContact(newName, newRelationship, newNumber);
        if(mobilePhone.updateContact(existingContact, newContact))
        {
            System.out.println("Successfully updated");
        }
        else
        {
            System.out.println("Error updating the record");
        }
    }

    private static void addNewContact()
    {
        System.out.println("Enter the new contact name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter the phone number: ");
        String phoneNumber = keyboard.nextLine();
        System.out.println("Enter relationship: ");
        String relationship = keyboard.nextLine();
        Contact newContact = Contact.createContact(name, relationship, phoneNumber);
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
