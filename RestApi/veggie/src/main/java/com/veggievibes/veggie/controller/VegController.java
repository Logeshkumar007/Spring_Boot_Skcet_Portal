package com.veggievibes.veggie.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.veggievibes.veggie.model.Vegetables;
import com.veggievibes.veggie.services.VegService;

@RestController
public class VegController {
    @Autowired
    VegService ser;
    @RequestMapping("/veg")
    public List<Vegetables> abc()
    {
        return ser.getall();
    }
    @GetMapping("/vegparam")
    public Optional<Vegetables> abcd(@RequestParam int id)
    {
        return ser.getid(id);
    }
    @PostMapping("/addveg")
     public Vegetables add(@RequestBody Vegetables entity) {
        ser.add(entity);
       return entity;
    }
}
