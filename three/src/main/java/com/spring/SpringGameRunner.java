package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.games.Game;
import com.games.GameRunner;

@Configuration
@ComponentScan("package com.games") // Spring search Gamerunner(game) "game" in this package
public class SpringGameRunner 
{
    public static void main(String[] args) 
    {
        var context = new AnnotationConfigApplicationContext(SpringGameRunner.class);

        context.getBean(Game.class).Up();
        context.getBean(GameRunner.class).Run();

        context.close();
    }
}