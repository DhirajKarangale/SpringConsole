package com.spring.gamerunner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.games.gamerunner.Game;
import com.games.gamerunner.GameRunner;



public class SpringGames 
{
    public static void main(String[] args)
    {
        var context = new AnnotationConfigApplicationContext(SpringGameConfig.class);
        
        // context.getBean(Game.class).Up();
        context.getBean(GameRunner.class).Run();
        
        context.close();
    }        
}