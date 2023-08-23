package com.josuejs23.springcoredemo.common;

import org.springframework.stereotype.Component;

//Lazy annotation does not initialize the component untill is required
//Also you can set this propertie global in the application.properties file
//@Lazy
public class EspecialCoach implements Coach{


    public EspecialCoach() {
        System.out.println( "I am " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Do especial things for 1hr!!+";
    }
}
