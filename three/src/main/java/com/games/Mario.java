package com.games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// Spring Create instance of Class, we don't need to create instance manually by any @Bean Function
@Component
@Qualifier("Mario")
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