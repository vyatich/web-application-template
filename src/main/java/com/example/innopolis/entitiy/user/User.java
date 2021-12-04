package com.example.innopolis.entitiy.user;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;
}
