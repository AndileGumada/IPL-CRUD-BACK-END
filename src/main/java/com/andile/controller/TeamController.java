package com.andile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andile.model.Team;
import com.andile.service.TeamService;

@RestController
public class TeamController {
	@Autowired
	private TeamService teamService;
	
	//GET
	@RequestMapping(value="/teams", method = RequestMethod.GET)//localhost:8081/players
	public List<Team> getTeams() {
		
		return teamService.getAllTheTeams();
	}
	
	@RequestMapping(value = "/teams/{id}", method = RequestMethod.GET)
	public  Team getTeamById(@PathVariable int id) {
		return teamService.getTeam(id);
	}
	
	//POST
	@RequestMapping(value = "/teams/save", method = RequestMethod.POST)//localhost:8081/
	public void saveTeam(@RequestBody Team team) {
		teamService.saveTeam(team);
	}
	//PUT
	@RequestMapping(value = "/teams/update", method = RequestMethod.PUT)//localhost:8081/
	public void updateTeam(@RequestBody Team team){
		teamService.updateTeam(team);
	}
	//DELETE
	@RequestMapping(value = "/teams/delete", method = RequestMethod.DELETE)
	public void deleteTeam(int id) {
			teamService.deleteTeam(id);
		}
}
