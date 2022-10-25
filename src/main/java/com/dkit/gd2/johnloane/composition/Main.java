package com.dkit.gd2.johnloane.composition;

public class Main
{
    public static void main(String[] args)
    {
        //playWithPCs();
        playWithRooms();
    }

    private static void playWithRooms()
    {
        /* Create a single room of a house using composition
    Think about the things that should be included in the room
    This could be physical parts of the house as well as furniture
    Add at least one methods to access an object via a getter and
    then the objects public method
    Then add at least one method to hide the object e.g not using
    a getter but access the object used in composition within the main
    class as in the last example
     */

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, "White");

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();
    }

    private static void playWithPCs()
    {
        Dimensions caseDimensions = new Dimensions(25, 75, 50);
        Case pcCase = new Case("220B", "Dell", "240", caseDimensions);
        Resolution monitorResolution = new Resolution(2560, 1440);
        Monitor pcMonitor = new Monitor("27 inch mega monitor", "Acer", 27, monitorResolution, 165);
        Motherboard pcMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v3.77", true);
        PC myPC = new PC(pcCase, pcMonitor, pcMotherboard);
        myPC.powerUp();
    }



}
