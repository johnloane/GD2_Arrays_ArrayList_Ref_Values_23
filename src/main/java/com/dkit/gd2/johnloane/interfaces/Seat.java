package com.dkit.gd2.johnloane.interfaces;

public class Seat implements Comparable<Seat>
{
    private final String seatNumber;
    private double price;
    private boolean reserved = false;

    public Seat(String seatNumber, double price)
    {
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public String getSeatNumber()
    {
        return seatNumber;
    }

    public double getPrice()
    {
        return price;
    }

    public boolean isReserved()
    {
        return reserved;
    }

    @Override
    public int compareTo(Seat seat)
    {
        return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
    }

    @Override
    public String toString()
    {
        return "Seat{" +
                "seatNumber='" + seatNumber + '\'' +
                ", price=" + price +
                ", reserved=" + reserved +
                '}';
    }

    public boolean reserve()
    {
        if(!this.reserved)
        {
            this.reserved = true;
            System.out.println("Seat " + seatNumber + " reserved");
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean cancel()
    {
        if(this.reserved)
        {
            this.reserved = false;
            System.out.println("Reservation of seat " + seatNumber + " cancelled");
            return true;
        }
        else
        {
            return false;
        }
    }
}
