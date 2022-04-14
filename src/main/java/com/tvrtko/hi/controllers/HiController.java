package com.tvrtko.hi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {
    
    @GetMapping(value = "/hi")
    public String SayHi() {
        return ("Hi man!");
    }

}
