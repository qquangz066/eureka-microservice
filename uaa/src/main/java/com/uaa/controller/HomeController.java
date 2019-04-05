package com.uaa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

    @GetMapping("/health")
    String get(HttpServletRequest request) {
        return "uaa: " + request.getServerPort();
    }

    @GetMapping("/test")
    String test(HttpServletRequest request) {
        return "uaa test : " + request.getServerPort();
    }
}
