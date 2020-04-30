package com.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.PrestationRepository;
import com.example.models.Prestation;

@SpringBootApplication
public class BackendMedicalApplication implements CommandLineRunner{
	 @Autowired
	private PrestationRepository prestationRepository;

	public static void main(String[] args) {
		SpringApplication.run(BackendMedicalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		DateFormat df= new SimpleDateFormat("dd/MM/yyyy");
//		prestationRepository.save(new Prestation("ze","eze","fe",df.parse("02/02/3003"),"dff",12));
//		prestationRepository.save(new Prestation("ze","eze","fe",df.parse("02/02/3003"),"dff",12));

		prestationRepository.findAll().forEach(c->{
			System.out.println(c.getNom_etablissement());
		});
		
		
	}

}
