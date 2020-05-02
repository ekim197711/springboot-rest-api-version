package com.example.demo.api;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Train {
    private String modelName;
    private Float maxspeed;

}
