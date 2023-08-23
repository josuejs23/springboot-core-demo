package com.josuejs23.springcoredemo.config;

import com.josuejs23.springcoredemo.common.EspecialCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoachConfig {

    // You can assign an id to the bean annotation
    // and use this name instead of the name of the method
    @Bean("especial")
    public EspecialCoach getEspecialCoach(){
        return new EspecialCoach();
    }
}
