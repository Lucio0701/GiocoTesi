package com.example.progettotesi.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Basic
    @Column(name = "valid_flag")
    private int valid_flag;

    @Basic
    @Column(name = "max_round")
    private int max_round;

    @Basic
    @Column(name = "round")
    private int round;

    @Basic
    @Column(name = "time_sleep_round")
    private int time_sleep_round;

    @Basic
    @Column(name = "time_sleep_tick")
    private int time_sleep_tick;

    public static class Builder {
        private int id;
        private int valid_flag;
        private int max_round;
        private int round;
        private int time_sleep_round;
        private int time_sleep_tick;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder valid_flag(int valid_flag) {
            this.valid_flag = valid_flag;
            return this;
        }

        public Builder max_round(int max_round) {
            this.max_round = max_round;
            return this;
        }

        public Builder round(int round) {
            this.round = round;
            return this;
        }

        public Builder time_sleep_round(int time_sleep_round) {
            this.time_sleep_round = time_sleep_round;
            return this;
        }

        public Builder time_sleep_tick(Integer time_sleep_tick) {
            this.time_sleep_tick = time_sleep_tick;
            return this;
        }

        public Game build() {
            return new Game(this);
        }
    }

    private Game(Builder builder) {
        this.id = builder.id;
        this.valid_flag = builder.valid_flag;
        this.max_round = builder.max_round;
        this.round = builder.round;
        this.time_sleep_round = builder.time_sleep_round;
        this.time_sleep_tick = builder.time_sleep_tick;
    }
    public Game(){

    }
}
