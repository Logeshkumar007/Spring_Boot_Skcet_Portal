package com.examly.springapp.service;


import com.examly.springapp.model.Person;
import com.examly.springapp.repository.PersonRepo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepo repo;
    public boolean post(Person c)
    {
        try{

            repo.save(c);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public List<Person> getAll()
    {
          return repo.findAll();
           
        
    }
   
    public List<Person> getPerson(int age)
    {
          return repo.findByAge(age);
        
    }

}
