package com.example.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.models.Mutuel;
import com.example.service.MutuelService;

import java.util.List;

@RestController
@RequestMapping("mutuels")
public class MutuelController {

    @Autowired
    private MutuelService mutuelService;

    
    
    @GetMapping
    public ResponseEntity<List<Mutuel>> all() {
        return ResponseEntity.ok().body(mutuelService.getAll());
    }

    @GetMapping("page")
    public ResponseEntity<Page<Mutuel>> all(@PageableDefault Pageable pageable) {
        return ResponseEntity.ok().body(mutuelService.getAll(pageable));
    }

    @GetMapping("one/{id}")
    public ResponseEntity<Mutuel> byId(@PathVariable int id) {
        return ResponseEntity.ok().body(mutuelService.getOne(id));
    }

    @PostMapping
    public ResponseEntity<Mutuel> ajouter(@RequestBody Mutuel mutuel) {
        return ResponseEntity.ok().body(mutuelService.ajouter(mutuel));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mutuel> modifier(@PathVariable int id, @RequestParam String nom) {
        return ResponseEntity.ok().body(mutuelService.modifier(id, nom));
    }
}