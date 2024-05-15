package com.example.progettotesi.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    @Basic
    @Column(name = "ip", nullable = false)
    private String ip;

    @Basic
    @Column(name = "token", nullable = false)
    private String token;

    @Basic
    @Column(name = "nop_team", nullable = false)
    private boolean nop_team;



    public static class Builder {
        private int id;
        private String name;
        private String ip;
        private String token;
        private boolean nop_team;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder ip(String ip) {
            this.ip = ip;
            return this;
        }

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public Builder nopTeam(boolean nop_team) {
            this.nop_team = nop_team;
            return this;
        }

        public Team build() {
            return new Team(this);
        }
    }

    private Team(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.ip = builder.ip;
        this.token = builder.token;
        this.nop_team = builder.nop_team;
    }
    public Team() {
    }
}
