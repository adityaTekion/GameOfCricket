package com.gameOfCricket.services;

import com.gameOfCricket.entities.Player;

import java.util.List;

public interface PlayerService {

    //create player
    Player createPlayer(Player player);

    //read player
    Player getPlayer(Integer playerId);

    //read all players
    List<Player> getAllPlayers();

    //update player
    Player updatePlayer(Integer playerId, Player player);


    //delete player
    void deletePlayer(Integer playerId);
}
