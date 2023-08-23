package com.josuejs23.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// The value "prototype" generate a new instance to each injection.
// The default value is singleton.
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("I am : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice cricket for 1hr!!+";
    }


    @PostConstruct
    public void postConstruct(){
        System.out.printf("Post construct %s%n", getClass().getSimpleName());
    }

    @PreDestroy
    public void postDestroy(){
        System.out.printf("Predestroy %s%n", getClass().getSimpleName());
    }

}
