package com.veggievibes.veggie.services;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veggievibes.veggie.model.Vegetables;
import com.veggievibes.veggie.repository.VegRepo;

@Service
public class VegService {
    
    @Autowired
    VegRepo rep;

    public List<Vegetables> getall()
    {
        return rep.findAll();
    }

    public Optional<Vegetables> getid(int id)
    {
        return rep.findById(id);
    }

    public Vegetables add(Vegetables veg)
    {
       return rep.save(veg);
    }
}
