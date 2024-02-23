package com.snakeandladder.controller;

import java.util.Scanner;

import com.snakeandladder.model.Player;
import com.snakeandladder.service.GameState;

public class GameControllerImpl implements GameController{
	
	GameState gameState;
	Scanner scanner ;
	
	
	public GameControllerImpl(GameState gameState) {
		super();
		this.gameState = gameState;
		this.scanner=new Scanner(System.in);
	}


	public void start() {
		System.out.println("=================================================");
		System.out.println("============Wecolme to Snake and Ladder==========");
		System.out.println("=================================================");
		System.out.println("Enter the No of Snakes");
		int n = scanner.nextInt();
		while(n-->0) {
			System.out.print("Enter the Starting point");
			int start = scanner.nextInt();
			System.out.println("Enter the Ending point");
			int end = scanner.nextInt();
			gameState.addSnake(start, end);
		}
		
		System.out.println("Enter the No of Ladders");
		n = scanner.nextInt();
		while(n-->0) {
			System.out.print("Enter the Starting point");
			int start = scanner.nextInt();
			System.out.println("Enter the Ending point");
			int end = scanner.nextInt();
			gameState.addLadder(start, end);
		}
		System.out.println("Enter No of Players");
		n = scanner.nextInt();
		int i=0;
		scanner.nextLine();
		while(i<n) {
			System.out.println("Enter the Player Name=====");
			String name = scanner.nextLine();
			Player player = new Player(i,1,name);
			gameState.addPlayer(player);
			i++;
		}
		
		System.out.println(gameState.gameStart());
		
	}

}
