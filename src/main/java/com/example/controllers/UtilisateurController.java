package com.example.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.models.Mutuel;
import com.example.models.Utilisateur;
import com.example.service.MutuelService;
import com.example.service.UtilisateurService;

import java.util.List;

@RestController
@RequestMapping("users")
@CrossOrigin("*")

public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    
    
    @GetMapping
    public ResponseEntity<List<Utilisateur>> all() {
        return ResponseEntity.ok().body(utilisateurService.getAll());
    }

  
}