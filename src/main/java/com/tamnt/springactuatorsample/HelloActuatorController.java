package com.tamnt.springactuatorsample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloActuatorController {

    @RequestMapping(value = "/helloactuator", method= GET)
    public String helloActuator() {
        return "Hello Spring Boot Actuator";
    }

}
