package com.josuejs23.springcoredemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
//Lazy annotation does not initialize the component untill is required
//Also you can set this propertie global in the application.properties file
@Lazy
@Component
public class BasketballCoach implements Coach{


    public BasketballCoach() {
        System.out.println( "I am " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Basketball for 1hr!!+";
    }
}
