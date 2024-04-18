package com.games.gamerunner;

public class GameRunner 
{
    private Game game;

    public GameRunner(Game game) 
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