package com.example.learnspring.game;

public class GameRunner {
	
	//private MarioGame game;
	private SuperContra game;

	/*public GameRunner(MarioGame game) {
		
		this.game= game;
	}*/
	
	public GameRunner(SuperContra game) {
		this.game=game;
	}

	public void run() {
		
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
