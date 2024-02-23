package com.snakeandladder.config;

import com.snakeandladder.controller.GameController;
import com.snakeandladder.controller.GameControllerImpl;
import com.snakeandladder.repository.GameRepository;
import com.snakeandladder.repository.GameRepositoryImpl;
import com.snakeandladder.service.GameState;
import com.snakeandladder.service.GameStateImpl;

public class MainConfig {

	public static void main(String[] args) {
		GameRepository gameRepository = new GameRepositoryImpl();
		GameState gameState = new GameStateImpl(gameRepository);
		GameController gameController = new GameControllerImpl(gameState);
		gameController.start();
	}
}
