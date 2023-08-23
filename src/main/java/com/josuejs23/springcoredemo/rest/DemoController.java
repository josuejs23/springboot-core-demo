package com.josuejs23.springcoredemo.rest;

import com.josuejs23.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    //The Qualifier Annotation especify the implementation class
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach myCoach,
                          @Qualifier("cricketCoach") Coach anotherCoach) {
        this.myCoach = myCoach;
        this.anotherCoach = anotherCoach;
        System.out.printf("myCoach == anotherCoach %b%n", myCoach == anotherCoach);
    }

    /*The Qualifier Annotation especify the implementation class
    @Autowired
    public void setMyCoach(@Qualifier("cricketCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "myCoach == anotherCoach %b".formatted( myCoach == anotherCoach);
    }
}
