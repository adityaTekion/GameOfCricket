package com.gameOfCricket.repositories;

import com.gameOfCricket.entities.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepositories extends JpaRepository<Player, Integer> {
}
