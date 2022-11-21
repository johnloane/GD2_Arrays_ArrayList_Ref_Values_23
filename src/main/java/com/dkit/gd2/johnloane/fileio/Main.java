package com.dkit.gd2.johnloane.fileio;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main
{
    private static Locations locations = new Locations();

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");

        int loc = 0;

        while(true)
        {
            System.out.println(locations.get(loc).getDescription());

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for(String exit : exits.keySet())
            {
                System.out.print(exit + ", ");
            }
            System.out.println();
            System.out.print("Where would you like to go (N, S, E, W):");
            String direction = keyboard.nextLine().toUpperCase();
            if(direction.length() > 1)
            {
                String[] words = direction.split(" ");
                for(String word : words)
                {
                    if(vocabulary.containsKey(word))
                    {
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }

            if(exits.containsKey(direction))
            {
                loc = exits.get(direction);
            }
            else
            {
                System.out.println("You cannot go in that direction");
            }

        }
    }


}
