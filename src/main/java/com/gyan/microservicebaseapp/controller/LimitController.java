package com.gyan.microservicebaseapp.controller;


import com.gyan.microservicebaseapp.bean.Limit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limit")
public class LimitController {

    @GetMapping
    public Limit getLimit(){
        return new Limit(1,1000);
    }
}
