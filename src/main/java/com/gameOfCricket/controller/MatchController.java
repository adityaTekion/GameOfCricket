package com.gameOfCricket.controller;

import com.gameOfCricket.entities.Team;
import com.gameOfCricket.entities.TeamScorecard;
import com.gameOfCricket.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/match")
public class MatchController {


    @Autowired
    private MatchService matchService;


    @PostMapping("/teamId/balls/{balls}")
    public ResponseEntity<TeamScorecard> playMatch(@RequestBody Team team,
                                    @PathVariable("balls") int balls){

        TeamScorecard teamScorecard = this.matchService.playMatch(team, balls);

        return new ResponseEntity<>(teamScorecard, HttpStatus.OK);
    }
}
