package com.snakeandladder.service;

import java.util.Scanner;

import com.snakeandladder.model.Player;
import com.snakeandladder.repository.GameRepository;

public class GameStateImpl implements GameState{
   private GameRepository gameRepository;
   private Scanner scanner;
   

	public GameStateImpl(GameRepository gameRepository) {
		super();
		this.gameRepository = gameRepository;
		scanner = new Scanner(System.in);
		
	}
    
    public String gameStart() {
    	int i=0;
    	int n = gameRepository.playersSize();
    	while(true) {
    		
    		Player player = gameRepository.getPlayer(i%n);
    		int roll = rollDice(player.getName());
    		int nextPosition = roll+player.getPosition();
    		if(gameRepository.isLadder(nextPosition)) {
    			int ladder = gameRepository.getLadder(nextPosition);
    			nextPosition=ladder;
    		}
    		else if(gameRepository.isSnake(nextPosition)) {
    			int snakes = gameRepository.getSnakes(nextPosition);
    			nextPosition=snakes;
    		}
    		
    		
    		if(nextPosition>=100) {
    			System.out.println(player.getName()+" rolled a "+roll+" and moved from "+player.getPosition()+" to "+100);
    			return player.getName()+"  Wins the game !!! ";
    		}
    		System.out.println(player.getName()+" rolled a "+roll+" and moved from "+player.getPosition()+" to "+nextPosition);
    		player.setPosition(nextPosition);
    		gameRepository.updatePlayer(player);
    		i++;
    	}
    } 
    public  int rollDice(String playerName) {
    	
    	boolean label = true;
    	while(label) {
    		try {
    			System.out.println(playerName +" please 1 to rollDice");
    			int n = Integer.parseInt(scanner.nextLine());
        		switch(n) {
        		case 1:
        			label=false;
        			break;
        		default:
        			System.out.println("Invalid input");
        			break;
        		}
    		}
    		catch(NumberFormatException ex) {   		
    			System.out.println("Invalid input");
    		}
    	}
    	return (int)(Math.random()*6)+1;
    }
	public void addPlayer(Player player) {
		gameRepository.addPlayer(player);
	}
	
	public void addSnake(int start , int end) {
		gameRepository.addSnakes(start, end);
	}
	
	public void addLadder(int start , int end) {
		gameRepository.addLadder(start, end);
	}
	
	public void getPlayers() {
		gameRepository.getPlayers();
	}
	public void getSnakes() {
		gameRepository.getSnakes();
	}
	public void getLadders() {
		gameRepository.getLadders();
	}

	
}
