package com.vehicle.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("uaa")
public interface UaaClient {

    @GetMapping("/test")
    String test();
}
