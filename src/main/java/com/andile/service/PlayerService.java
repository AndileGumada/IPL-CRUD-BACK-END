package com.andile.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andile.model.Player;
import com.andile.repositories.PlayerRepository;

@Service//
public class PlayerService {
	@Autowired PlayerRepository playerRepository;
	List<Player> list = new ArrayList<>();
	//we use the constructor from the service class to enable dependency injection
//	public  PlayerService() {
//		System.out.println("Service created");
//		list.add(new Player(1,"Andile"));
//		list.add(new Player(2,"Thabile"));
//		list.add(new Player(3,"Mihlali"));
//		
//	}
	
	//Return all the list of players in the database
	public List<Player> getAllPlayers(){
		List<Player> playerList = new ArrayList<Player>();
		playerRepository.findAll().forEach(playerList :: add);
		return playerList;
	}
	
	//return Single player
	public Player getPlayerId(int id) {
		Optional<Player> optional = playerRepository.findById(id);
		
			if(optional.isPresent()) {
				return optional.get();
			}
		return null;
	}
	
	public void savePlayer(Player play) {
		this.list.add(play);
	}
	public void updatePlayer(Player player) {
		for(Player play :list) {
			if(play.getId() ==player.getId()) {
				play.setPlayerName(player.getPlayerName());
			}
		}
	}
	//Remove the player
	public void deletePlayer(int id) {
		list.remove(id);
	}
}
