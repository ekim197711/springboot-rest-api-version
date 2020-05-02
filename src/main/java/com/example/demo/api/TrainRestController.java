package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TrainRestController {

    @GetMapping("/train")
    public Train train(){
        return new Train("tjutjumodelT1000", 100.0f);
    }
}
