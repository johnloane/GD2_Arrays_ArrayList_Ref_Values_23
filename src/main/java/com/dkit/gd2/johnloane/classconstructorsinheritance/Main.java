package com.dkit.gd2.johnloane.classconstructorsinheritance;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //testCar();
        //testAccount();
        //testVIP();
        testAnimals();
    }

    private static void testAnimals()
    {
        ArrayList<String> colours = new ArrayList<>();
        colours.add("White");
        colours.add("Orange");

        Dog missy = new Dog("Missy", colours, false, 20, 15.6, 13, "Dog", "Unknown", false, true, true, true);
        missy.eat();
    }

    private static void testVIP()
    {
        VIP person1 = new VIP();
        System.out.println(person1.getName());

        VIP craig = new VIP("Craig", 25000.0);
        System.out.println(craig.getName());

        VIP muhammad = new VIP("Muhammad", 100.0, "Muhammad@gmail.com");
        System.out.println(muhammad.getEmailAddress());
    }

    private static void testAccount()
    {
        Account dylansAccount = new Account();
        System.out.println(dylansAccount.getNumber());
        System.out.println(dylansAccount.getBalance());

        dylansAccount.withdraw(100.0);
        dylansAccount.deposit(50.0);
        dylansAccount.withdraw(100.0);
        dylansAccount.deposit(51.0);
        dylansAccount.withdraw(100.0);
    }

    private static void testCar()
    {
        Wheel tacomaWheel = new Wheel();
        Engine tacomaEngine = new Engine();
        ArrayList<String> tacomaAccessories = new ArrayList<>();
        tacomaAccessories.add("Air con");
        Car myTacoma = new Car(tacomaWheel, 5, "Toyota", 4, "Black", tacomaEngine, 2022, 0, "Manual", "Rear exit", 2, 60000,"Tacoma", tacomaAccessories, 1500, true, 500, false);
        System.out.println(myTacoma);
        //Car myCivic = new Car();
        myTacoma.setModel("Tacoma");
        System.out.println("Model is " + myTacoma.getModel());
    }
}
