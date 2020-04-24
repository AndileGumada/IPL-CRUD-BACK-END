package com.andile.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andile.model.Player;
import com.andile.model.Team;
import com.andile.repositories.PlayerRepository;
import com.andile.repositories.TeamRepository;

@Service
public class TeamService {
	@Autowired
	private TeamRepository teamRepository;
	
	//Return All the teams
	public List<Team> getAllTheTeams() {
		List<Team> teamsList = new ArrayList<>();
		teamRepository.findAll().forEach(teamsList::add);
		return teamsList;
	}
	
	//Return Single Team
	public Team getTeam(int id) {
		Optional<Team> optionalTeam = teamRepository.findById(id);
		if(optionalTeam.isPresent()) {
			return optionalTeam.get();
		}
		return null;
	}
	
	//Save the team
	public void saveTeam(Team player) {
		teamRepository.save(player);
	}
	
	//update the team
	public void updateTeam(Team player) {
		teamRepository.save(player);
	}
	
	//Remove the team
	public void deleteTeam(int id) {
		teamRepository.deleteById(id);
		
	}
	
}
