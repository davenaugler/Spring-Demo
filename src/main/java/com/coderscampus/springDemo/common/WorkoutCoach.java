package com.coderscampus.springDemo.common;

import org.springframework.stereotype.Component;

@Component
public class WorkoutCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Do the WOD or Strength workout for the day!";
    }
}
