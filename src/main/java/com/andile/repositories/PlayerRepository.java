package com.andile.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.andile.model.Player;


public interface PlayerRepository extends CrudRepository<Player, Integer> {

}
