package com.example.minerx.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Table(name = "rank")
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class Rank {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RANK_SEQ")
    @SequenceGenerator(name = "RANK_SEQ", sequenceName = "RANK_SEQ", allocationSize = 1)
    @Column(nullable = false)
    int id;
    @Column(nullable = false,name = "USER_NAME")
    String userName;
    String time;
    @Column(name = "PLAYTIME")
    String playTime;
}
