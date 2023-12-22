package com.gameOfCricket.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "players")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int player_id;


    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;

    private String player_name;

    @OneToOne(mappedBy = "player", cascade = CascadeType.ALL)
    private Scorecard scorecard;
}
