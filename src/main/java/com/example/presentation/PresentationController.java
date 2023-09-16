package com.example.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1/presentation")
public class PresentationController {

    @GetMapping
    public String defaultGet() {
        return "Default get";
    }

    @GetMapping("/other")
    public String otherGet() {
        return "Other get 2";
    }
}
