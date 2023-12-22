package com.gameOfCricket.controller;

import com.gameOfCricket.entities.Team;
import com.gameOfCricket.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamService teamService;

    @PostMapping("/")
    public ResponseEntity<Team> createTeam(@RequestBody Team team){
        Team team1 = this.teamService.createTeam(team);

        return new ResponseEntity<>(team1, HttpStatus.CREATED);
    }

    @GetMapping("/{teamId}")
    public ResponseEntity<Team> getTeam(@PathVariable("teamId") Integer teamId){
        Team team = this.teamService.getTeam(teamId);

        return new ResponseEntity<>(team, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Team>> getAllTeam(){
        List<Team> team = this.teamService.getAllTeam();

        return new ResponseEntity<>(team, HttpStatus.OK);
    }



}
