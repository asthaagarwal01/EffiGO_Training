package com.example.learnspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.learnspring.game.GameRunner;

@SpringBootApplication
public class LearnSpringApplication {

    public static void main(String[] args) {
        // Spring application context
        ConfigurableApplicationContext context = SpringApplication.run(LearnSpringApplication.class, args);

        // MarioGame game= new MarioGame();
        // SuperContra game= new SuperContra();
        // Pacman game= new Pacman();

        // GamingConsole game= new MarioGame();
        // GameRunner runner= new GameRunner(game);

        // bean creates an instance of the class
        GameRunner runner = context.getBean(GameRunner.class);
        runner.run();
    }
}
