package com.gameOfCricket.services.impl;

import com.gameOfCricket.entities.Team;
import com.gameOfCricket.entities.TeamScorecard;
import com.gameOfCricket.repositories.TeamScorecardRepositories;
import com.gameOfCricket.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    TeamScorecardRepositories teamScorecardRepo;

    int runs = 0;
    int wickets = 0;

    @Override
    public TeamScorecard playMatch(Team team, int balls) {
             //suppose 12 balls-overGame

        for (int i = 0; i < balls; i++) { // Generating 12 random outcomes

            Random random = new Random();
            int outcome = random.nextInt(8); // Generates a random number between 0 and 7
            if (outcome == 7) {
                wickets += 1; // 7 represents a wicket
            } else {
                runs += outcome; // Return the runs (0 to 6)
            }

        }

        TeamScorecard score = new TeamScorecard();
        score.setTeam(team);
        score.setTotalRuns(runs);
        score.setTotalWickets(wickets);

        return this.teamScorecardRepo.save(score);
    }
}
