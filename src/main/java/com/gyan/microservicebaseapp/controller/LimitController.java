package com.gyan.microservicebaseapp.controller;


import com.gyan.microservicebaseapp.bean.Limit;
import com.gyan.microservicebaseapp.config.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/limit")
public class LimitController {

    @Autowired
    LimitConfig limitConfig;

    @GetMapping
    public Limit getLimit(){
        return new Limit(limitConfig.getMin(), limitConfig.getMax());
    }
}
