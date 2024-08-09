package com.coderscampus.springDemo.rest;

import com.coderscampus.springDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency injection
    private Coach myCoach;

    // define a constructor for dependency injection
//    public DemoController(Coach theCoach) {
//        myCoach = theCoach;
//    }

    // setter injection
    @Autowired
    public void setCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


}
