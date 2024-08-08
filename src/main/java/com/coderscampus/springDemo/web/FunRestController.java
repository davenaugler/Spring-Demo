package com.coderscampus.springDemo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    public String coachName;

    @Value("${team.name}")
    public String teamName;


    // expose "/" that returns "Hello Universe"
    @GetMapping("/")
    public String sayHello() {
        return "Hello Universe!";
    }

    // expose new endpoint for "teamInfo
    @GetMapping("/teamInfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team Name: " + teamName;
    }


    // expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Go do the daily WOD!";
    }

    // expose a new endpoint for "workout"
    @GetMapping("/eat")
    public String getFood() {
        return "Go have a meal!";
    }

    // expose a new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getFortune() {
        return "Today is your lucky day!";
    }




}
