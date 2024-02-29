package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.springapp.model.Student;
import com.example.springapp.service.StudentService;

@RestController
public class StudentController {
    @Autowired
    StudentService service;
    @PostMapping("/api/student")
    public ResponseEntity<Student> dnk(@RequestBody Student s)
    {   
        if(service.post(s))
        {
            return new ResponseEntity<Student>(s,HttpStatus.CREATED);
        }
        else{
            
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/api/student")
    public ResponseEntity<List<Student>> dndcjk(@RequestParam("pageNo") int pageNo,@RequestParam("pageSize") int pageSize)
    {
        List<Student> page=service.getc(pageNo, pageSize);
        if(!page.isEmpty())
        {
            return new ResponseEntity<List<Student>>(page,HttpStatus.OK);
            
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }
    @GetMapping("/api/student/sort")
    public ResponseEntity<List<Student>> djkdddfjk(@RequestParam("pageNo") int pageNo,@RequestParam("pageSize") int pageSize,@RequestParam("sortBy") String sortBy )
    {
        List<Student> page=service.getsorted(pageNo,pageSize,sortBy);
        if(!page.isEmpty())
        {
            return new ResponseEntity<List<Student>>(page,HttpStatus.OK);
            
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    
        }
        
    }


    
}
