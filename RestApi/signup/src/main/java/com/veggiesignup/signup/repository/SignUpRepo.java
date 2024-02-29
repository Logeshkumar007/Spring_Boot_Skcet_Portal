package com.veggiesignup.signup.repository;
import com.veggiesignup.signup.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpRepo extends JpaRepository<SignUp,String>{
    
}
