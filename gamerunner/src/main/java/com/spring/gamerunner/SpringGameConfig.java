package com.spring.gamerunner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.games.gamerunner.Game;
import com.games.gamerunner.GameRunner;
import com.games.gamerunner.Mario;



@Configuration
public class SpringGameConfig 
{
    @Bean
    public Game Mario()
    {
        Game game = new Mario();
        return game;
    }

    @Bean
    public GameRunner Gamerunner(Game game)
    {
        GameRunner runner = new GameRunner(game);
        return runner;
    }
}