package com.example.dao;



import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.models.Mutuel;
import com.example.models.Utilisateur;



@CrossOrigin("*")
@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer>{}
