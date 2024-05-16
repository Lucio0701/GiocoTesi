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
            Team t=new Team();
            t.id = this.id;
            t.name = this.name;
            t.ip = this.ip;
            t.token = this.token;
            t.nop_team = this.nop_team;
            return t;
        }
    }

    public Team() {

    }

}
