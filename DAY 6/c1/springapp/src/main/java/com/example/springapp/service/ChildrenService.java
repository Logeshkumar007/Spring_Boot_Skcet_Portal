package com.example.springapp.service;



import org.springframework.data.domain.Sort;
import com.example.springapp.model.Children;
import com.example.springapp.repository.ChildrenRepo;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import org.springframework.stereotype.Service;

@Service
public class ChildrenService {
    @Autowired
    ChildrenRepo repo;
    public boolean post(Children c)
    {
        try{

            repo.save(c);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public Page<Children> get(int offset,int pagesize)
    {
          return repo.findAll(PageRequest.of(offset,pagesize));
           
        
    }
    public Page<Children> getc(int offset,int pagesize)
    {
          return repo.findAll(PageRequest.of(offset,pagesize));
           
        
    }
    public Page<Children> getsorted(int offset,int pagesize,String field)
    {
          return repo.findAll(PageRequest.of(offset,pagesize,Sort.Direction.ASC,field));
        
    }
    public List<Children> sortfield(String field)
    {
          return repo.findAll(Sort.by(field));
        
    }

}
