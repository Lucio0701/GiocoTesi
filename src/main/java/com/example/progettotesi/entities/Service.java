package com.example.progettotesi.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "service")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Basic
    @Column(name = "name", nullable = false)
    private String name;

    @Basic
    @Column(name = "port", nullable = false)
    private int port;

    @Basic
    @Column(name = "auth_code", nullable = false)
    private String auth_code;

    @Basic
    @Column(name = "num_flag", nullable = false)
    private int num_flag;

    public static class Builder {
        private int id;
        private String name;
        private int port;
        private String auth_code;
        private int num_flag;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder port(int port) {
            this.port = port;
            return this;
        }

        public Builder auth_code(String auth_code) {
            this.auth_code = auth_code;
            return this;
        }

        public Builder num_flag(int num_flag) {
            this.num_flag = num_flag;
            return this;
        }

        public Service build() {
            return new Service(this);
        }
    }

    private Service(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.port = builder.port;
        this.auth_code = builder.auth_code;
        this.num_flag = builder.num_flag;
    }
    public Service() {
    }


}
