package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.models.RendezVous;

//@RepositoryRestResource
@CrossOrigin("*")
@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous, Integer>{

}
