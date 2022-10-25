package com.dkit.gd2.johnloane.encapsulation;

public class Player
{
    private String name;
    private int hitPoints;
    private String weapon;

    public Player(String name, int hitPoints, String weapon)
    {
        this.name = name;
        if(hitPoints > 0 && hitPoints <= 20)
        {
            this.hitPoints = hitPoints;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage)
    {
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0)
        {
            System.out.println("The player is dead");
        }
    }

    public int getHitPoints()
    {
        return hitPoints;
    }
}
