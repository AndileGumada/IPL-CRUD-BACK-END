package com.andile.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PLAYERS")
public class Player {
		


		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "PLAYER_ID")
		private int id;
		
		@Column(name = "PLAYER_NAME")
		private String playerName;
		private String preference;
		
		private int matchPlayed;
		
		private int runs;
		
		private int wickets;
		
		private int highestScore;
		
		private String bestWicket;
		
		private int fifties;
		private int centuries;
		private int thirties;
		
		private int catches;
		private int stumpings;
		private int fours;
		private int sixes;
		private double strikeRate;
		private double average;
		
		@ManyToOne
		@JoinColumn(name = "team_id")//considered as
		private Team team;
		
		
		public Player(int id, String playerName, String preference, int matchPlayed, int runs, int wickets,
				int highestScore, String bestWicket, int fifties, int centuries, int thirties, int catches,
				int stumpings, int fours, int sixes, double strikeRate, double average, Team team) {
			this.id = id;
			this.playerName = playerName;
			this.preference = preference;
			this.matchPlayed = matchPlayed;
			this.runs = runs;
			this.wickets = wickets;
			this.highestScore = highestScore;
			this.bestWicket = bestWicket;
			this.fifties = fifties;
			this.centuries = centuries;
			this.thirties = thirties;
			this.catches = catches;
			this.stumpings = stumpings;
			this.fours = fours;
			this.sixes = sixes;
			this.strikeRate = strikeRate;
			this.average = average;
			this.team = team;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPlayerName() {
			return playerName;
		}

		public void setPlayerName(String playerName) {
			this.playerName = playerName;
		}

		public String getPreference() {
			return preference;
		}

		public void setPreference(String preference) {
			this.preference = preference;
		}

		public int getMatchPlayed() {
			return matchPlayed;
		}

		public void setMatchPlayed(int matchPlayed) {
			this.matchPlayed = matchPlayed;
		}

		public int getRuns() {
			return runs;
		}

		public void setRuns(int runs) {
			this.runs = runs;
		}

		public int getWickets() {
			return wickets;
		}

		public void setWickets(int wickets) {
			this.wickets = wickets;
		}

		public int getHighestScore() {
			return highestScore;
		}

		public void setHighestScore(int highestScore) {
			this.highestScore = highestScore;
		}

		public String getBestWicket() {
			return bestWicket;
		}

		public void setBestWicket(String bestWicket) {
			this.bestWicket = bestWicket;
		}

		public int getFifties() {
			return fifties;
		}

		public void setFifties(int fifties) {
			this.fifties = fifties;
		}

		public int getCenturies() {
			return centuries;
		}

		public void setCenturies(int centuries) {
			this.centuries = centuries;
		}

		public int getThirties() {
			return thirties;
		}

		public void setThirties(int thirties) {
			this.thirties = thirties;
		}

		public int getCatches() {
			return catches;
		}

		public void setCatches(int catches) {
			this.catches = catches;
		}

		public int getStumpings() {
			return stumpings;
		}

		public void setStumpings(int stumpings) {
			this.stumpings = stumpings;
		}

		public int getFours() {
			return fours;
		}

		public void setFours(int fours) {
			this.fours = fours;
		}

		public int getSixes() {
			return sixes;
		}

		public void setSixes(int sixes) {
			this.sixes = sixes;
		}

		public double getStrikeRate() {
			return strikeRate;
		}

		public void setStrikeRate(double strikeRate) {
			this.strikeRate = strikeRate;
		}

		public double getAverage() {
			return average;
		}

		public void setAverage(double average) {
			this.average = average;
		}

		public Team getTeam() {
			return team;
		}

		public void setTeam(Team team) {
			this.team = team;
		}

		public Player() {
			// TODO Auto-generated constructor stub
		}
}
