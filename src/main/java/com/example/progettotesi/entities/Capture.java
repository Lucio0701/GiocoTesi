package com.example.progettotesi.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "capture")
public class Capture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "flag", referencedColumnName = "id")
    private Flag flag;

    @ManyToOne
    @JoinColumn(name = "team", referencedColumnName = "id")
    private Team captureTeam;

    @Column(name = "round")
    private int round;

    public Capture(){

    }
}
