package com.dkit.gd2.johnloane.encapsulation;

public class Main
{
    public static void main(String[] args)
    {
        testPlayers();
        /*
        Create a class that demonstrate proper encapsulation
        The class will be called Printer and will simulate a Computer Printer
        It should have fields for toner level, number of pages printed, and whether
        it can do two-sided printing.
        Add methods to fill up the toner up to a max of 100%, another method
        to simulate page printing which should increase the number of pages printed
         */

    }

    private static void testPlayers()
    {
        DoNotDoThisPlayer badPlayer = new DoNotDoThisPlayer();
        badPlayer.name = "F***";
        badPlayer.health = 1000000;
        badPlayer.weapon = "Mega Sword that kills everything";

        int damage = 10;
        badPlayer.loseHealth(damage);
        System.out.println("Remaining health = " + badPlayer.healthRemaining());

        damage = 11;
        badPlayer.health = 1000000;
        badPlayer.loseHealth(damage);
        System.out.println("Remaining health = " + badPlayer.healthRemaining());

        Player player = new Player("Dimitri", 200, "Sword");
        System.out.println("Initial health is " + player.getHitPoints());
    }
}
