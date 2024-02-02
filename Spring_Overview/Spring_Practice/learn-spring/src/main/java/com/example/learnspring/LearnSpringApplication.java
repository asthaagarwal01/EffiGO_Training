package com.example.learnspring;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.learnspring.game.GameRunner;
import com.example.learnspring.game.SuperContra;

@SpringBootApplication
public class LearnSpringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(LearnSpringApplication.class, args);
		
		//MarioGame game= new MarioGame();
		SuperContra game= new SuperContra();
		GameRunner runner= new GameRunner(game);
		runner.run();
	}

}
