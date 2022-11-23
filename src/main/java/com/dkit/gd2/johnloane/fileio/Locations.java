package com.dkit.gd2.johnloane.fileio;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Locations implements Map<Integer, Location>
{
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args)
    {
        try(FileWriter locationsFile = new FileWriter("locations.txt"); FileWriter directionsFile = new FileWriter("directions.txt"))
        {
            for(Location location : locations.values())
            {
                locationsFile.write(location.getLocationID() +","+ location.getDescription() + "\n");
                for(String direction : location.getExits().keySet())
                {
                    directionsFile.write(location.getLocationID() +","+direction+","+location.getExits().get(direction)+"\n");
                }
            }
        }
        catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }


        //FileWriter locationsFile = null;

//        try
//        {
//            locationsFile = new FileWriter("locations.txt");
//            for(Location location : locations.values())
//            {
//                locationsFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
//            }
//        }
//        catch(IOException ioe)
//        {
//            System.out.println(ioe.getMessage());
//        }
//        finally
//        {
//            try
//            {
//                if(locationsFile != null)
//                {
//                    locationsFile.close();
//                }
//            }
//            catch(IOException ioe)
//            {
//                System.out.println(ioe.getMessage());
//            }
//        }
    }

    static
    {
        Scanner filereader = null;
        try
        {
            filereader = new Scanner(new FileReader("locations.txt"));
            filereader.useDelimiter(",");
            while(filereader.hasNextLine())
            {
                int loc = filereader.nextInt();
                filereader.skip(filereader.delimiter());
                String description = filereader.nextLine();
                System.out.println("Imported location: " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }
        }
        catch(IOException ioe)
        {
            System.out.println(ioe.getMessage());
        }
        finally
        {
            if(filereader != null)
            {
                filereader.close();
            }
        }

        //Now read the exits
//        try
//        {
//            filereader = new Scanner(new BufferedReader(new FileReader("directions.txt")));
//            filereader.useDelimiter(",");
//            while(filereader.hasNextLine())
//            {
//                String input = filereader.nextLine();
//                String[] data = input.split(",");
//                int loc = Integer.parseInt(data[0]);
//            }
//        }

//        Map<String, Integer> tempExit = new HashMap<>();
//        tempExit.put("W", 1);
//        tempExit.put("E", 2);
//        tempExit.put("N", 3);
//        tempExit.put("S", 4);
//        locations.put(0, new Location(0, "You enter this old building with a sign saying The Mouldy Boar. As you walk in you can feel the eyes of the adventurers inside staring at you knowing you are not from around here.....", tempExit));
//
//
//        tempExit.put("W", 5);
//        tempExit.put("E", 0);
//        tempExit.put("N", 6);
//        tempExit.put("S", 7);
//        locations.put(1, new Location(1, "Empty farm", tempExit));
//
//        tempExit.put("W", 0);
//        tempExit.put("E", 8);
//        tempExit.put("N", 9);
//        tempExit.put("S", 10);
//        locations.put(2, new Location(2, "A slightly less empty farm", tempExit));
    }
    @Override
    public int size()
    {
        return locations.size();
    }

    @Override
    public boolean isEmpty()
    {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key)
    {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value)
    {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key)
    {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value)
    {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key)
    {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m)
    {

    }

    @Override
    public void clear()
    {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet()
    {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values()
    {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet()
    {
        return locations.entrySet();
    }
}
