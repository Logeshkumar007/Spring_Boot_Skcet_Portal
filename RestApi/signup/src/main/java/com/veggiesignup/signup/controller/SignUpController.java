package com.veggiesignup.signup.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.veggiesignup.signup.model.SignUp;
import com.veggiesignup.signup.service.SignUpService;

@RestController
public class SignUpController {

    @Autowired
    private SignUpService service;

   @PostMapping("/post")
    public ResponseEntity<SignUp> addData(@RequestBody SignUp signup)
    {
        if(service.addPost(signup))
        {
            return new ResponseEntity<SignUp>(signup, HttpStatus.CREATED);
        }
        else{
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/getall")
    public ResponseEntity<List<SignUp>> getList()
    {
        List<SignUp> SignUpList = service.getDetails();
        if(SignUpList.size() > 0)
        {
            return new ResponseEntity<List<SignUp>>(SignUpList, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


     @GetMapping("/getall/{userName}")
    public ResponseEntity<SignUp> getpatientById(@PathVariable String userName){
        SignUp signUp = service.getById(userName);
        if(signUp != null)
        {
            return new ResponseEntity<SignUp>(signUp, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @DeleteMapping("/delete/{userName}")
    public ResponseEntity<SignUp> deleteById(@PathVariable String userName)
    {
        if(service.deleteByName(userName)==true)
        {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestParam String userName, String password)
    {
        if(service.login(userName,password))
        {
            return new ResponseEntity<String>("Login Successfull",HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<String>("Invalid Credentials",HttpStatus.NOT_FOUND);
        }
    }



    @PutMapping("/edit")
    public ResponseEntity<String> update (@RequestParam String userName,@RequestBody SignUp signUp)
    {
        if(service.update(userName,signUp))
        {
            return new ResponseEntity<String>("Update Successfull",HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<String>("Not able to Update",HttpStatus.NOT_FOUND);
        }
    }
}
