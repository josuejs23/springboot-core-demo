package com.josuejs23.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("I am : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice cricket for 1hr!!+";
    }
}
