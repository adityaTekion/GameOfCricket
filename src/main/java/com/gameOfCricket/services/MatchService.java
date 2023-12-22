package com.gameOfCricket.services;

import com.gameOfCricket.entities.Team;
import com.gameOfCricket.entities.TeamScorecard;
import org.springframework.web.bind.annotation.PathVariable;

public interface MatchService {

    //play match
    TeamScorecard playMatch(Team team, int balls);
}
