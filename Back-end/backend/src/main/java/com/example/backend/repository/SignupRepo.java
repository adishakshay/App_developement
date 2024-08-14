package com.example.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.model.Signup;

@Repository
public interface SignupRepo extends JpaRepository<Signup,Integer>{
     Optional<Signup> findByEmail(String email);
    
}