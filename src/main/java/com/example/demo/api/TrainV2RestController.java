package com.example.demo.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/2020/05/02")
public class TrainV2RestController {

    @GetMapping("/train")
    public Train2 train(){
        return new Train2("tjutjumodelT1000", "Mike");
    }
}
