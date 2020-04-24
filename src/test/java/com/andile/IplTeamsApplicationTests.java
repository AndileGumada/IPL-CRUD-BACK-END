package com.andile;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.andile.model.Player;
import com.andile.repositories.PlayerRepository;

@SpringBootTest
class IplTeamsApplicationTests {

	@Test
	void save() {
		Player obj = new Player();
		PlayerRepository playerRepository = null;
		obj.setId(10);
		obj.setPlayerName("Varit kholi");
		obj.setAverage(44.65);
		obj.setBestWicket("0/0");
		obj.setCatches(33);
		obj.setCenturies(26);
		obj.setFifties(432);
		obj.setFours(356);
		obj.setHighestScore(408);
		obj.setMatchPlayed(345);
		obj.setPreference("BAT");
		obj.setRuns(4987);
		obj.setSixes(44);
		obj.setStrikeRate(44.89);
		obj.setWickets(4);
		obj.setThirties(4);
		
		playerRepository.save(obj);
	}
}
