package com.UST.cloud_gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userservicefallbackmethod")
    public String userservicefallbackmethod(){
        return "Hai iam AGK.......";
    }
    @GetMapping("/departmentservicefallbackmethod")
    public String departmentservicefallbackmethod(){
        return "Welcome to Athani family.....";
    }
}
