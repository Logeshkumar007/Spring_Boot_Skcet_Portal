package com.example.springapp.service;



import org.springframework.data.domain.Sort;
import com.example.springapp.model.Person;
import com.example.springapp.repository.PersonRepo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

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
    
    public List<Person> getc(int offset,int pagesize)
    {
          return repo.findAll(PageRequest.of(offset,pagesize)).getContent();
           
        
    }
    public List<Person> getsorted(int offset,int pagesize,String field)
    {
          return repo.findAll(PageRequest.of(offset,pagesize,Sort.by(field))).getContent();
        
    }
    public Person getproduct(int id)
    {
          return repo.findById(id).orElse(null);
        
    }

}
