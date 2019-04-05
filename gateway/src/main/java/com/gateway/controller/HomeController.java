package com.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

    @GetMapping("/health")
    String get() {
        return "uaa: ";
    }

    @GetMapping("/test")
    String test() {
        return "uaa test : ";
    }
}