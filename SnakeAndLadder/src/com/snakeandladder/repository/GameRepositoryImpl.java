package com.snakeandladder.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.snakeandladder.model.Player;

public class GameRepositoryImpl implements GameRepository{
	
	Map<Integer,Integer> ladders ;
	Map<Integer,Integer> snakes;
	List<Player> players;
	
	public GameRepositoryImpl() {
		ladders = new HashMap<>();
		snakes = new HashMap<>();
		players = new ArrayList<>();
	}
	
	public void addLadder(int start , int end) {
		ladders.put(start, end);
	}
	
	public int getLadder(int start) {
		return ladders.get(start);
	}
	
	public int getSnakes(int start) {
		return snakes.get(start);
	}
	
	public void addSnakes(int start ,int end) {
		snakes.put(start,end);
	}
	
	public boolean isSnake(int start) {
		return snakes.containsKey(start);
	}
	
	public boolean isLadder(int start) {
		return ladders.containsKey(start);
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public void updatePlayer(Player player) {
		players.set(player.getId(), player);
		
	}
	
	public Player getPlayer(int playerId) {
		return players.get(playerId);
	}
		
	public void getPlayers() {
		System.out.println(players);
	}
	
	public void getSnakes() {
		System.out.println(snakes);
	}
	
	public void getLadders() {
		System.out.println(ladders);
	}
	
	public int playersSize() {
		return players.size();
	}
	
	
}
