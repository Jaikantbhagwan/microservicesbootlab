

package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WhateverIWantLabController {

    @GetMapping("/")
    public String hiThere() {
        return "hello";
    }
}
