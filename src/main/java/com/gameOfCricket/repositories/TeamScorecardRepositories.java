package com.gameOfCricket.repositories;

import com.gameOfCricket.entities.Scorecard;
import com.gameOfCricket.entities.Team;
import com.gameOfCricket.entities.TeamScorecard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamScorecardRepositories extends JpaRepository<TeamScorecard, Integer> {

    TeamScorecard findByTotalRuns(int team);
}
