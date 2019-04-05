package com.vehicle.controller;

import com.vehicle.feign.UaaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HomeController {

    @Autowired
    UaaClient uaaClient;

    @GetMapping("/health")
    String get(HttpServletRequest request) {
        return "vehicle: " + request.getServerPort();
    }

    @GetMapping("/test")
    String test(HttpServletRequest request) {
        return "vehicle test : " + request.getServerPort();
    }

    @GetMapping("/call-uaa")
    String test2(HttpServletRequest request) {
        return uaaClient.test();
    }
}
