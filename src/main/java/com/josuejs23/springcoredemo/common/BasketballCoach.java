package com.josuejs23.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Basketball for 1hr!!+";
    }
}
