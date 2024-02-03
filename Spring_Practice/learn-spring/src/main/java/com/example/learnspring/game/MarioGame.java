package com.example.learnspring.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{
	
	public void up()
	{
		System.out.println("Up pressed");
	}
	
	public void down()
	{
		System.out.println("Down pressed");
	}
	
	public void left()
	{
		System.out.println("Left pressed");
	}
	
	public void right()
	{
		System.out.println("Right pressed");
	}

}
