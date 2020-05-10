package com.example.dao;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.models.Prestation;

//@RepositoryRestResource
@CrossOrigin("*")
@Repository
public interface PrestationRepository extends JpaRepository<Prestation, Long>{
//	 
//	//http://localhost:8090/prestations/search/byReference?mc=aaaaa
//	 @RestResource(path="byReference")
//	public List<Prestation> findByReferenceContains(@Param("mc") String mc);
//		
//	 
//	 //http://localhost:8090/prestations/search/byReferencePage?mc=aaaaa&page=0&size=5
//	 @RestResource(path="byReferencePage")
//		public Page<Prestation> findByReferenceContains(@Param("mc") String mc,Pageable pageable);

}
