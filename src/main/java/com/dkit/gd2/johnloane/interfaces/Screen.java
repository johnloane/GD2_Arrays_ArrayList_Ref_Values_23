package com.dkit.gd2.johnloane.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Screen
{
    private final String name;
    private List<Seat> seats = new ArrayList<>();

    public Screen(String name, int numRows, int seatsPerRow)
    {
        this.name = name;
        int lastRow = 'A' + (numRows-1);
        for(char row = 'A'; row <= lastRow; row++)
        {
            for(int seatNum=1; seatNum <= seatsPerRow; seatNum++)
            {
                double price = 12.00;
                if((row < 'D') && (seatNum >= 4 || seatNum <=9))
                {
                    price = 14.00;
                }
                else if((row > 'F') || (seatNum < 4 || seatNum > 9))
                {
                    price = 7.00;
                }

                Seat seat = new Seat(row+String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }

    }

    @Override
    public String toString()
    {
        return "Screen{" +
                "name='" + name + '\'' +
                ", seats=" + seats +
                '}';
    }
}
