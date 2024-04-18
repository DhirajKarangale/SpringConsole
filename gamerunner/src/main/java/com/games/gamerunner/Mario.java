package com.games.gamerunner;

public class Mario implements Game
{
    public String GetName()
    {
        return "Mario";
    }

    public void Up()
    {
        System.out.println("Jump");
    }   

    public void Down()
    {
        System.out.println("Down");
    }   

    public void Left()
    {
        System.out.println("Back");
    }   

    public void Right()
    {
        System.out.println("Forward");
    }   
}