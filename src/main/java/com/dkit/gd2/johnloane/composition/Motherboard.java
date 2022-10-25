package com.dkit.gd2.johnloane.composition;

public class Motherboard
{

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;
    private boolean ssdCompatible;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios, boolean ssdCompatible)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
        this.ssdCompatible = ssdCompatible;
    }

    public void loadProgram(String programName)
    {
        System.out.println("Program " + programName + " is now loading");
    }

    public String getModel()
    {
        return model;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public int getRamSlots()
    {
        return ramSlots;
    }

    public int getCardSlots()
    {
        return cardSlots;
    }

    public String getBios()
    {
        return bios;
    }

    public boolean isSsdCompatible()
    {
        return ssdCompatible;
    }
}
