package com.example.test_axiomatics.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String x1;

    @Column
    private String x2;

    @OneToOne
    @JoinColumn(name = "request_id", referencedColumnName = "id", nullable = false)
    private Request request;
}
