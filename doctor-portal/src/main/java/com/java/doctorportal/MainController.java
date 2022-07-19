package com.java.doctorportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/doctors")
    public String getDoctors(){
        String url = "http://doctor-service/allDoctors";//http://localhost:9081/allDoctors";
        return restTemplate.getForObject(url, String.class);
    }
}