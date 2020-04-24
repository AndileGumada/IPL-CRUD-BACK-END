package com.andile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andile.model.Player;
import com.andile.service.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	private PlayerService playeService;
	
	//GET
	@RequestMapping(value="/players", method = RequestMethod.GET)//localhost:8081/players
	public List<Player> getPlayers() {
		
		return playeService.getAllPlayers();
	}
	
	@RequestMapping(value = "/players/{id}", method = RequestMethod.GET)
	public  Player getPlayerById(@PathVariable int id) {
		return playeService.getPlayerId(id);
	}
	
	
	//POST
	@RequestMapping(value = "/players/save", method = RequestMethod.POST)//localhost:8081/
	public void savePlayer(@RequestBody Player player) {
		playeService.savePlayer(player);
	}
	//PUT
	@RequestMapping(value = "/players/save", method = RequestMethod.PUT)//localhost:8081/
	public void updatePlayer(@RequestBody Player player){
		playeService.updatePlayer(player);
	}
	//DELETE
	@RequestMapping(value = "/players/delete", method = RequestMethod.DELETE)
	public void deletePayer(int id) {
			playeService.deletePlayer(id);
		}
	
}
