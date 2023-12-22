package com.gameOfCricket.services.impl;

import com.gameOfCricket.entities.Player;
import com.gameOfCricket.repositories.PlayerRepositories;
import com.gameOfCricket.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepositories playerRepo;

    @Override
    public Player createPlayer(Player player) {
        return this.playerRepo.save(player);
    }

    @Override
    public Player getPlayer(Integer playerId) {
        Player player = this.playerRepo.findById(playerId).orElse(null);
        return player;
    }

    @Override
    public List<Player> getAllPlayers() {
        return this.playerRepo.findAll();
    }

    @Override
    public Player updatePlayer(Integer playerId, Player player) {
        Player players = this.playerRepo.findById(playerId).orElse(null);

        players.setPlayer_name(player.getPlayer_name());

        return this.playerRepo.save(players);
    }

    @Override
    public void deletePlayer(Integer playerId) {
        Player player = this.playerRepo.findById(playerId).orElse(null);
        this.playerRepo.delete(player);
    }

}
