package com.example.test_axiomatics.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Long a;

    @Column
    private Long b;

    @Column
    private Long c;
}
