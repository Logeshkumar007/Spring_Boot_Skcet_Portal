package com.example.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springapp.model.Children;
import com.example.springapp.service.ChildrenService;

@RestController
public class ChildrenController {
    @Autowired
    ChildrenService service;
    @PostMapping("/api/children")
    public ResponseEntity<Children> dnk(@RequestBody Children s)
    {   
        if(service.post(s))
        {
            return new ResponseEntity<Children>(s,HttpStatus.CREATED);
        }
        else{
            
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/api/children/sortby/{field}")
    public ResponseEntity<List<Children>> cvcv(@PathVariable String field)
    {
        List<Children> page=service.sortfield(field);
        if(page.size()>0)
        {
            return new ResponseEntity<List<Children>>(page,HttpStatus.OK);
            
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }
    @GetMapping("/api/children/{offset}/{pagesize}")
    public ResponseEntity<Page<Children>> dndcjk(@PathVariable("offset") int offset,@PathVariable("pagesize") int pagesize)
    {
        Page<Children> page=service.get(offset, pagesize);
        if(!page.isEmpty())
        {
            return new ResponseEntity<Page<Children>>(page,HttpStatus.OK);
            
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        }
    }
    @GetMapping("/api/children/{offset}/{pagesize}/{field}")
    public ResponseEntity<Page<Children>> djkdddfjk(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field)
    {
        Page<Children> page=service.getsorted(offset, pagesize,field);
        if(page.getSize()>0)
        {
            return new ResponseEntity<Page<Children>>(page,HttpStatus.OK);
            
        }
        else
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    
        }
        
    }
}
