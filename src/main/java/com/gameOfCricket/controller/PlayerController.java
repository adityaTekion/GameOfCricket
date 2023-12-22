package com.gameOfCricket.controller;

import com.gameOfCricket.entities.Player;
import com.gameOfCricket.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @PostMapping("/")
    public ResponseEntity<Player> createPlayer(@RequestBody Player player){
        Player player1 = this.playerService.createPlayer(player);

        return new ResponseEntity<>(player1, HttpStatus.CREATED);
    }

    @GetMapping("/{playerId}")
    public ResponseEntity<Player> getPlayer(@PathVariable("playerId") Integer playerId){
        Player player = this.playerService.getPlayer(playerId);

        return new ResponseEntity<>(player, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<Player>> getAllPlayer(){
        List<Player> players = this.playerService.getAllPlayers();

        return new ResponseEntity<>(players, HttpStatus.OK);
    }
}
