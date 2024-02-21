package com.example.NameController;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class CheckName {

    @GetMapping("/name")
    public String name(@RequestParam String name){
        return "Jhon";
    }
    @PostMapping("/name")
    public String reverseName(@RequestParam String name){
        return new StringBuilder(name).reverse().toString();
    }
}
