package com.dkit.gd2.johnloane.encapsulation;

public class DoNotDoThisPlayer
{
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage)
    {
        this.health = this.health - damage;
        if(this.health <= 0)
        {
            System.out.println("The player is dead");
        }
    }

    public int healthRemaining()
    {
        return this.health;
    }
}
