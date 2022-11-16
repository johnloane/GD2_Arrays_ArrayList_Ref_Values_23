package com.dkit.gd2.johnloane.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable
{
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength)
    {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName()
    {
        return name;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }

    public int getStrength()
    {
        return strength;
    }

    public String getWeapon()
    {
        return weapon;
    }

    @Override
    public String toString()
    {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write()
    {
        List<String> values = new ArrayList<>();
        values.add(this.name);
        values.add("" + this.hitPoints);
        values.add("" + this.strength);
        values.add(this.weapon);
        return values;
    }

    @Override
    public void read(List<String> savedValues)
    {
        if(savedValues != null && savedValues.size() > 0)
        {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.weapon = savedValues.get(3);
        }
    }
}
