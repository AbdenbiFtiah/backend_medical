package com.example.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.models.Mutuel;



@CrossOrigin("*")
@Repository
public interface MutuelRepository extends JpaRepository<Mutuel, Integer>{}
