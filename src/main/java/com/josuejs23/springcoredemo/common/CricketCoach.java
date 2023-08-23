package com.josuejs23.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
// The value "prototype" generate a new instance to each injection.
// The default value is singleton.
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("I am : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice cricket for 1hr!!+";
    }

}
