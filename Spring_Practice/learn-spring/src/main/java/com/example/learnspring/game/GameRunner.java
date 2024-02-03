package com.example.learnspring.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	
	//private MarioGame game;
	//private SuperContra game;
	//private Pacman game;
	@Autowired
	private GamingConsole game;

	/*public GameRunner(MarioGame game) {
		
		this.game= game;
	}*/
	
	/*public GameRunner(SuperContra game) {
		this.game=game;
	}*/
	
	/*public GameRunner(Pacman game) {
	this.game=game;
}*/
	
	public GameRunner(GamingConsole game)
	{
		this.game=game;
	}

	public void run() {
		
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
