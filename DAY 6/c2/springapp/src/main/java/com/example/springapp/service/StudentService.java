package com.example.springapp.service;



import org.springframework.data.domain.Sort;
import com.example.springapp.model.Student;
import com.example.springapp.repository.StudentRepo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepo repo;
    public boolean post(Student c)
    {
        try{

            repo.save(c);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    public List<Student> getc(int offset,int pagesize)
    {
          return repo.findAll(PageRequest.of(offset,pagesize)).getContent();
           
        
    }
    public List<Student> getsorted(int offset,int pagesize,String field)
    {
          return repo.findAll(PageRequest.of(offset,pagesize,Sort.by(field))).getContent();
        
    }
    public List<Student> sortfield(String field)
    {
          return repo.findAll(Sort.by(field));
        
    }

}
