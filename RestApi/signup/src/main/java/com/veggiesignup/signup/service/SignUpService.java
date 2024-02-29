package com.veggiesignup.signup.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.veggiesignup.signup.model.SignUp;
import com.veggiesignup.signup.repository.SignUpRepo;

@Service
public class SignUpService {
    @Autowired
    private SignUpRepo repo;

    @SuppressWarnings("null")
    public boolean addPost(SignUp signup)
    {
        try{
            repo.save(signup);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    public List<SignUp> getDetails()
    {
        return repo.findAll();
    }

    @SuppressWarnings("null")
    public SignUp getById(String userName)
    {
        return repo.findById(userName).orElse(null);
    }



    @SuppressWarnings("null")
    public boolean getByIdToDelete(String userName)
    {
        SignUp signUp = repo.findById(userName).orElse(null);
        if(signUp==null)
        {
            return true;
        }
        return false;
    }

    @SuppressWarnings("null")
    public boolean deleteByName(String userName)
    {
        if(getByIdToDelete(userName)==true)
        {
            return false;
        }
        repo.deleteById(userName);
        return true;
        
    }
    

   

    public boolean login(String userName,String password)
    {
        @SuppressWarnings("null")
        SignUp signUp = repo.findById(userName).orElse(null);
        String s = signUp.getPassword();

        if(s.equals(password) && signUp!=null)
        {
            return true;
        }

        else{
            return false;
        }
    }
    @SuppressWarnings("null")
    public boolean update(String userName,SignUp signUp)
    {
        if(getByIdToDelete(userName))
        {
            return false;
        }
        try
        {
            repo.save(signUp);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
}

