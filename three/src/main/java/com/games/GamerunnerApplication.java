package com.games;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GamerunnerApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(GamerunnerApplication.class, args);

		// Game mario = new Mario();
		Game contra = new Contra();
		GameRunner gameRunner = new GameRunner(contra);
		gameRunner.Run();
	}
}