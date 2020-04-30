package com.example.dao;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.models.Prestation;

@RepositoryRestResource
@CrossOrigin("*")
public interface PrestationRepository extends JpaRepository<Prestation, Long>{
	 
	//http://localhost:8090/prestations/search/byReference?mc=aaaaa
	 @RestResource(path="byReference")
	public List<Prestation> findByReferenceContains(@Param("mc") String mc);
		
	 
	 //http://localhost:8090/prestations/search/byReferencePage?mc=aaaaa&page=0&size=5
	 @RestResource(path="byReferencePage")
		public Page<Prestation> findByReferenceContains(@Param("mc") String mc,Pageable pageable);

}
