package com.calc.summation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sum")
public class SummationController {

    @GetMapping("/{param1}/{param2}")
    public int sum(@PathVariable("param1") Integer param1, @PathVariable("param2") Integer param2) {
        return param1 + param2;
    }
}
