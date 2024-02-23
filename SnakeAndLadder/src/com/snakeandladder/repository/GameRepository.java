package com.snakeandladder.repository;

import com.snakeandladder.model.Player;

public interface GameRepository {
	
	public void addLadder(int start , int end) ;
	
	public int getLadder(int start) ;
	
	public int getSnakes(int start) ;
	
	public void addSnakes(int start ,int end);
	
	public boolean isSnake(int start) ;
	
	public boolean isLadder(int start);
	
	public void addPlayer(Player player) ;
	
	public void updatePlayer(Player player) ;
	
	Player getPlayer(int playerId) ;
		
	public void getPlayers();
	
	public void getSnakes();
	
	public void getLadders() ;
	
	public int playersSize() ;
	

}
