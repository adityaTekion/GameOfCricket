package com.gameOfCricket.services.impl;

import com.gameOfCricket.entities.Team;
import com.gameOfCricket.exception.ResourceNotFoundException;
import com.gameOfCricket.repositories.TeamRepositories;
import com.gameOfCricket.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    private TeamRepositories teamRepo;

    @Override
    public Team createTeam(Team team) {
        return this.teamRepo.save(team);
    }

    @Override
    public Team getTeam(Integer teamId) {
        Team team = this.teamRepo.findById(teamId).orElseThrow(() -> new ResourceNotFoundException("Team", "teamId", teamId));
        return team;
    }

    @Override
    public List<Team> getAllTeam() {
        return this.teamRepo.findAll();
    }

    @Override
    public Team updateTeam(Integer teamId, Team team) {
        Team existingTeam = this.teamRepo.findById(teamId).orElseThrow(() -> new ResourceNotFoundException("Team", "teamId", teamId));

        existingTeam.setTeam_name(team.getTeam_name());

        return this.teamRepo.save(existingTeam);
    }

    @Override
    public void deleteTeam(Integer teamId) {
        Team team = this.teamRepo.findById(teamId).orElseThrow(() -> new ResourceNotFoundException("Team", "teamId", teamId));

        this.teamRepo.delete(team);

    }
}
