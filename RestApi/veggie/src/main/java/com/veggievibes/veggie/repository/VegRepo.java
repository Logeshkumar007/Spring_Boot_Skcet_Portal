package com.veggievibes.veggie.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veggievibes.veggie.model.Vegetables;

@Repository
public interface VegRepo extends JpaRepository<Vegetables,Integer> {
    
}
