package com.sacco.growth.model.saccoGrowthmodel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BusinessLogicController {

    @GetMapping("/modelCalculator")
    public String growthModelForm() {
        return "modelCalculator";
    }
}
