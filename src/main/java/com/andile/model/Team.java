package com.andile.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TEAM")
public class Team {
	
	@Id( )
	@Column(name = "")
	private int id;
	
	private String description;
	private String owner;
	private String team;
	private int totalPlayed;
	private int totalLost;
	private int totalWon;
	private int noResults;
	//one team can have many players 
	@OneToMany(mappedBy = "team",cascade = CascadeType.MERGE,fetch = FetchType.LAZY)//
	private List<Player> players = new ArrayList<Player>();
	public Team() {
		
	}
	public Team(int id, String description, int noResults, String owner, String team, int totalPlayed, int totalLost,
			int totalWon) {
		
		this.id = id;
		this.description = description;
		this.noResults = noResults;
		this.owner = owner;
		this.team = team;
		this.totalPlayed = totalPlayed;
		this.totalLost = totalLost;
		this.totalWon = totalWon;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getNoResults() {
		return noResults;
	}
	public void setNoResults(int noResults) {
		this.noResults = noResults;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getTotalPlayed() {
		return totalPlayed;
	}
	public void setTotalPlayed(int totalPlayed) {
		this.totalPlayed = totalPlayed;
	}
	public int getTotalLost() {
		return totalLost;
	}
	public void setTotalLost(int totalLost) {
		this.totalLost = totalLost;
	}
	public int getTotalWon() {
		return totalWon;
	}
	public void setTotalWon(int totalWon) {
		this.totalWon = totalWon;
	}
}
