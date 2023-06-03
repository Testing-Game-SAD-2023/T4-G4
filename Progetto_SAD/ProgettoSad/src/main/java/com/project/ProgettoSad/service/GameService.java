package com.project.ProgettoSad.service;

import java.util.List;

import org.bson.types.ObjectId;

import com.project.ProgettoSad.model.Game;

public interface GameService {
	
	String createGame(Game game);
	
	Game endGame(ObjectId GID, String winner);
	
	List<Game> readPlayerHistory(String PID);
	
	List<Game> getAllGames();
	
	Game getGameById(ObjectId GID);
	
}
