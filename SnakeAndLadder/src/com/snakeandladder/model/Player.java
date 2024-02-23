package com.snakeandladder.model;

public class Player {

	private int position;
	private String name;
	private int id;
	
	public Player(int id,int position, String name) {
		super();
		this.position = position;
		this.name = name;
		this.id=id;
	}

	public int getPosition() {
		return position;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return String.format("Player [position=%s, name=%s, id=%s]", position, name, id);
	}
	
	
	
}
