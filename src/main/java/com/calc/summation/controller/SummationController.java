package com.calc.summation.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/sum")
public class SummationController {

    @GetMapping("/{param1}/{param2}")
    public int sum(@PathVariable("param1") Integer param1, @PathVariable("param2") Integer param2) {
        return param1 + param2;
    }
    @PostMapping("/list")
    public int sum(@RequestBody ArrayList<Integer> list) {
        return list.stream().reduce(0, Integer::sum);
    }

}
