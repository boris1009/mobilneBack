package com.example.mobilneBack.controller;

import com.example.mobilneBack.entity.Gledalac;
import com.example.mobilneBack.service.GledalacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GledalacController {
    @Autowired
    private GledalacService gledalacService;

    @PostMapping("/addGledalac")
    public Gledalac addGledalac(@RequestBody Gledalac gledalac){
        return gledalacService.addGledalac(gledalac);
    }
}
