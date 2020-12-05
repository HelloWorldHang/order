package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author brady.si
 */

@RestController
public class Ordercontroller {
    @RequestMapping("/orderTest")
    public String orderTest(){
        return "this is order";
    }

}
