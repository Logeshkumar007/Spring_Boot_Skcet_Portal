package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Person;
import com.example.springapp.service.PersonService;

@RestController
public class PersonController {
    @Autowired
    PersonService service;

    @PostMapping("/api/product")
    public ResponseEntity<Person> dnk(@RequestBody Person s) {
        if (service.post(s)) {
            return new ResponseEntity<Person>(s, HttpStatus.CREATED);
        } else {

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product/{offset}/{pagesize}")
    public ResponseEntity<List<Person>> dndcjk(@PathVariable("offset") int offset,
            @PathVariable("pagesize") int pagesize) {
        List<Person> page = service.getc(offset, pagesize);
        if (!page.isEmpty()) {
            return new ResponseEntity<List<Person>>(page, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }

    @GetMapping("/api/product/{offset}/{pagesize}/{field}")
    public ResponseEntity<List<Person>> djkdddfjk(@PathVariable("offset") int offset,
            @PathVariable("pagesize") int pagesize, @PathVariable("field") String field) {
        List<Person> page = service.getsorted(offset, pagesize, field);
        if (!page.isEmpty()) {
            return new ResponseEntity<List<Person>>(page, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

    @GetMapping("/api/product/{productId}")
    public ResponseEntity<Person> getbyid(@PathVariable("productId") int productId) {
        Person p = service.getproduct(productId);
        if (p!=null) {
            return new ResponseEntity<Person>(p, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }

    }

}
