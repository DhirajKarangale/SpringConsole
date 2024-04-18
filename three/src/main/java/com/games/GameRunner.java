package com.games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner 
{
    private Game game;

    public GameRunner(@Qualifier("Mario") Game game) 
    {
        this.game = game;
    }
    
    public void Run()
    {
        System.out.println("Running game : " + game.GetName());

        game.Up();
        game.Down();
        game.Left();
        game.Right();
    }
}