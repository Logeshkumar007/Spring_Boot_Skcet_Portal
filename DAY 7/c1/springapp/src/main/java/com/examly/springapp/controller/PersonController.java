package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.Person;
import com.examly.springapp.service.PersonService;

@RestController
public class PersonController {
    @Autowired
    PersonService service;

    @PostMapping("/api/person")
    public ResponseEntity<Person> postMethod(@RequestBody Person s) {
        if (service.post(s)) {
            return new ResponseEntity<Person>(s, HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/person")
    public ResponseEntity<List<Person>> dndcjk() {
        List<Person> page = service.getAll();
        if (!page.isEmpty()) {
            return new ResponseEntity<List<Person>>(page, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    

    @GetMapping("/api/person/byAge")
    public ResponseEntity<List<Person>> getbyid(@RequestParam("byAge") int byAge) {
        List<Person> p =service.getPerson(byAge);
        if (!p.isEmpty()) {
            return new ResponseEntity<List<Person>>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
