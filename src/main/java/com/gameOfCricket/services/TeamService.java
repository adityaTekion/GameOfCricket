package com.gameOfCricket.services;

import com.gameOfCricket.entities.Team;

import java.util.List;

public interface TeamService {

    //create team
    Team createTeam(Team team);

    //get team
    Team getTeam(Integer teamId);

    //get all team
    List<Team> getAllTeam();

    //update team
    Team updateTeam(Integer teamId, Team team);

    //delete team
    void deleteTeam(Integer teamId);
}
