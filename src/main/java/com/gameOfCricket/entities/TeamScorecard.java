package com.gameOfCricket.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "teamScorecard")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamScorecard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int score_id;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "team_id")
    private Team team;

    private int totalRuns;

    private int totalWickets;

}
