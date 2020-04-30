//package com.example.web;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.dao.PrestationRepository;
//import com.example.models.Prestation;
//
//@RestController
//public class PrestationRestService {
//
//	 @Autowired
//	private PrestationRepository prestationRepository;
//
//	    @RequestMapping(value="/prestations",method=RequestMethod.GET)
//	    public List<Prestation> getPrestations(){
//	    	return prestationRepository.findAll();
//	    } 
//	 
//	    @RequestMapping(value="/prestation/{id}",method=RequestMethod.GET)
//	    public Prestation getPrestation(@PathVariable Long id){
//	    	return prestationRepository.findById(id).get();
//	    }
//	    
//	    @RequestMapping(value="/prestations",method=RequestMethod.POST)
//	    public Prestation addPrestation(@RequestBody Prestation p){
//	    	return prestationRepository.save(p);
//	    }
//	    
//	    @RequestMapping(value="/prestations/{id}",method=RequestMethod.DELETE)
//	    public void deletePrestation(@PathVariable Long id){
//	    	 prestationRepository.deleteById(id);
//	    }
//	    
//	    @RequestMapping(value="/prestations/{id}",method=RequestMethod.PUT)
//	    public Prestation updatePrestation(@RequestBody Prestation p, @PathVariable Long id){
//	    	p.setId(id);
//	    	return prestationRepository.save(p);
//	    }
//	    
//	    @RequestMapping(value="/chercherPrestations",method=RequestMethod.GET)
//	    public Page<Prestation> chercherPrestation(@RequestParam(name="mc", defaultValue="")String mc,
//	    		                                   @RequestParam(name="page",defaultValue="0")int page,
//	    		                                   @RequestParam(name="size",defaultValue="5")int size){
//	    	
//	    	return prestationRepository.chercher("%"+mc+"%", PageRequest.of(page, size));
//	    }
//	 
//}
