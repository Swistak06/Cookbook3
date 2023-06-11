package com.cookbook3.cookbook3.model;

import jakarta.persistence.*;

import java.util.Calendar;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue
    @Column(name = "review_id", nullable=false, unique =true)
    private long id;
    private String review;
    int rate;
    Calendar crateTime;

    //user reference
    //recipe reference

}
