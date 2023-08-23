package com.josuejs23.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    public BaseballCoach() {
        System.out.println( "I am " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Baseball for 1hr!!+";
    }
}
