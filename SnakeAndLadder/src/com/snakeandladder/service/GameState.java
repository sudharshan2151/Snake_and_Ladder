package com.snakeandladder.service;

import com.snakeandladder.model.Player;

public interface GameState {
	
		public String gameStart() ;
		
	    public  int rollDice(String playerName);
	    
		public void addPlayer(Player player) ;
		
		public void addSnake(int start , int end) ;
		
		public void addLadder(int start , int end) ;
		
		public void getPlayers() ;
		
		public void getSnakes();
		
		public void getLadders() ;

}
