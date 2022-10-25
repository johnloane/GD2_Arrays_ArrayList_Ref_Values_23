package com.dkit.gd2.johnloane.composition;

public class Monitor
{
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;
    private int refreshRate;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution, int refreshRate)
    {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
        this.refreshRate = refreshRate;
    }

    public void drawPixelAt(int x, int y, String colour)
    {
        System.out.println("Drawing a pixel at " + x + " ," + y + " in colour " + colour);
    }

    public String getModel()
    {
        return model;
    }

    public String getManufacturer()
    {
        return manufacturer;
    }

    public int getSize()
    {
        return size;
    }

    public Resolution getNativeResolution()
    {
        return nativeResolution;
    }

    public int getRefreshRate()
    {
        return refreshRate;
    }
}
