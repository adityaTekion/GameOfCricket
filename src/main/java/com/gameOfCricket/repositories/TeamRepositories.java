package com.gameOfCricket.repositories;

import com.gameOfCricket.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepositories extends JpaRepository<Team, Integer> {
}
