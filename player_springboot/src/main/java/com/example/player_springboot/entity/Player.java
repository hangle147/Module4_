package com.example.player_springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullName;
    private LocalDate dayOfBirth;
    private String experience;
    private String position;
    private String avatar;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}

