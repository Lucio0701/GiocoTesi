package com.example.progettotesi.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "flag")
public class Flag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "flag", nullable = false)
    private String flag;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "service", referencedColumnName = "id")
    private Service service;

    @Basic
    @Column(name = "num_flag", nullable = false)
    private int num_flag;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "team", referencedColumnName = "id")
    private Team protection_team;

    @Basic
    @Column(name = "round", nullable = false)
    private int round;

    @Basic
    @Column(name = "weight", nullable = false)
    private float weight;

    public static class Builder {
        private int id;
        private String flag;
        private Service service;
        private Integer num_flag;
        private Team protection_team;
        private Integer round;
        private float weight;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder flag(String flag) {
            this.flag = flag;
            return this;
        }

        public Builder service(Service service) {
            this.service = service;
            return this;
        }

        public Builder num_flag(Integer num_flag) {
            this.num_flag = num_flag;
            return this;
        }

        public Builder protection_team(Team protection_team) {
            this.protection_team = protection_team;
            return this;
        }

        public Builder round(Integer round) {
            this.round = round;
            return this;
        }

        public Builder weight(float weight) {
            this.weight = weight;
            return this;
        }

        public Flag build() {
            return new Flag(this);
        }
    }

    private Flag(Builder builder) {
        this.id = builder.id;
        this.flag = builder.flag;
        this.service = builder.service;
        this.num_flag = builder.num_flag;
        this.protection_team = builder.protection_team;
        this.round = builder.round;
        this.weight = builder.weight;
    }
    public Flag(){

    }

}
