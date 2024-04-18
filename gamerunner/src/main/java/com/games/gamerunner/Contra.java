package com.games.gamerunner;

public class Contra implements Game
{
    public String GetName()
    {
        return "Contra";
    }

    public void Up()
    {
        System.out.println("Shoot");
    }   

    public void Down()
    {
        System.out.println("Sit");
    }   

    public void Left()
    {
        System.out.println("Move Left");
    }   

    public void Right()
    {
        System.out.println("Move Right");
    } 
}