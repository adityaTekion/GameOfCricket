package com.gameOfCricket.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "scorecard")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Scorecard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int score_id;

    @OneToOne
    @JoinColumn(name = "player_id")
    private Player player;

    private int totalRuns;

    private int totalWickets;

}
